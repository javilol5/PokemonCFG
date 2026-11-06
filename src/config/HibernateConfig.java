package config;

import model.Pokedex;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConfig {

    private static StandardServiceRegistry standardServiceRegistry;
    private static SessionFactory sessionFactory;

    static {
        try {
            StandardServiceRegistryBuilder registryBuilder =
                    new StandardServiceRegistryBuilder().configure("resources/properties.xml");

            applyEnvironmentSetting(registryBuilder, "POKEDEX_DB_URL", "hibernate.connection.url");
            applyEnvironmentSetting(registryBuilder, "POKEDEX_DB_USER", "hibernate.connection.username");
            applyEnvironmentSetting(registryBuilder, "POKEDEX_DB_PASSWORD", "hibernate.connection.password");

            standardServiceRegistry = registryBuilder.build();

            MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
            metadataSources.addAnnotatedClass(Pokedex.class);

            Metadata metadata = metadataSources.getMetadataBuilder().build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        } catch (Exception e) {
            if (standardServiceRegistry != null) {
                StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            }
            String message = "No se pudo inicializar Hibernate. Comprueba que PostgreSQL esté accesible y "
                    + "configura POKEDEX_DB_URL (actualmente: "
                    + System.getenv().getOrDefault(
                            "POKEDEX_DB_URL", "jdbc:postgresql://10.0.9.226:5432/probas")
                    + ").";
            throw new ExceptionInInitializerError(new IllegalStateException(message, e));
        }
    }

    private static void applyEnvironmentSetting(
            StandardServiceRegistryBuilder builder, String environmentVariable, String setting) {
        String value = System.getenv(environmentVariable);
        if (value != null && !value.isBlank()) {
            builder.applySetting(setting, value);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
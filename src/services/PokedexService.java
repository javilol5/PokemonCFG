package services;


import config.HibernateConfig;
import model.Pokedex;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PokedexService {

    //CREATE
    public void create(int id, String nome, double peso, String misc) {

        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Pokedex px = new Pokedex();

            px.setId((long) id);
            px.setNome(nome);
            px.setPeso(peso);
            px.setMisc(misc);

            session.save(px);
            transaction.commit();
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    //READ
    public void read() {

        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            List<Pokedex> listaPokedex = session.createQuery("FROM Pokedex", Pokedex.class).list();

            for (Pokedex px : listaPokedex) {
                System.out.println("ID: " + px.getId() +
                        ", Nombre: " + px.getNome() +
                        ", Peso: " + px.getPeso() +
                        ", Misc: " + px.getMisc());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //UPDATE
    public void update() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {

            Transaction transaction = session.beginTransaction();

            Pokedex px = session.get(Pokedex.class, (long) id);

            if (px != null) {
                px.setNome(nome);
                px.setPeso(peso);
                px.setMisc(misc);

                session.update(px);
            }

            transaction.commit();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // DELETE
    public void delete() {

        try (Session session = HibernateConfig.getSessionFactory().openSession()) {

            Transaction transaction = session.beginTransaction();

            session.createQuery("DELETE FROM Pokedex").executeUpdate();

            transaction.commit();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
}
import services.PokedexService;

public class Main {


    public static void main(String[] args) {

        //1

        PokedexService pokeSer = new PokedexService();

        //Inserir 10 pokemons en la tabla pokedex

        pokeSer.create(1, "Pikachu", 25, "El raton electrico");
        pokeSer.create(2, "Bulbasaur", 1, "El pokemon planta");
        pokeSer.create(3, "Charmander", 4, "El pokemon fuego");
        pokeSer.create(4, "Squirtle", 7, "El pokemon agua");
        pokeSer.create(5, "Jigglypuff", 39, "El pokemon hada");
        pokeSer.create(6, "Meowth", 52, "El gato salvaje");
        pokeSer.create(7, "Psyduck", 54, "El pokemon agua");
        pokeSer.create(8, "Mankey", 56, "El pokemon primate");
        pokeSer.create(9, "Growlithe", 58, "El pokemon perro");
        pokeSer.create(10, "Poliwag", 60, "El pokemon agua");

        //Listar pokemons na pokedex

        pokeSer.read();


        //Modificar duas entradas na pokedex
        //Listar pokemons na pokedex
        //Eliminar tódo-los pokemons na pokedex

        //2

        //Inserir 10 pokemons en la tabla pokedex
        //Inserir 2 adestradores na taboa adestrador
        //Listar pokemons na pokedex
        //Listar adestradores
        //Modificar dous adestradores
        //Modificar duas entradas na pokedex
        //Listar pokemons na pokedex
        //Listar adestradores
        //(toXML pokemons)
        //(toXML adestradores)
        //Eliminar tódo-los datos das táboas

        //3

        //Inserir 10 pokemons en la tabla pokedex
        //Inserir 2 adestradores na taboa adestrador
        //Inserir 12 pokemons na taboa de pokemon (6 para cada adestrador)
        //Listar pokemons na pokedex
        //Listar adestradores
        //Listar pokemons na táboa pokemon
        //Exportar nun arquivo duas entradas da pokedex serializadas
        //Exportar en XML duas entradas de adestrador
        //Modificar duas entradas na pokedex (as mesmas serializadas)
        //Modificar dous adestradores(os mesmos exportados a xml)
        //Modificar 4 pokemons
        //Listar pokemons na pokedex
        //Listar adestradores
        //Listar pokemons na táboa pokemon
        //Importar os datos serializados
        //Modifica-las entradas da pokédex coos datos serializados (de xeito que queden igual
        //que despois do primeiro insert)
        //Importar os datos xml
        //Modifica-las entradas de adestradores coos datos do arquivo (de xeito que queden
        //igual que despois do primeiro insert)
        //Lista-los datos das táboas
        //Eliminar tódo-los datos das táboas



    }
}
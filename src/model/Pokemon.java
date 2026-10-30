package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Pokemon implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id;
    private String nome;
    private LocalDate nacemento;
    private int pokedexEntry;
    private int destrador;

    public Pokemon(String nome, LocalDate nacemento, int pokedexEntry, int destrador) {
        this.nome = nome;
        this.nacemento = nacemento;
        this.pokedexEntry = pokedexEntry;
        this.destrador = destrador;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                " | Nome: " + nome +
                " | Nacemento: " + nacemento +
                " | Ookedex Entry: " + pokedexEntry +
                " | Destrador: " + destrador;
    }
}

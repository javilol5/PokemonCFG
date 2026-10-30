package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Adestrador implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id;
    private String nome;
    private LocalDate nacemento;

    public Adestrador(String nome, LocalDate nacemento) {
        this.nome = nome;
        this.nacemento = nacemento;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                " | Nome: " + nome +
                " | Nacemento: " + nacemento;
    }
}

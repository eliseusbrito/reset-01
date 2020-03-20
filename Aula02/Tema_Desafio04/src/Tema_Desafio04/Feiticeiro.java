package Tema_Desafio04;

import java.text.DecimalFormat;

public class Feiticeiro extends Arcano{

    DecimalFormat df = new DecimalFormat("0.00");

    protected Feiticeiro(String nome, double vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);

    }

    public Feiticeiro(String nome, double vida, double ataque, double defesa, int mana, Magia magia) {
        super(nome, vida, ataque, defesa, mana, magia);
    }
}

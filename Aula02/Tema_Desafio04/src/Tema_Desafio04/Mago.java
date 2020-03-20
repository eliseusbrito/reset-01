package Tema_Desafio04;

import java.text.DecimalFormat;

public class Mago extends Arcano{

    DecimalFormat df = new DecimalFormat("0.00");

    protected Mago(String nome, double vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }

    public Mago(String nome, double vida, double ataque, double defesa, int mana, Magia magia) {
        super(nome, vida, ataque, defesa, mana, magia);
    }
}


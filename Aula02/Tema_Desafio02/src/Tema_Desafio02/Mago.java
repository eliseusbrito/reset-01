package Tema_Desafio02;

import java.text.DecimalFormat;

public class Mago extends Arcano{

    DecimalFormat df = new DecimalFormat("0.00");

    protected Mago(String nome, int vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }


}


package Tema_Desafio01;

import java.text.DecimalFormat;

public class Clerigo extends Sacerdote{

    DecimalFormat df = new DecimalFormat("0.00");

    protected Clerigo(String nome, int vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa, fe);
    }
}

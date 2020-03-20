package Tema_Desafio04;

import java.text.DecimalFormat;

public class Clerigo extends Sacerdote{

    DecimalFormat df = new DecimalFormat("0.00");

    protected Clerigo(String nome, double vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa, fe);
    }

    public Clerigo(String nome, double vida, double ataque, double defesa, int fe, PoderDivino poderDivino) {
        super(nome, vida, ataque, defesa, fe, poderDivino);
    }
}

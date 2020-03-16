package Tema_Desafio01;

import java.text.DecimalFormat;

public class Mago extends Arcano{

    DecimalFormat df = new DecimalFormat("0.00");

    public Mago(String nome, int vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }

/*
    static void imprimeMB() {
        System.out.println("   Saldos: " + mago.nome + " -> Vida: " + mago.vida + "  Mana: " + mago.mana
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);}
    static void imprimeMC() {
        System.out.println("   Saldos: "+mago.nome+" -> Vida: "+mago.vida+"  Mana: "+mago.mana
                +"  &  "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe);}
*/

}


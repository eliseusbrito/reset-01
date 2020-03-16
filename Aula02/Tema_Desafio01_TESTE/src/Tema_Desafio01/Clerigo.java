package Tema_Desafio01;

import java.text.DecimalFormat;

public class Clerigo extends Sacerdote{

    DecimalFormat df = new DecimalFormat("0.00");

    public Clerigo(String nome, int vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa, fe);
    }

/*
    static void imprimeCF() {
        System.out.println("   Saldos: "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe
                +"  &  "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"  Mana: "+feiticeiro.mana);}

    static void imprimeCM() {
        System.out.println("   Saldos: "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe
                +"  &  "+mago.nome+" -> Vida: "+mago.vida+"  Mana: "+mago.mana);}
*/

}

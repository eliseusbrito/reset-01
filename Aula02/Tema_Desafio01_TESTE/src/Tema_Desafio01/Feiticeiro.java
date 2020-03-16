package Tema_Desafio01;

import java.text.DecimalFormat;

public class Feiticeiro extends Arcano{

    DecimalFormat df = new DecimalFormat("0.00");

    public Feiticeiro(String nome, int vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }

/*
    static void imprimeFB() {
        System.out.println("   Saldos: "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"  Mana: "+feiticeiro.mana
                +"  &  "+barbaro.nome+" -> Vida: "+barbaro.vida);    }

    static void imprimeFM() {
        System.out.println("   Saldos: "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"  Mana: "+feiticeiro.mana
                +"  &  "+mago.nome+" -> Vida: "+mago.vida+"  Mana: "+mago.mana);   }

    static void imprimeFC() {
        System.out.println("   Saldos: "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"  Mana: "+feiticeiro.mana
                +"  &  "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe);    }

    static void imprimeFG() {
        System.out.println("   Saldos: "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"   Mana: "+feiticeiro.mana
                +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);       }
*/

}

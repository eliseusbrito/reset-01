package Tema_Desafio01;

import java.text.DecimalFormat;

public class Guerreiro extends HomemDeArma {
    DecimalFormat df = new DecimalFormat("0.00");

    public Guerreiro(String nome, int vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
        }

/*
    static void imprimeGB() {
        System.out.println("   Saldos: " + guerreiro.nome + " -> Vida: " + guerreiro.vida
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);
  //            System.out.println("   Saldos: " + this.nome + " -> Vida: " + vida
  //                  + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);

        //System.out.println("Nome: " + nome + " | Vida: " + this.vida);
               System.out.println("imprimeGB");
    }
    static void imprimeGC() {
        System.out.println("   Saldos: " + guerreiro.nome + " -> Vida: " + guerreiro.vida
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);    }

    static void imprimeGD() {
        System.out.println("   Saldos: "+guerreiro.nome+" -> Vida: "+guerreiro.vida
                +"  &  "+druida.nome+" -> Vida: "+druida.vida+"  Fé: "+druida.fe);    }
*/




}

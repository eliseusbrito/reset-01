package TemaImpPorClass;

import java.text.DecimalFormat;

import static TemaImpPorClass.Application.*;


public class Guerreiro extends Personagens {
    Armas armas;
    DecimalFormat df = new DecimalFormat("0.00");
//    static Guerreiro guerreiro;
//    static Barbaro barbaro;

    public Guerreiro(String nome, int vida, double ataque, double defesa, Armas armas) {
         this.nome = nome;
         this.vida = vida;
         this.ataque = ataque;
         this.defesa = defesa;
         this.armas = armas;
     }
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




}

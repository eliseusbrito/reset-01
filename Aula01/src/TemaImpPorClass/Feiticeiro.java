package TemaImpPorClass;

import java.text.DecimalFormat;

import static TemaImpPorClass.Application.*;

public class Feiticeiro extends Personagens{

    int mana = 50;
    Magias magias;
    DecimalFormat df = new DecimalFormat("0.00");
    double dano;

    public Feiticeiro(String nome, int vida, double ataque, double defesa, Magias magias) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magias = magias;
    }
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

}

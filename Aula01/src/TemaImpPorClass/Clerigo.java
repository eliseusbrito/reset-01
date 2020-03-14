package TemaImpPorClass;

import java.text.DecimalFormat;

import static TemaImpPorClass.Application.*;

public class Clerigo extends Personagens{
    int fe=50;
    PoderesDivinos poderesDivinos;
    DecimalFormat df = new DecimalFormat("0.00");

    public Clerigo(String nome, int vida, double ataque, double defesa, PoderesDivinos poderesDivinos) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.poderesDivinos = poderesDivinos;
    }
    static void imprimeCF() {
        System.out.println("   Saldos: "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe
                +"  &  "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"  Mana: "+feiticeiro.mana);}

    static void imprimeCM() {
        System.out.println("   Saldos: "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe
                +"  &  "+mago.nome+" -> Vida: "+mago.vida+"  Mana: "+mago.mana);}

}

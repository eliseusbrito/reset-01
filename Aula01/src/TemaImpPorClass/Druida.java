package TemaImpPorClass;

import java.text.DecimalFormat;

import static TemaImpPorClass.Application.*;

public class Druida extends Personagens{

    int fe = 50;
    PoderesDivinos poderesDivinos;
    DecimalFormat df = new DecimalFormat("0.00");

    public Druida(String nome, int vida, double ataque, double defesa, PoderesDivinos poderesDivinos) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.poderesDivinos= poderesDivinos;
    }
    static void imprimeDB() {
        System.out.println("   Saldos: " + druida.nome + " -> Vida: " + druida.vida + "  Fé: " + druida.fe
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);}

    static void imprimeDG() {
        System.out.println("   Saldos: "+druida.nome+" -> Vida: "+druida.vida+"  Fé: "+druida.fe
                +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);}

}

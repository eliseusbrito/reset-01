package TemaImpPorClass;

import java.text.DecimalFormat;

import static TemaImpPorClass.Application.*;

public class Mago extends Personagens{

    int mana = 50;
    Magias magias;
    Armas armas;
    PoderesDivinos poderesDivinos;
    DecimalFormat df = new DecimalFormat("0.00");
    double dano;

    public Mago(String nome, int vida, double ataque, double defesa, Magias magias) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magias = magias;
        }

    static void imprimeMB() {
        System.out.println("   Saldos: " + mago.nome + " -> Vida: " + mago.vida + "  Mana: " + mago.mana
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);}
    static void imprimeMC() {
        System.out.println("   Saldos: "+mago.nome+" -> Vida: "+mago.vida+"  Mana: "+mago.mana
                +"  &  "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe);}

}


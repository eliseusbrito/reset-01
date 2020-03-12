package TemaMelhorado;

import java.text.DecimalFormat;

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
}

package TemaMelhorado;

import java.text.DecimalFormat;

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

}

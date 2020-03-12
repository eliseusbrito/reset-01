package TemaMelhorado;

import java.text.DecimalFormat;

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

}

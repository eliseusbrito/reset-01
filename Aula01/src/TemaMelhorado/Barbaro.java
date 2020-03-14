package TemaMelhorado;

import java.text.DecimalFormat;

public class Barbaro extends Personagens{
        Armas armas;
        PoderesDivinos poderesDivinos;
        Magias  magias;
        DecimalFormat df = new DecimalFormat("0.00");

    public Barbaro(String nome, int vida, double ataque, double defesa, Armas armas) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.armas = armas;
            }
    }

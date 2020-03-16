package Tema_Desafio01;

import java.text.DecimalFormat;

public class Personagem {
    String nome;
    int vida;
    double ataque;
    double defesa;

    DecimalFormat df = new DecimalFormat("0.00");

    public Personagem(String nome, int vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public double calcularDano(double defesa, double poder){
           return ataque * poder - defesa;
        }

    void registrar(String nomeAlvo, String habilidade, double dano) {
        System.out.println(nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + dano + " de dano");
    }

}


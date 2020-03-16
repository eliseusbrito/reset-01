package Tema_Desafio01;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personagem {
    String nome;
    int vida;
    double ataque;
    double defesa;

    DecimalFormat df = new DecimalFormat("0.00");

    public Personagem() {
    }

    public Personagem(String nome, int vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    void registrar(String nomeAlvo, String habilidade, double dano) {
        System.out.println(nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + dano + " de dano");
    }
}



package Tema_Desafio04;

import java.text.DecimalFormat;

public class Personagem {
    protected String nome;
    protected double vida;
    protected double ataque;
    protected double defesa;

    DecimalFormat df = new DecimalFormat("0.00");

    public Personagem() {
    }

    protected Personagem(String nome, double vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    void registrar(String nomeAlvo, String habilidade, double dano) {
        System.out.println(nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + dano + " de dano");
    }


}



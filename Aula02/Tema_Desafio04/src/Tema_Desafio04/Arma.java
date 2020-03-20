package Tema_Desafio04;

public class Arma {
    protected String nome;
    protected double poder;

    protected Arma(String nome, double poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public double getPoder() {
        return poder;
    }
}

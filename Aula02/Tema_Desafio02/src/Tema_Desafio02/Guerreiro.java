package Tema_Desafio02;

import java.text.DecimalFormat;

public class Guerreiro extends HomemDeArma {
    DecimalFormat df = new DecimalFormat("0.00");

    protected Guerreiro(String nome, int vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
        }



}

package Tema_Desafio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Guerreiro extends HomemDeArma {
    DecimalFormat df = new DecimalFormat("0.00");

    public Guerreiro(String nome, double vida, double ataque, double defesa, Arma arma) {
        super(nome, vida, ataque, defesa, arma);
    }


}

package Tema_Desafio01;
import java.text.DecimalFormat;

public class Barbaro extends HomemDeArma{

        DecimalFormat df = new DecimalFormat("0.00");

    protected Barbaro(String nome, int vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
    }

 }



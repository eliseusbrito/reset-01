package Tema_Desafio01;

import java.text.DecimalFormat;

public class Druida extends Sacerdote{

    DecimalFormat df = new DecimalFormat("0.00");

    public Druida(String nome, int vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa, fe);
    }

/*
    static void imprimeDB() {
        System.out.println("   Saldos: " + druida.nome + " -> Vida: " + druida.vida + "  Fé: " + druida.fe
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);}

    static void imprimeDG() {
        System.out.println("   Saldos: "+druida.nome+" -> Vida: "+druida.vida+"  Fé: "+druida.fe
                +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);}
*/

}

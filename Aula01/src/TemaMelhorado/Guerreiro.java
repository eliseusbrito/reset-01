package TemaMelhorado;

import java.text.DecimalFormat;

public class Guerreiro extends Personagens {
    Armas armas;
    DecimalFormat df = new DecimalFormat("0.00");
    static Guerreiro guerreiro;
    static Barbaro barbaro;

    public Guerreiro(String nome, int vida, double ataque, double defesa, Armas armas) {
         this.nome = nome;
         this.vida = vida;
         this.ataque = ataque;
         this.defesa = defesa;
         this.armas = armas;
     }


}

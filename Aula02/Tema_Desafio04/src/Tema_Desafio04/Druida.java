package Tema_Desafio04;

public class Druida extends Sacerdote{

    protected Druida(String nome, double vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa, fe);
    }

    public Druida(String nome, double vida, double ataque, double defesa, int fe, PoderDivino poderDivino) {
        super(nome, vida, ataque, defesa, fe, poderDivino);
    }
}


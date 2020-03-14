package TemaImpPorClass;
import java.text.DecimalFormat;
import static TemaImpPorClass.Application.*;

public class Barbaro extends Personagens{
        Armas armas;
        PoderesDivinos poderesDivinos;
        Magias  magias;
        DecimalFormat df = new DecimalFormat("0.00");

    public Barbaro(String nome, int vida, double ataque, double defesa, Armas armas) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.armas = armas;
            }

    static void imprimeBD() {
        System.out.println("   Saldos: " + barbaro.nome + " -> Vida: " + barbaro.vida
                + "  &  " + druida.nome + " -> Vida: " + druida.vida + "  Fé: " + barbaro.fe);    }

    static void imprimeBG() {
        System.out.println("   Saldos: " + barbaro.nome + " -> Vida: " + barbaro.vida
                + "  &  " + guerreiro.nome + " -> Vida: " + guerreiro.vida);    }

    static void imprimeBB() {
        System.out.println("   Saldos: " + barbaro.nome + " -> Vida: " + barbaro.vida
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);}




}



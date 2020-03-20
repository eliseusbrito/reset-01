package Tema_Desafio04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static Tema_Desafio04.Application.*;

public class HomemDeArma extends Personagem {

    protected Arma arma;

    //protected HomemDeArma(String nome, double vida, double ataque, double defesa) {
   //     super(nome, vida, ataque, defesa);
   //   }

    public HomemDeArma(String nome, double vida, double ataque, double defesa, Arma arma) {
        super(nome, vida, ataque, defesa);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void atacarArmas(Personagem alvo) {
        String qwert = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSS"));
        if (tipoimpr == 2){if(vida<=0){System.out.println("["+qwert+"] "+ "Um personagem morto atacou e ataque será ignorado. "
                +nome + " atacou " + alvo.nome + " com " + arma.nome+" sem causar danos.");
            return;}}//Ataques de personagens mortos devem ser ignorados
        if(vida<=0){imp.getListaImpress().add("["+qwert+"] "+ "Um personagem morto atacou e ataque será ignorado. "
                +nome + " atacou " + alvo.nome + " com " + arma.nome+" sem causar danos.");
            return;}//Ataques de personagens mortos devem ser ignorados

        double dano = calcularDano(alvo.defesa, arma.poder);
        double vidaAnterior =  alvo.vida;
        alvo.vida = alvo.vida - dano;

        if (tipoimpr == 2){if(alvo.vida<=0 && vidaAnterior>0){System.out.print("["+qwert+"] "+ alvo.nome+" morreu no ataque!!! ");}}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(alvo.vida<=0 && vidaAnterior>0){imp.getListaImpress().add("["+qwert+"] "+ alvo.nome+" morreu no ataque!!! Detalhes na próxima linha");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque

        if (tipoimpr == 2){if(alvo.vida<0 && vidaAnterior<=0){
            System.out.print("["+qwert+"] "+ "Um personagem morto foi atacado("+alvo.nome+")!!!  ");}}//Personagens mortos podem ser atacados normalmente
        if(alvo.vida<0 && vidaAnterior<=0){
            imp.getListaImpress().add("["+qwert+"] "+ "Um personagem morto foi atacado("+alvo.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente

        if (tipoimpr == 2){System.out.println( "["+qwert+"] "+ nome + " atacou " + alvo.nome + " com " + arma.nome
                + " causando " + df.format(dano) + " de dano");}
        imp.getListaImpress().add("["+qwert+"] "+nome + " atacou " + alvo.nome + " com " + arma.nome
                + " causando " + df.format(dano) + " de dano");

        if (tipoimpr == 2){System.out.println("     Saldos: " + nome + " -> Vida: " + vida
                + "  &  " + alvo.nome + " -> Vida: " + alvo.vida);}
    }

}

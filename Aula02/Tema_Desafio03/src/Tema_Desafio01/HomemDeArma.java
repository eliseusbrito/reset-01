package Tema_Desafio01;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static Tema_Desafio01.Application.*;
import static Tema_Desafio01.Impress.impre;

public class HomemDeArma extends Personagem {

    protected HomemDeArma(String nome, int vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
      }

    public void atacarArmas(Personagem alvo, Arma arma) {

        if(vida<=0){System.out.println("Um personagem morto atacou e ataque será ignorado. "
                +nome + " atacou " + alvo.nome + " com " + arma.nome+" sem causar danos.");
            return;}//Ataques de personagens mortos devem ser ignoraos
/*
        if(vida<=0){
            listaImpress.add(new String ("Um personagem morto atacou e ataque será ignorado. "+nome + " atacou "+ alvo.nome + " com " + arma.nome+" sem causar danos."));
        }
*/
        double dano = calcularDano(alvo.defesa, arma.poder);
        alvo.vida = alvo.vida - 1;
        if(alvo.vida==0){System.out.print(alvo.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(alvo.vida<0){
            System.out.print("Um personagem morto foi atacado("+alvo.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente

       // String dataFormatada = evento.getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(nome + " atacou " + alvo.nome + " com " + arma.nome
                + " causando " + df.format(dano) + " de dano");

       // System.out.println(dataFormatada + " " +nome + " atacou " + alvo.nome + " com " + arma.nome
       //         + " causando " + df.format(dano) + " de dano");
      //impre();
        //System.out.println(imp.getListaImpress().get(0));//deu erro 18/03 09:37
        imp.getListaImpress().add(new String("Adicionou item dentro da classe Homem de arma"));//deu erro 18/03 09:37
        //imp.getListaImpress().add("sem new String Adicionou item dentro da classe Homem de arma");//deu erro 18/03 09:40

        //imp.getListaImpress().add(new String (nome + " atacou " + alvo.nome + " com " + arma.nome
        //        + " causando " + df.format(dano) + " de dano"));//deu erro 18/03 09:41

        //imp.getListaImpress().add(nome + " atacou " + alvo.nome + " com " + arma.nome
        //        + " causando " + df.format(dano) + " de dano");//deu erro 18/03 09:41

       // imp.getListaImpress().add("texto dentro da classe onde foi criado a lista");/deu erro 18/03 09:45

       // imp.getListaImpress().add(0,"texto dentro da classe onde foi criado a lista");//deu erro 18/03 09:46

/*
        if (tipoimpr == 2){System.out.println("     Saldos: " + nome + " -> Vida: " + vida
                + "  &  " + alvo.nome + " -> Vida: " + alvo.vida);}
*/


        System.out.println(imp.getListaImpress().get(0));
        System.out.println(imp.getListaImpress().get(1));


    }
}

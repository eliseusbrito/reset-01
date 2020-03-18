package Tema_Desafio01;

import static Tema_Desafio01.Application.tipoimpr;

public class HomemDeArma extends Personagem {
    protected HomemDeArma(String nome, int vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
      }
    public void atacarArmas(Personagem alvo, Arma arma) {
        //int x = 2;
        if(vida<=0){System.out.println("Um personagem morto atacou e ataque será ignorado. "
                +nome + " atacou " + alvo.nome + " com " + arma.nome+" sem causar danos.");
            return;}//Ataques de personagens mortos devem ser ignoraos
        double dano = calcularDano(alvo.defesa, arma.poder);
        alvo.vida = alvo.vida - 1;
        if(alvo.vida==0){System.out.print(alvo.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(alvo.vida<0){
            System.out.print("Um personagem morto foi atacado("+alvo.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        System.out.println(nome + " atacou " + alvo.nome + " com " + arma.nome
                + " causando " + df.format(dano) + " de dano");
        if (tipoimpr == 2){System.out.println("     Saldos: " + nome + " -> Vida: " + vida
                + "  &  " + alvo.nome + " -> Vida: " + alvo.vida);}
    }
}

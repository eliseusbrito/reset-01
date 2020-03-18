package Tema_Desafio01;

import static Tema_Desafio01.Application.tipoimpr;

public class Sacerdote extends Personagem {

    int fe;
    protected Sacerdote(String nome, int vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public void atacarPoderesDivinos(Personagem alvo, PoderDivino poderDivino) {
        if(vida<=0){System.out.println("Um personagem morto atacou e ataque será ignorado. "+
                nome + " atacou " + alvo.nome + " com " + poderDivino.nome
                + " sem causar danos");
            return;}
        double dano = calcularDano(alvo.defesa, poderDivino.poder);
        if(fe>0){alvo.vida = alvo.vida - 1;}
        fe = fe-poderDivino.custoDeFe;
        if(alvo.vida==0 && fe>0){System.out.print(alvo.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(alvo.vida<0){
            System.out.print("Um personagem morto foi atacado("+alvo.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(fe>0){
            System.out.println(nome + " atacou " + alvo.nome + " com " + poderDivino.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + alvo.nome + " com " + poderDivino.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }
        if (tipoimpr == 2){System.out.println("     Saldos: " + nome + " -> Vida: " + vida+" -> Fé: "+fe
                + "  &  " + alvo.nome + " -> Vida: " + alvo.vida);}
    }
}



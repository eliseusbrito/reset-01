package Tema_Desafio02;

import static Tema_Desafio02.Application.tipoimpr;

public class Arcano extends Personagem {
    int mana;
    protected Arcano(String nome, int vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }
    public int getMana() {
        return mana;
    }

    public void atacarMagias(Personagem alvo, Magia magia) {
        if(vida<=0){System.out.println("Um personagem morto atacou e ataque será ignorado. "+
                nome + " atacou " + alvo.nome + " com " + magia.nome
                + " sem causar danos");
            return;}
        double dano = calcularDano(alvo.defesa,magia.poder);
        if(mana>0){alvo.vida = alvo.vida - 1;}
        mana = mana - magia.custoDeMana;
        if(alvo.vida==0 && mana>0){System.out.print(alvo.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(alvo.vida<0){
            System.out.print("Um personagem morto foi atacado("+alvo.nome+")!!!  " );}//Personagens mortos podem ser atacados normalmente
        if(mana>0){
            System.out.println(nome + " atacou " + alvo.nome + " com " + magia.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + alvo.nome + " com " + magia.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }
        if (tipoimpr == 2){System.out.println("     Saldos: " + nome + " -> Vida: " + vida+" -> Mana: "+mana
                + "  &  " + alvo.nome + " -> Vida: " + alvo.vida);}
    }
}

package Tema;

import java.text.DecimalFormat;

public class Mago {
    String nome;
    int vida;
    double ataque;
    double defesa;
    int mana = 50;
    Magias magias;
    DecimalFormat df = new DecimalFormat("0.00");
    double dano;

    public Mago(String nome, int vida, double ataque, double defesa, Magias magias) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magias = magias;
    }

    public void atacar(Barbaro barbaro, Magias magias) {
        if(vida<=0){System.out.print("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + barbaro.nome + " com " + barbaro.nome
                + " sem causar danos");
            return;}
        double ataqueFinal = magias.poder * ataque;
        dano = ataqueFinal - barbaro.defesa;
        if(mana>0){barbaro.vida = barbaro.vida - 1;}
        mana = mana - magias.custoDeMana;
        if(barbaro.vida==0 && mana>0){System.out.print(barbaro.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(barbaro.vida<0){
            System.out.print("Um personagem morto foi atacado("+barbaro.nome+")!!!  " );}//Personagens mortos podem ser atacados normalmente
        if(mana>0){
            System.out.println(nome + " atacou " + barbaro.nome + " com " + magias.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + barbaro.nome + " com " + magias.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }
        }

    public void atacar(Clerigo clerigo, Magias magias) {
        if(vida<=0){System.out.print("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + clerigo.nome + " com " + clerigo.nome
                + " sem causar danos");
            return;}
        double ataqueFinal = magias.poder * ataque;
        double dano = ataqueFinal - clerigo.defesa;
        if(mana>0){clerigo.vida = clerigo.vida - 1;}
        mana = mana - magias.custoDeMana;
        if(clerigo.vida==0 && mana>0){System.out.print(clerigo.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(clerigo.vida<0){
            System.out.print("Um personagem morto foi atacado("+clerigo.nome+")!!!  " );}//Personagens mortos podem ser atacados normalmente
        if(mana>0){
            System.out.println(nome + " atacou " + clerigo.nome + " com " + magias.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + clerigo.nome + " com " + magias.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }
    }

    public void atacar(Guerreiro guerreiro, Magias magias) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + guerreiro.nome + " com " + magias.nome
                + " sem causar danos");
            return;}
        double ataqueFinal = magias.poder * ataque;
        double dano = ataqueFinal - guerreiro.defesa;
        if(mana>0){guerreiro.vida = guerreiro.vida - 1;}
        if(guerreiro.vida==0 && mana>0){System.out.print(guerreiro.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(guerreiro.vida<0){
            System.out.print("Um personagem morto foi atacado("+guerreiro.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(mana>0){
            System.out.println(nome + " atacou " + guerreiro.nome + " com " + magias.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + guerreiro.nome + " com " + magias.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }
    }

    public void atacar(Mago mago, Magias magias) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + mago.nome + " com " + magias.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = magias.poder* ataque;
        double dano = ataqueFinal - mago.defesa;
        if(mana>0){mago.vida = mago.vida - 1;}
        if(mago.vida==0 && mana>0){System.out.print(mago.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(mago.vida<0){
            System.out.print("Um personagem morto foi atacado(\"+druida.nome+\")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(mana>0){
            System.out.println(nome + " atacou " + mago.nome + " com " + magias.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + mago.nome + " com " + magias.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }
    }

    public void atacar(Feiticeiro feiticeiro, Magias magias) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + feiticeiro.nome + " com " + magias.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = magias.poder* ataque;
        double dano = ataqueFinal - feiticeiro.defesa;
        if(mana>0){feiticeiro.vida = feiticeiro.vida - 1;}
        if(feiticeiro.vida==0 && mana>0){System.out.print(feiticeiro.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(feiticeiro.vida<0){
            System.out.print("Um personagem morto foi atacado("+feiticeiro.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(mana>0){
            System.out.println(nome + " atacou " + feiticeiro.nome + " com " + magias.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + feiticeiro.nome + " com " + magias.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }
    }

    public void atacar(Druida druida, Magias magias) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + druida.nome + " com " + magias.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = magias.poder* ataque;
        double dano = ataqueFinal - druida.defesa;
        if(mana>0){druida.vida = druida.vida - 1;}
        if(druida.vida==0 && mana>0){System.out.print(druida.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(druida.vida<0){
            System.out.print("Um personagem morto foi atacado("+druida.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(mana>0){
            System.out.println(nome + " atacou " + druida.nome + " com " + magias.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + druida.nome + " com " + magias.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }
    }



}

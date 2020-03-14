package Tema;

import java.text.DecimalFormat;

public class Druida {
    String nome;
    int vida;
    double ataque;
    double defesa;
    int fe = 50;
    PoderesDivinos poderesDivinos;
    DecimalFormat df = new DecimalFormat("0.00");

    public Druida(String nome, int vida, double ataque, double defesa, PoderesDivinos poderesDivinos) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.poderesDivinos= poderesDivinos;
    }

    public void atacar(Barbaro barbaro, PoderesDivinos poderesDivinos ) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + barbaro.nome + " com " + poderesDivinos.nome
                + " sem causar danos");
            return;}
        double ataqueFinal = poderesDivinos.intensidade * ataque;
        double dano = ataqueFinal - barbaro.defesa;
        if(fe>0){barbaro.vida = barbaro.vida - 1;}
        fe = fe-poderesDivinos.custoDeFe;
        if(barbaro.vida==0 && fe>0){System.out.print(barbaro.nome+" morreu no ataque!!! ");}
        if(barbaro.vida<0){
            System.out.print("Um personagem morto foi atacado("+barbaro.nome+")!!!  ");}
        if(fe>0){
            System.out.println(nome + " atacou " + barbaro.nome + " com " + poderesDivinos.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + barbaro.nome + " com " + poderesDivinos.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }
    }

    public void atacar(Guerreiro guerreiro, PoderesDivinos poderesDivinos) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + guerreiro.nome + " com " + poderesDivinos.nome
                + " sem causar danos");
            return;}
        double ataqueFinal = poderesDivinos.intensidade * ataque;
        double dano = ataqueFinal - guerreiro.defesa;
        if(fe>0){guerreiro.vida = guerreiro.vida - 1;}
        fe = fe-poderesDivinos.custoDeFe;
        if(guerreiro.vida==0 && fe>0){System.out.print(guerreiro.nome+" morreu no ataque!!! ");}
        if(guerreiro.vida<0){
            System.out.print("Um personagem morto foi atacado("+guerreiro.nome+")!!!  ");}
        if(fe>0){
            System.out.println(nome + " atacou " + guerreiro.nome + " com " + poderesDivinos.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + guerreiro.nome + " com " + poderesDivinos.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }
    }

    public void atacar(Mago mago, PoderesDivinos poderesDivinos) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + mago.nome + " com " + poderesDivinos.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = poderesDivinos.intensidade* ataque;
        double dano = ataqueFinal - mago.defesa;
        if(fe>0){mago.vida = mago.vida - 1;}
        if(mago.vida==0 && fe>0){System.out.print(mago.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(mago.vida<0){
            System.out.print("Um personagem morto foi atacado("+mago.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(fe>0){
            System.out.println(nome + " atacou " + mago.nome + " com " + poderesDivinos.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + mago.nome + " com " + poderesDivinos.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }
    }

    public void atacar(Feiticeiro feiticeiro, PoderesDivinos poderesDivinos) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + feiticeiro.nome + " com " + poderesDivinos.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = poderesDivinos.intensidade* ataque;
        double dano = ataqueFinal - feiticeiro.defesa;
        if(fe>0){feiticeiro.vida = feiticeiro.vida - 1;}
        if(feiticeiro.vida==0 && fe>0){System.out.print(feiticeiro.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(feiticeiro.vida<0){
            System.out.print("Um personagem morto foi atacado("+feiticeiro.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(fe>0){
            System.out.println(nome + " atacou " + feiticeiro.nome + " com " + poderesDivinos.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + feiticeiro.nome + " com " + poderesDivinos.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }
    }

    public void atacar(Druida druida, PoderesDivinos poderesDivinos) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + druida.nome + " com " + poderesDivinos.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = poderesDivinos.intensidade* ataque;
        double dano = ataqueFinal - druida.defesa;
        if(fe>0){druida.vida = druida.vida - 1;}
        if(druida.vida==0 && fe>0){System.out.print(druida.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(druida.vida<0){
            System.out.print("Um personagem morto foi atacado("+druida.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(fe>0){
            System.out.println(nome + " atacou " + druida.nome + " com " + poderesDivinos.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + druida.nome + " com " + poderesDivinos.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }
    }

    public void atacar(Clerigo clerigo, PoderesDivinos poderesDivinos) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + clerigo.nome + " com " + poderesDivinos.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = poderesDivinos.intensidade* ataque;
        double dano = ataqueFinal - clerigo.defesa;
        if(fe>0){clerigo.vida = clerigo.vida - 1;}
        if(clerigo.vida==0 && fe>0){System.out.print(clerigo.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(clerigo.vida<0){
            System.out.print("Um personagem morto foi atacado("+clerigo.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(fe>0){
            System.out.println(nome + " atacou " + clerigo.nome + " com " + poderesDivinos.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + clerigo.nome + " com " + poderesDivinos.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }
    }




}

package TemaMelhorado;

import java.text.DecimalFormat;

public class Personagens {
    String nome;
    int vida;
    double ataque;
    double defesa;
    int fe=50;
    int mana = 50;

    DecimalFormat df = new DecimalFormat("0.00");

    public void atacarArmas(Personagens personagens, Armas armas) {
        if(vida<=0){System.out.println("Um personagem morto atacou e ataque será ignorado. "
                +nome + " atacou " + personagens.nome + " com " + armas.nome+" sem causar danos.");
            return;}//Ataques de personagens mortos devem ser ignoraos
        double ataqueFinal = armas.poder* ataque;
        double dano = ataqueFinal - personagens.defesa;
        personagens.vida = personagens.vida - 1;
        if(personagens.vida==0){System.out.print(personagens.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(personagens.vida<0){
            System.out.print("Um personagem morto foi atacado("+personagens.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        System.out.println(nome + " atacou " + personagens.nome + " com " + armas.nome
                + " causando " + df.format(dano) + " de dano");
    }

    public void atacarPoderesDivinos(Personagens personagens, PoderesDivinos poderesDivinos) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + personagens.nome + " com " + poderesDivinos.nome
                + " sem causar danos");
            return;}
        double ataqueFinal = poderesDivinos.intensidade * ataque;
        double dano = ataqueFinal - personagens.defesa;
        if(fe>0){personagens.vida = personagens.vida - 1;}
        fe = fe-poderesDivinos.custoDeFe;
        if(personagens.vida==0 && fe>0){System.out.print(personagens.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(personagens.vida<0){
            System.out.print("Um personagem morto foi atacado("+personagens.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(fe>0){
            System.out.println(nome + " atacou " + personagens.nome + " com " + poderesDivinos.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + personagens.nome + " com " + poderesDivinos.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }}
    public void atacarMagias(Personagens personagens, Magias magias) {
        if(vida<=0){System.out.print("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + personagens.nome + " com " + personagens.nome
                + " sem causar danos");
            return;}
        double ataqueFinal = magias.poder * ataque;
        double dano = ataqueFinal - personagens.defesa;
        if(mana>0){personagens.vida = personagens.vida - 1;}
        mana = mana - magias.custoDeMana;
        if(personagens.vida==0 && mana>0){System.out.print(personagens.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(personagens.vida<0){
            System.out.print("Um personagem morto foi atacado("+personagens.nome+")!!!  " );}//Personagens mortos podem ser atacados normalmente
        if(mana>0){
            System.out.println(nome + " atacou " + personagens.nome + " com " + magias.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + personagens.nome + " com " + magias.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }
    }

}


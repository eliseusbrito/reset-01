package Tema;

import java.text.DecimalFormat;

public class Guerreiro {
    String nome;
    int vida;
    double ataque;
    double defesa;
    Armas armas;
    DecimalFormat df = new DecimalFormat("0.00");

    public Guerreiro(String nome, int vida, double ataque, double defesa, Armas armas) {
         this.nome = nome;
         this.vida = vida;
         this.ataque = ataque;
         this.defesa = defesa;
         this.armas = armas;
     }

    public void atacar(Barbaro barbaro, Armas armas){
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                 nome + " atacou " + barbaro.nome + " com " + armas.nome
                 + " sem causar danos");
             return;}
        double ataqueFinal = armas.poder*ataque;
        double dano = ataqueFinal-barbaro.defesa;
        barbaro.vida = barbaro.vida-1;
        if(barbaro.vida==0){System.out.print(barbaro.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(barbaro.vida<0){
            System.out.print("Um personagem morto foi atacado("+barbaro.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        System.out.println(nome+" atacou "+barbaro.nome+ " com "+armas.nome
                          + " causando "+ df.format(dano) + " de dano");
     }

    public void atacar(Druida druida, Armas armas){
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + druida.nome + " com " + armas.nome
                + " sem causar danos");
            return;}
        double ataqueFinal = armas.poder*ataque;
         double dano = ataqueFinal-druida.defesa;
         druida.vida = druida.vida-1;
        if(druida.vida==0){System.out.print(druida.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(druida.vida<0){
            System.out.print("Um personagem morto foi atacado("+druida.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
         System.out.println(nome+" atacou "+druida.nome+ " com "+armas.nome
                 + " causando "+ df.format(dano)+ " de dano");
     }

    public void atacar(Guerreiro guerreiro, Armas armas) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + guerreiro.nome + " com " + armas.nome
                + " sem causar danos");
            return;}
        double ataqueFinal = armas.poder * ataque;
        double dano = ataqueFinal - guerreiro.defesa;
        guerreiro.vida = guerreiro.vida - 1;
        if(guerreiro.vida==0){System.out.print(guerreiro.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(guerreiro.vida<0){
            System.out.print("Um personagem morto foi atacado("+guerreiro.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        System.out.println(nome+" atacou "+guerreiro.nome+ " com "+armas.nome
                + " causando "+ df.format(dano) + " de dano");
    }

    public void atacar(Clerigo clerigo, Armas armas) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + clerigo.nome + " com " + armas.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = armas.poder* ataque;
        double dano = ataqueFinal - clerigo.defesa;
        clerigo.vida = clerigo.vida - 1;
        if(clerigo.vida==0){System.out.print(clerigo.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(clerigo.vida<0){
            System.out.print("Um personagem morto foi atacado("+clerigo.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        System.out.println(nome + " atacou " + clerigo.nome + " com " + armas.nome
                + " causando " + df.format(dano) + " de dano");
    }

    public void atacar(Mago mago, Armas armas) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + mago.nome + " com " + armas.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = armas.poder* ataque;
        double dano = ataqueFinal - mago.defesa;
        mago.vida = mago.vida - 1;
        if(mago.vida==0){System.out.print(mago.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(mago.vida<0){
            System.out.print("Um personagem morto foi atacado("+mago.nome+")!!!"  );}//Personagens mortos podem ser atacados normalmente
        System.out.println(nome + " atacou " + mago.nome + " com " + armas.nome
                + " causando " + df.format(dano) + " de dano");
    }

    public void atacar(Feiticeiro feiticeiro, Armas armas) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + feiticeiro.nome + " com " + armas.nome
                + " sem causar danos");
            return;}//Ataques de personagens mortos devem ser ignorados
        double ataqueFinal = armas.poder* ataque;
        double dano = ataqueFinal - feiticeiro.defesa;
        feiticeiro.vida = feiticeiro.vida - 1;
        if(feiticeiro.vida==0){System.out.print(feiticeiro.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(feiticeiro.vida<0){
            System.out.print("Um personagem morto foi atacado("+feiticeiro.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        System.out.println(nome + " atacou " + feiticeiro.nome + " com " + armas.nome
                + " causando " + df.format(dano) + " de dano");
    }




}

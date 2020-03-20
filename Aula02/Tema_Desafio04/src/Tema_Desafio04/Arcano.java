package Tema_Desafio04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static Tema_Desafio04.Application.imp;
import static Tema_Desafio04.Application.tipoimpr;

public class Arcano extends Personagem {
    int mana;
    Magia magia;

    protected Arcano(String nome, double vida, double ataque, double defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    public Arcano(String nome, double vida, double ataque, double defesa, int mana, Magia magia) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
        this.magia = magia;
    }

    public int getMana() {
        return mana;
    }

    public void atacarMagias(Personagem alvo, Magia magia) {
        String qwert = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSS"));
        if (tipoimpr == 2){if(vida<=0){System.out.println("["+qwert+"] "+ "Um personagem morto atacou e ataque será ignorado. "+
                nome + " atacou " + alvo.nome + " com " + magia.nome
                + " sem causar danos");
            return;}}
        if(vida<=0){imp.getListaImpress().add("["+qwert+"] "+ "Um personagem morto atacou e ataque será ignorado. "+
                nome + " atacou " + alvo.nome + " com " + magia.nome
                + " sem causar danos");
            return;}

        double dano = calcularDano(alvo.defesa,magia.poder);
        double vidaAnterior =  alvo.vida;
        if(mana>0){alvo.vida = alvo.vida - dano;}
        mana = mana - magia.custoDeMana;

        if (tipoimpr == 2){if(alvo.vida<=0 && vidaAnterior>0 && mana>0){System.out.print("["+qwert+"] "+ alvo.nome+" morreu no ataque!!! ");}}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(alvo.vida<=0 && vidaAnterior>0 && mana>0){imp.getListaImpress().add("["+qwert+"] "+ alvo.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque


        if (tipoimpr == 2){if(alvo.vida<0 && vidaAnterior<=0){
            System.out.print("["+qwert+"] "+ "Um personagem morto foi atacado("+alvo.nome+")!!!  " );}}//Personagens mortos podem ser atacados normalmente
        if(alvo.vida<0 && vidaAnterior<=0){
            imp.getListaImpress().add("["+qwert+"] "+ "Um personagem morto foi atacado("+alvo.nome+")!!!  " );}//Personagens mortos podem ser atacados normalmente

        if (tipoimpr == 2){if(mana>0){
            System.out.println("["+qwert+"] "+ nome + " atacou " + alvo.nome + " com " + magia.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println("["+qwert+"] "+ nome + " atacou " + alvo.nome + " com " + magia.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }}
        if(mana>0){
            imp.getListaImpress().add("["+qwert+"] "+ nome + " atacou " + alvo.nome + " com " + magia.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            imp.getListaImpress().add("["+qwert+"] "+ nome + " atacou " + alvo.nome + " com " + magia.nome
                    + " não causando dano, pois saldo de mana = "+mana+" e ataque foi desconsiderado. ");
        }

        if (tipoimpr == 2){System.out.println("     Saldos: " + nome + " -> Vida: " + vida+" -> Mana: "+mana
                + "  &  " + alvo.nome + " -> Vida: " + alvo.vida);}
    }
}

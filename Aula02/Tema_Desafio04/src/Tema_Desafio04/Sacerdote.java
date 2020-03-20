package Tema_Desafio04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static Tema_Desafio04.Application.imp;
import static Tema_Desafio04.Application.tipoimpr;

public class Sacerdote extends Personagem {

    int fe;
    PoderDivino poderDivino;
    protected Sacerdote(String nome, double vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public Sacerdote(String nome, double vida, double ataque, double defesa, int fe, PoderDivino poderDivino) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
        this.poderDivino = poderDivino;
    }

    public void atacarPoderesDivinos(Personagem alvo, PoderDivino poderDivino) {
        String qwert = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSS"));
        if (tipoimpr == 2){if(vida<=0){System.out.println("["+qwert+"] "+ "Um personagem morto atacou e ataque será ignorado. "+
                nome + " atacou " + alvo.nome + " com " + poderDivino.nome
                + " sem causar danos");
            return;}}
        if(vida<=0){imp.getListaImpress().add("["+qwert+"] "+ "Um personagem morto atacou e ataque será ignorado. "+
                nome + " atacou " + alvo.nome + " com " + poderDivino.nome
                + " sem causar danos");
            return;}

        double dano = calcularDano(alvo.defesa, poderDivino.poder);
        double vidaAnterior =  alvo.vida;
        if(fe>0){alvo.vida = alvo.vida - dano;}
        fe = fe-poderDivino.custoDeFe;

        if (tipoimpr == 2){if(alvo.vida<=0 && vidaAnterior>0 && fe>0){System.out.print("["+qwert+"] "+ alvo.nome+" morreu no ataque!!! ");}}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(alvo.vida<=0 && vidaAnterior>0 && fe>0){imp.getListaImpress().add("["+qwert+"] "+ alvo.nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque

        if (tipoimpr == 2){if(alvo.vida<0 && vidaAnterior<=0){
            System.out.print("["+qwert+"] "+ "Um personagem morto foi atacado("+alvo.nome+")!!!  ");}}//Personagens mortos podem ser atacados normalmente
        if(alvo.vida<0 && vidaAnterior<=0){
            imp.getListaImpress().add("["+qwert+"] "+ "Um personagem morto foi atacado("+alvo.nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente

        if (tipoimpr == 2){if(fe>0){
            System.out.println("["+qwert+"] "+ nome + " atacou " + alvo.nome + " com " + poderDivino.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println("["+qwert+"] "+ nome + " atacou " + alvo.nome + " com " + poderDivino.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }}
        if(fe>0){
            imp.getListaImpress().add("["+qwert+"] "+ nome + " atacou " + alvo.nome + " com " + poderDivino.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            imp.getListaImpress().add("["+qwert+"] "+ nome + " atacou " + alvo.nome + " com " + poderDivino.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }

        if (tipoimpr == 2){System.out.println("     Saldos: " + nome + " -> Vida: " + vida+" -> Fé: "+fe
                + "  &  " + alvo.nome + " -> Vida: " + alvo.vida);}
    }
}



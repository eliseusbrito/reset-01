package Tema_Desafio01;

public class Sacerdote extends Personagem {

    int fe;

    public Sacerdote(String nome, int vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public void atacarPoderesDivinos(Personagem alvo, PoderDivino poderDivino) {
        if(vida<=0){System.out.println("Ataque será ignorado pois " +nome+" esta morto!!! "+
                nome + " atacou " + nome + " com " + poderDivino.nome
                + " sem causar danos");
            return;}
        double dano = calcularDano(alvo.defesa, poderDivino.poder);

        if(fe>0){vida = vida - 1;}
        fe = fe-poderDivino.custoDeFe;
        if(vida==0 && fe>0){System.out.print(nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(vida<0){
            System.out.print("Um personagem morto foi atacado("+nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        if(fe>0){
            System.out.println(nome + " atacou " + nome + " com " + poderDivino.nome
                    + " causando " + df.format(dano) + " de dano. ");
        } else {
            System.out.println(nome + " atacou " + nome + " com " + poderDivino.nome
                    + " não causando dano, pois saldo de fé = "+fe+" e ataque foi desconsiderado. ");
        }}

}



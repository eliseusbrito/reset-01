package Tema_Desafio01;

public class HomemDeArma extends Personagem {


    public HomemDeArma(String nome, int vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
      }

    public void atacarArmas(Personagem alvo, Arma arma) {
        if(vida<=0){System.out.println("Um personagem morto atacou e ataque será ignorado. "
                +nome + " atacou " + nome + " com " + arma.nome+" sem causar danos.");
            return;}//Ataques de personagens mortos devem ser ignoraos
        double dano = calcularDano(alvo.defesa, arma.poder);
        vida = vida - 1;
        if(vida==0){System.out.print(nome+" morreu no ataque!!! ");}//Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
        if(vida<0){
            System.out.print("Um morto foi atacado("+nome+")!!!  ");}//Personagens mortos podem ser atacados normalmente
        System.out.println(nome + " atacou " + nome + " com " + arma.nome
                + " causando " + df.format(dano) + " de dano");
    }

}

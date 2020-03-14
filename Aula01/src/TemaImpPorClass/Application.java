package TemaImpPorClass;
import java.util.Scanner;

public class Application {
    //Armas, Poderes e Magias
    static Armas machado = new Armas("Machado", 10);
    static Armas bolaDeFogo = new Armas("Bola de fogo", 5);
    static Magias raio = new Magias("Raio", 10, 5);
    static Magias fire = new Magias("Fire", 10, 10);
    static PoderesDivinos armaEspiritual = new PoderesDivinos("Arma Espiritual", 10, 5);
    static PoderesDivinos cajado = new PoderesDivinos("Cajado", 10, 7);
    //Personagens com Herança
    static Personagens guerreiro = new Guerreiro("Ramza", 3, 5, 5, machado);
    static Personagens barbaro = new Barbaro("Ragnar", 3, 6, 5, bolaDeFogo);
    static Personagens mago = new Mago("Niele", 3, 7, 5, raio);
    static Personagens feiticeiro = new Feiticeiro("Sorcerer", 3, 8, 5, fire);
    static Personagens druida = new Druida("Beatrice", 3, 9, 5, armaEspiritual);
    static Personagens clerigo = new Clerigo("Goldmoon", 3, 9, 5, armaEspiritual);

    public static void main(String[] args) {
        System.out.println("\n------------------------------------------------------------------------------------\n\t\t\tSIMULADOR DE COMBATE RPG\n\n\t\t\t\t\t\tCódigo v 2.0: Eliseu Brito - Programa RESET CWI\n------------------------------------------------------------------------------------");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 1 para relatório padrão e 2 para detalhado: ");
        int x= sc.nextInt();
        System.out.println();
        //Ataques
        guerreiro.atacarArmas(barbaro, machado);//ranza(guerreiro) ataca ragnar(barbaro)
        if (x == 2) {Guerreiro.imprimeGB();}
        barbaro.atacarArmas(druida, bolaDeFogo);//ragnar(barbaro) ataca beatrice(druida)
        if (x == 2) { Barbaro.imprimeBD();  }
        barbaro.atacarArmas(guerreiro, bolaDeFogo);//ragnar(barbaro) ataca ragnar(barbaro)
       if (x == 2) { Barbaro.imprimeBG(); }
       barbaro.atacarArmas(barbaro, bolaDeFogo);//ragnar(barbaro) ataca ragnar(barbaro)
        if (x == 2) { Barbaro.imprimeBB();}
        druida.atacarPoderesDivinos(barbaro, armaEspiritual);//druida(beatrice) ataca ragnar(barbaro)
        if (x == 2) { Druida.imprimeDB();}
        mago.atacarMagias(barbaro, raio);//niele(mago) ataca ragnar(barbaro)
        if (x == 2) { Mago.imprimeMB();}
        barbaro.atacarArmas(druida, bolaDeFogo);
        if (x == 2) { Barbaro.imprimeBD();}
        barbaro.atacarArmas(guerreiro,bolaDeFogo);//ragnar(barbaro) ataca ranza(guerreiro)
        if (x == 2) { Barbaro.imprimeBG();}
        clerigo.atacarPoderesDivinos(feiticeiro,cajado);//goldmoon(clerigo) ataca feiticeiro(feiticeiro)
        if (x == 2) { Clerigo.imprimeCF();}
        feiticeiro.atacarMagias(barbaro,fire);
        if (x == 2) { Feiticeiro.imprimeFB();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { Feiticeiro.imprimeFM();}
        feiticeiro.atacarMagias(clerigo,fire);
        if (x == 2) { Feiticeiro.imprimeFC();}
        guerreiro.atacarArmas(druida,machado);
        if (x == 2) { Guerreiro.imprimeGD();}
        druida.atacarPoderesDivinos(guerreiro,armaEspiritual);
        if (x == 2) { Druida.imprimeDG();}
        clerigo.atacarPoderesDivinos(mago,cajado);
        if (x == 2) { Clerigo.imprimeCM();}
        mago.atacarMagias(clerigo,raio);
        if (x == 2) { Mago.imprimeMC();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { Feiticeiro.imprimeFM();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { Feiticeiro.imprimeFM();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { Feiticeiro.imprimeFM();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { Feiticeiro.imprimeFM();}
        barbaro.atacarArmas(druida, bolaDeFogo);
        if (x == 2) { Barbaro.imprimeBD();}
        guerreiro.atacarArmas(druida,machado);
        if (x == 2) { Guerreiro.imprimeGD();}
        guerreiro.atacarArmas(druida,machado);
        if (x == 2) { Guerreiro.imprimeGD();}
        feiticeiro.atacarMagias(guerreiro,fire);
        if (x == 2) { Feiticeiro.imprimeFG();}
        feiticeiro.atacarMagias(guerreiro,fire);
        if (x == 2) { Feiticeiro.imprimeFG();}
        System.out.println("");
        System.out.println("SITUAÇÃO FINAL COMBATE");
        System.out.println("Personagem: " + guerreiro.nome + "     Vida: " + guerreiro.vida);
        System.out.println("Personagem: " + barbaro.nome + "     Vida: " + barbaro.vida);
        System.out.println("Personagem: " + druida.nome + "     Vida: " + druida.vida + "     Fé: " + druida.fe);
        System.out.println("Personagem: " + clerigo.nome + "      Vida: " + clerigo.vida + "       Fé: " + clerigo.fe);
        System.out.println("Personagem: " + feiticeiro.nome + "     Vida: " + feiticeiro.vida + "     Mana: " + feiticeiro.mana);
        System.out.println("Personagem: " + mago.nome + "     Vida: " + mago.vida + "     Mana: " + mago.mana);
        sc.close();
    }
}

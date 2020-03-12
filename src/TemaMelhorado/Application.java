package TemaMelhorado;
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
        System.out.println("\n------------------------------------------------------------------------------------\n\t\t\tSIMULADOR DE COMBATE RPG\n\n\t\t\t\t\t\tCódigo v 1.0: Eliseu Brito - Programa RESET CWI\n------------------------------------------------------------------------------------");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        //System.out.print("Digite 1 para relatório padrão e 2 para detalhado: ");
        //int x= sc.nextInt();
        int x = 2;
        System.out.println();
        //Ataques
        guerreiro.atacarArmas(barbaro, machado);//ranza(guerreiro) ataca ragnar(barbaro)
        if (x == 2) { imprimeGB(); }
        barbaro.atacarArmas(druida, bolaDeFogo);//ragnar(barbaro) ataca beatrice(druida)
        if (x == 2) { imprimeBD();  }
        barbaro.atacarArmas(guerreiro, bolaDeFogo);//ragnar(barbaro) ataca ragnar(barbaro)
       if (x == 2) { imprimeBG(); }
       barbaro.atacarArmas(barbaro, bolaDeFogo);//ragnar(barbaro) ataca ragnar(barbaro)
        if (x == 2) { imprimeBB();}
        druida.atacarPoderesDivinos(barbaro, armaEspiritual);//druida(beatrice) ataca ragnar(barbaro)
        if (x == 2) { imprimeDB();}
        mago.atacarMagias(barbaro, raio);//niele(mago) ataca ragnar(barbaro)
        if (x == 2) { imprimeMB();}
        barbaro.atacarArmas(druida, bolaDeFogo);
        if (x == 2) { imprimeBD();}
        barbaro.atacarArmas(guerreiro,bolaDeFogo);//ragnar(barbaro) ataca ranza(guerreiro)
        if (x == 2) { imprimeBG();}
        clerigo.atacarPoderesDivinos(feiticeiro,cajado);//goldmoon(clerigo) ataca feiticeiro(feiticeiro)
        if (x == 2) { imprimeCF();}
        feiticeiro.atacarMagias(barbaro,fire);
        if (x == 2) { imprimeFB();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { imprimeFM();}
        feiticeiro.atacarMagias(clerigo,fire);
        if (x == 2) { imprimeFC();}
        guerreiro.atacarArmas(druida,machado);
        if (x == 2) { imprimeGD();}
        druida.atacarPoderesDivinos(guerreiro,armaEspiritual);
        if (x == 2) { imprimeDG();}
        clerigo.atacarPoderesDivinos(mago,cajado);
        if (x == 2) { imprimeCM();}
        mago.atacarMagias(clerigo,raio);
        if (x == 2) { imprimeMC();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { imprimeFM();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { imprimeFM();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { imprimeFM();}
        feiticeiro.atacarMagias(mago,fire);
        if (x == 2) { imprimeFM();}
        barbaro.atacarArmas(druida, bolaDeFogo);
        if (x == 2) { imprimeBD();}
        guerreiro.atacarArmas(druida,machado);
        if (x == 2) { imprimeGD();}
        guerreiro.atacarArmas(druida,machado);
        if (x == 2) { imprimeGD();}
        feiticeiro.atacarMagias(guerreiro,fire);
        if (x == 2) { imprimeFG();}
        feiticeiro.atacarMagias(guerreiro,fire);
        if (x == 2) { imprimeFG();}
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

    static void imprimeGB() {
        System.out.println("   Saldos: " + guerreiro.nome + " -> Vida: " + guerreiro.vida
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);    }

    static void imprimeGC() {
        System.out.println("   Saldos: " + guerreiro.nome + " -> Vida: " + guerreiro.vida
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);    }

    static void imprimeBD() {
        System.out.println("   Saldos: " + barbaro.nome + " -> Vida: " + barbaro.vida
                + "  &  " + druida.nome + " -> Vida: " + druida.vida + "  Fé: " + barbaro.fe);    }

    static void imprimeBG() {
        System.out.println("   Saldos: " + barbaro.nome + " -> Vida: " + barbaro.vida
                + "  &  " + guerreiro.nome + " -> Vida: " + guerreiro.vida);    }

    static void imprimeBB() {
        System.out.println("   Saldos: " + barbaro.nome + " -> Vida: " + barbaro.vida
                + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);         }

    static void imprimeDB() {
        System.out.println("   Saldos: " + druida.nome + " -> Vida: " + druida.vida + "  Fé: " + druida.fe
                    + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);}

    static void imprimeMB() {
        System.out.println("   Saldos: " + mago.nome + " -> Vida: " + mago.vida + "  Mana: " + mago.mana
                    + "  &  " + barbaro.nome + " -> Vida: " + barbaro.vida);}

     static void imprimeCF() {
        System.out.println("   Saldos: "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe
                +"  &  "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"  Mana: "+feiticeiro.mana);}

    static void imprimeFB() {
        System.out.println("   Saldos: "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"  Mana: "+feiticeiro.mana
                +"  &  "+barbaro.nome+" -> Vida: "+barbaro.vida);    }

    static void imprimeFM() {
        System.out.println("   Saldos: "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"  Mana: "+feiticeiro.mana
                +"  &  "+mago.nome+" -> Vida: "+mago.vida+"  Mana: "+mago.mana);   }

    static void imprimeFC() {
        System.out.println("   Saldos: "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"  Mana: "+feiticeiro.mana
                +"  &  "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe);    }

                static void imprimeGD() {
        System.out.println("   Saldos: "+guerreiro.nome+" -> Vida: "+guerreiro.vida
                +"  &  "+druida.nome+" -> Vida: "+druida.vida+"  Fé: "+druida.fe);    }

    static void imprimeDG() {
        System.out.println("   Saldos: "+druida.nome+" -> Vida: "+druida.vida+"  Fé: "+druida.fe
                +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);}

    static void imprimeCM() {
        System.out.println("   Saldos: "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe
            +"  &  "+mago.nome+" -> Vida: "+mago.vida+"  Mana: "+mago.mana);}

    static void imprimeMC() {
         System.out.println("   Saldos: "+mago.nome+" -> Vida: "+mago.vida+"  Mana: "+mago.mana
                    +"  &  "+clerigo.nome+" -> Vida: "+clerigo.vida+"  Fé: "+clerigo.fe);}

     static void imprimeFG() {
        System.out.println("   Saldos: "+feiticeiro.nome+" -> Vida: "+feiticeiro.vida+"   Mana: "+feiticeiro.mana
                    +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);       }

}

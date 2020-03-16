package Tema_Desafio01;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.rodaMenu();
        Criacao criacao = new Criacao();

        int x = 1;
   //     System.out.print("Digite quantos personagens vc deseja criar: ");
    //    int x= sc.nextInt();

        System.out.println();
        //Armas, Poderes e Magias
        Arma machado = new Arma("Machado", 10);
        Arma bolaDeFogo = new Arma("Bola de fogo", 5);
        Magia raio = new Magia("Raio", 10, 5);
        Magia fire = new Magia("Fire", 10, 10);
        PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual", 10, 5);
        PoderDivino cajado = new PoderDivino("Cajado", 10, 7);


        //Personagens com Herança
        Guerreiro ramza = new Guerreiro("Ramza", 3, 5, 5);
        Barbaro ragnar = new Barbaro("Ragnar", 3, 6, 5);
        Mago niele = new Mago("Niele", 3, 7, 5,50);
        Feiticeiro sorcerer = new Feiticeiro("Sorcerer", 3, 8, 5,50);
        Druida beatrice = new Druida("Beatrice", 3, 9, 5,50);
        Clerigo goldmoon = new Clerigo("Goldmoon", 3, 9, 5,50);


        System.out.println("Voltou para o App");


/*
        int a = criacao.getListaGuerreiros.size();
        System.out.println(listaGuerreiros.get(0));

        getListaGuerreiros().size(),

        for (Clerigo clerigo : listaClerigos) {
            System.out.println("Clerigo -->  Nome:" + clerigo.nome + " Vida: " + clerigo.vida+" Ataque: " + clerigo.ataque + " Defesa: " + clerigo.defesa);
        }
*/






        // System.out.println("A listaGuerreiros tem "+a+" elementos");

 /*       for (Guerreiro guerreiro : listaGuerreiros) {
            System.out.println(guerreiro);
        }
*/



        //Ataques
        ramza.atacarArmas(ragnar, machado);//ramza(guerreiro) ataca ragnar(barbaro)
 //       if (x == 2) {Guerreiro.imprimeGB();}
        ragnar.atacarArmas(beatrice, bolaDeFogo);//ragnar(barbaro) ataca beatrice(druida)
 //       if (x == 2) { Barbaro.imprimeBD();  }
        ragnar.atacarArmas(ramza, bolaDeFogo);//ragnar(barbaro) ataca ramza(guerreiro)
  //     if (x == 2) { Barbaro.imprimeBG(); }
        ragnar.atacarArmas(ragnar, bolaDeFogo);//ragnar(barbaro) ataca ragnar(barbaro)
 //       if (x == 2) { Barbaro.imprimeBB();}
        beatrice.atacarPoderesDivinos(ragnar, armaEspiritual);//druida(beatrice) ataca ragnar(barbaro)
 //       if (x == 2) { Druida.imprimeDB();}
        niele.atacarMagias(ragnar, raio);//niele(mago) ataca ragnar(barbaro)
 //       if (x == 2) { Mago.imprimeMB();}
        ragnar.atacarArmas(beatrice, bolaDeFogo);
 //       if (x == 2) { Barbaro.imprimeBD();}
        ragnar.atacarArmas(ramza,bolaDeFogo);//ragnar(barbaro) ataca ramza(guerreiro)
 //       if (x == 2) { Barbaro.imprimeBG();}
        goldmoon.atacarPoderesDivinos(sorcerer,cajado);//goldmoon(clerigo) ataca feiticeiro(feiticeiro)
 //       if (x == 2) { Clerigo.imprimeCF();}
        sorcerer.atacarMagias(ragnar,fire);
 //       if (x == 2) { Feiticeiro.imprimeFB();}
        sorcerer.atacarMagias(niele,fire);
 //       if (x == 2) { Feiticeiro.imprimeFM();}
        sorcerer.atacarMagias(goldmoon,fire);
 //       if (x == 2) { Feiticeiro.imprimeFC();}
        ramza.atacarArmas(beatrice,machado);
  //      if (x == 2) { Guerreiro.imprimeGD();}
        beatrice.atacarPoderesDivinos(ramza,armaEspiritual);
  //      if (x == 2) { Druida.imprimeDG();}
        goldmoon.atacarPoderesDivinos(niele,cajado);
  //      if (x == 2) { Clerigo.imprimeCM();}
        niele.atacarMagias(goldmoon,raio);
  //      if (x == 2) { Mago.imprimeMC();}
        sorcerer.atacarMagias(niele,fire);
 //       if (x == 2) { Feiticeiro.imprimeFM();}
        sorcerer.atacarMagias(niele,fire);
 //       if (x == 2) { Feiticeiro.imprimeFM();}
        sorcerer.atacarMagias(niele,fire);
 //       if (x == 2) { Feiticeiro.imprimeFM();}
        sorcerer.atacarMagias(niele,fire);
 //       if (x == 2) { Feiticeiro.imprimeFM();}
        ragnar.atacarArmas(beatrice, bolaDeFogo);
 //       if (x == 2) { Barbaro.imprimeBD();}
        ramza.atacarArmas(beatrice,machado);
 //       if (x == 2) { Guerreiro.imprimeGD();}
        ramza.atacarArmas(beatrice,machado);
//        if (x == 2) { Guerreiro.imprimeGD();}
        sorcerer.atacarMagias(ramza,fire);
//        if (x == 2) { Feiticeiro.imprimeFG();}
        sorcerer.atacarMagias(ramza,fire);
//        if (x == 2) { Feiticeiro.imprimeFG();}
        System.out.println("");
        System.out.println("SITUAÇÃO FINAL COMBATE");
        System.out.println("Personagem: " + ramza.nome + "     Vida: " + ramza.vida);
        System.out.println("Personagem: " + ragnar.nome + "     Vida: " + ragnar.vida);
        System.out.println("Personagem: " + beatrice.nome + "     Vida: " + beatrice.vida + "     Fé: " + beatrice.fe);
        System.out.println("Personagem: " + goldmoon.nome + "      Vida: " + goldmoon.vida + "       Fé: " + goldmoon.fe);
        System.out.println("Personagem: " + sorcerer.nome + "     Vida: " + sorcerer.vida + "     Mana: " + sorcerer.mana);
        System.out.println("Personagem: " + niele.nome + "     Vida: " + niele.vida + "     Mana: " + niele.mana);
        sc.close();
    }
}

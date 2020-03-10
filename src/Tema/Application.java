package Tema;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Application {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite 1 para relatório padrão e 2 para detalhado: ");
        int x= sc.nextInt();
        //Armas, Poderes e Magias
        Armas machado = new Armas("Machado",10);
        Armas bolaDeFogo= new Armas ("Bola de fogo",5);
        Magias raio = new Magias("Raio",10,5);
        Magias fire = new Magias("Fire",10,10);
        PoderesDivinos armaEspiritual=new PoderesDivinos("Arma Espiritual",10,5);
        PoderesDivinos cajado = new PoderesDivinos("Cajado", 10,7);
        //Personagens
        Guerreiro guerreiro = new Guerreiro("Ramza",3,5,5,machado);
        //Guerreiro guerreiro1 = new Guerreiro("Lightfury",10,18.16667,500, "machado",30);
        Barbaro ragnar = new Barbaro("Ragnar",3,6,5,bolaDeFogo);
        Mago niele = new Mago("Niele",3,7,5,raio);
        Feiticeiro sorcerer = new Feiticeiro("Sorcerer",3,8,5,fire);
        Druida beatrice = new Druida("Beatrice",3,9,5,armaEspiritual);
        Clerigo goldmoon = new Clerigo("Goldmoon",3,10,5,cajado);
        //Ataques
        guerreiro.atacar(ragnar,machado);//ranza(guerreiro) ataca ragnar(barbaro)
        if(x==2){System.out.println("   Saldos: "+guerreiro.nome+" -> Vida: "+guerreiro.vida
        +"  &  "+ragnar.nome+" -> Vida: "+ragnar.vida);}

        ragnar.atacar(beatrice, bolaDeFogo);//ragnar(barbaro) ataca beatrice(druida)
        if(x==2){System.out.println("   Saldos: "+ragnar.nome+" -> Vida: "+ragnar.vida
                +"  &  "+beatrice.nome+" -> Vida: "+beatrice.vida+"  Fé: "+beatrice.fe);}

        ragnar.atacar(guerreiro,bolaDeFogo);//ragnar(barbaro) ataca ranza(guerreiro)
        if(x==2){System.out.println("   Saldos: "+ragnar.nome+" -> Vida: "+ragnar.vida
                +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);}

        ragnar.atacar(ragnar,bolaDeFogo);//ragnar(barbaro) ataca ragnar(barbaro)
        if(x==2){System.out.println("   Saldos: "+ragnar.nome+" -> Vida: "+ragnar.vida
                +"  &  "+ragnar.nome+" -> Vida: "+ragnar.vida);}

        beatrice.atacar(ragnar, armaEspiritual);//druida(beatrice) ataca ragnar(barbaro)
        if(x==2){System.out.println("   Saldos: "+beatrice.nome+" -> Vida: "+beatrice.vida+"  Fé: "+beatrice.fe
                +"  &  "+ragnar.nome+" -> Vida: "+ragnar.vida);}

        niele.atacar(ragnar,raio);//niele(mago) ataca ragnar(barbaro)
        if(x==2){System.out.println("   Saldos: "+niele.nome+" -> Vida: "+niele.vida+"  Mana: "+niele.mana
                +"  &  "+ragnar.nome+" -> Vida: "+ragnar.vida);}

        ragnar.atacar(beatrice,bolaDeFogo);
         if(x==2){ System.out.println("   Saldos: "+ragnar.nome+" -> Vida: "+ragnar.vida
                +"  &  "+beatrice.nome+" -> Vida: "+beatrice.vida+"  Fé: "+beatrice.fe);}

        ragnar.atacar(guerreiro,bolaDeFogo);//ragnar(barbaro) ataca ranza(guerreiro)
        if(x==2){System.out.println("   Saldos: "+ragnar.nome+" -> Vida: "+ragnar.vida
                +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);}

        goldmoon.atacar(sorcerer,cajado);//goldmoon(clerigo) ataca sorcerer(feiticeiro)
        if(x==2){System.out.println("   Saldos: "+goldmoon.nome+" -> Vida: "+goldmoon.vida+"  Fé: "+goldmoon.fe
                +"  &  "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"  Mana: "+sorcerer.mana);}

        sorcerer.atacar(ragnar,fire);//sorcerer(feiticeiro) ataca ragnar(barbaro)
        if(x==2){System.out.println("   Saldos: "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"  Mana: "+sorcerer.mana
                +"  &  "+ragnar.nome+" -> Vida: "+ragnar.vida);}

        sorcerer.atacar(niele,fire);
        if(x==2){System.out.println("   Saldos: "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"  Mana: "+sorcerer.mana
                +"  &  "+niele.nome+" -> Vida: "+niele.vida+"  Mana: "+niele.mana);}

        sorcerer.atacar(goldmoon,fire);
        if(x==2){System.out.println("   Saldos: "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"  Mana: "+sorcerer.mana
                +"  &  "+goldmoon.nome+" -> Vida: "+goldmoon.vida+"  Fé: "+goldmoon.fe);}

        guerreiro.atacar(beatrice,machado);
        if(x==2){System.out.println("   Saldos: "+guerreiro.nome+" -> Vida: "+guerreiro.vida
                +"  &  "+beatrice.nome+" -> Vida: "+beatrice.vida+"  Fé: "+beatrice.fe);}

        beatrice.atacar(guerreiro,armaEspiritual);
        if(x==2){System.out.println("   Saldos: "+beatrice.nome+" -> Vida: "+beatrice.vida+"  Fé: "+beatrice.fe
                +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);}

        goldmoon.atacar(niele,cajado);
        if(x==2){System.out.println("   Saldos: "+goldmoon.nome+" -> Vida: "+goldmoon.vida+"  Fé: "+goldmoon.fe
                +"  &  "+niele.nome+" -> Vida: "+niele.vida+"  Mana: "+niele.mana);}

        niele.atacar(goldmoon,raio);
        if(x==2){System.out.println("   Saldos: "+niele.nome+" -> Vida: "+niele.vida+"  Mana: "+niele.mana
                +"  &  "+goldmoon.nome+" -> Vida: "+goldmoon.vida+"  Fé: "+goldmoon.fe);}

        sorcerer.atacar(niele,fire);
        if(x==2){System.out.println("   Saldos: "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"  Mana: "+sorcerer.mana
                +"  &  "+niele.nome+" -> Vida: "+niele.vida+"  Mana: "+niele.mana);}

        sorcerer.atacar(niele,fire);
        if(x==2){System.out.println("   Saldos: "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"  Mana: "+sorcerer.mana
                +"  &  "+niele.nome+" -> Vida: "+niele.vida+"  Mana: "+niele.mana);}

        sorcerer.atacar(niele,fire);
        if(x==2){System.out.println("   Saldos: "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"  Mana: "+sorcerer.mana
                +"  &  "+niele.nome+" -> Vida: "+niele.vida+"  Mana: "+niele.mana);}

        sorcerer.atacar(niele,fire);
        if(x==2){System.out.println("   Saldos: "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"  Mana: "+sorcerer.mana
                +"  &  "+niele.nome+" -> Vida: "+niele.vida+"  Mana: "+niele.mana);}

        ragnar.atacar(beatrice, bolaDeFogo);
        if(x==2){System.out.println("   Saldos: "+ragnar.nome+" -> Vida: "+ragnar.vida
                +"  &  "+beatrice.nome+" -> Vida: "+beatrice.vida+"  Fé: "+beatrice.fe);}

        guerreiro.atacar(beatrice,machado);
        if(x==2){System.out.println("   Saldos: "+guerreiro.nome+" -> Vida: "+guerreiro.vida
                +"  &  "+beatrice.nome+" -> Vida: "+beatrice.vida+"  Fé: "+beatrice.fe);}

        guerreiro.atacar(beatrice,machado);
        if(x==2){System.out.println("   Saldos: "+guerreiro.nome+" -> Vida: "+guerreiro.vida
                +"  &  "+beatrice.nome+" -> Vida: "+beatrice.vida+"  Fé: "+beatrice.fe);}

        sorcerer.atacar(guerreiro,fire);
        if(x==2){System.out.println("   Saldos: "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"   Mana: "+sorcerer.mana
                +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);}

        sorcerer.atacar(guerreiro,fire);
        if(x==2){System.out.println("   Saldos: "+sorcerer.nome+" -> Vida: "+sorcerer.vida+"   Mana: "+sorcerer.mana
                +"  &  "+guerreiro.nome+" -> Vida: "+guerreiro.vida);}

        System.out.println("");
        System.out.println("SITUAÇÃO FINAL COMBATE");
        System.out.println("Personagem: "+guerreiro.nome+"     Vida: "+guerreiro.vida);
        System.out.println("Personagem: "+ragnar.nome+"     Vida: "+ragnar.vida);
        System.out.println("Personagem: "+beatrice.nome+"     Vida: "+beatrice.vida+"     Fé: "+beatrice.fe);
        System.out.println("Personagem: "+goldmoon.nome+"      Vida: "+goldmoon.vida+"       Fé: "+goldmoon.fe);
        System.out.println("Personagem: "+sorcerer.nome+"     Vida: "+sorcerer.vida+"     Mana: "+sorcerer.mana);
        System.out.println("Personagem: "+niele.nome+"     Vida: "+niele.vida+"     Mana: "+niele.mana);

        sc.close();
    }
}

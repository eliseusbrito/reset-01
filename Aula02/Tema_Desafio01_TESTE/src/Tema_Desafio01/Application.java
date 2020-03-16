package Tema_Desafio01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 //       Menu menu = new Menu();
 //       menu.rodaMenu();
 //       Criacao criacao = new Criacao();
        int cf = 0;
        int cm=0;
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

        System.out.print("Quantos personagens deseja criar? ");
        int n = sc.nextInt();
        List<Guerreiro> listaGuerreiros = new ArrayList<>();
        List<Barbaro> listaBarbaros = new ArrayList<>();
        List<Druida> listaDruidas = new ArrayList<>();
        List<Mago> listaMagos = new ArrayList<>();
        List<Clerigo> listaClerigos = new ArrayList<>();
        List<Feiticeiro> listaFeiticeiros = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            System.out.println("Digite o tipo de personagem: \nG - GUERREIRO, B - BARBARO, D - DRUIDA,\n C - CLERIGO, M - MAGO ou F - FEITICEIRO;");
            char tp = sc.next().charAt(0);
            System.out.print("Digite o nome do personagem: ");
            String no = sc.next();
            System.out.print("Digite quantas vidas ele terá: ");
            int v = sc.nextInt();
            System.out.print("Digite o poder de ataque: ");
            double a = sc.nextDouble();
            System.out.print("Digite a defesa: ");
            double d = sc.nextDouble();
            if(tp=='D'){System.out.print("Digite qual o custo de fé: ");
                cf = sc.nextInt();}
            if(tp=='C'){System.out.print("Digite qual o custo de fé: ");
                cf = sc.nextInt();}
            if(tp=='F'){System.out.print("Digite qual o custo de mana: ");
                cm = sc.nextInt();}
            if(tp=='M'){System.out.print("Digite qual o custo de mana: ");
                cm = sc.nextInt();}

            String guerreiro = "Guerreiro"+n;
            if (tp == 'G') {
                listaGuerreiros.add(new Guerreiro (no, v, a, d));}
            String barbaro = "Barbaro"+n;
            if (tp == 'B') {
                listaBarbaros.add(new Barbaro (no, v, a, d));}
            String druida = "Druida"+n;
            if (tp == 'D') {
                listaDruidas.add(new Druida(no, v, a, d,cf));}
            String clerigo = "Clerigo"+n;
            if (tp == 'C') {
                listaClerigos.add(new Clerigo(no, v, a, d,cf));}
            String mago = "Mago"+n;
            if (tp == 'M') {
                listaMagos.add(new Mago (no, v, a, d,cm));}
            String feiticeiros = "Feiticeiro"+n;
            if (tp == 'F') {
                listaFeiticeiros.add(new Feiticeiro (no, v, a, d,cm));}
        }
        if(listaGuerreiros.size()>0){
            System.out.println("Lista de Guerreiros:");
            for (Guerreiro guerreiro : listaGuerreiros) {
                System.out.println("    Nome:" + guerreiro.nome + " Vida: " + guerreiro.vida+" Ataque: " + guerreiro.ataque + " Defesa: " + guerreiro.defesa);
                }}
        if(listaBarbaros.size()>0){
            System.out.println("Lista de Barbaros:");
            for (Barbaro barbaro : listaBarbaros) {
                System.out.println("    Nome:" + barbaro.nome + " Vida: " + barbaro.vida+" Ataque: " + barbaro.ataque + " Defesa: " + barbaro.defesa);
                }}
        if(listaDruidas.size()>0){
            System.out.println("Lista de Druidas:");
            for (Druida druida : listaDruidas) {
                System.out.println("    Nome:" + druida.nome + " Vida: " + druida.vida+" Ataque: " + druida.ataque + " Defesa: " + druida.defesa);
                }}
        if(listaMagos.size()>0){
            System.out.println("Lista de Magos:");
            for (Mago mago : listaMagos) {
                System.out.println("    Nome:" + mago.nome + " Vida: " + mago.vida+" Ataque: " + mago.ataque + " Defesa: " + mago.defesa);
                }}
        if(listaFeiticeiros.size()>0){
            System.out.println("Lista de Feiticeiros:");
            for (Feiticeiro feiticeiro : listaFeiticeiros) {
                System.out.println("    Nome:" + feiticeiro.nome + " Vida: " + feiticeiro.vida+" Ataque: " + feiticeiro.ataque + " Defesa: " + feiticeiro.defesa);
        }}
        if(listaClerigos.size()>0){
            System.out.println("Lista de Clerigos:");
            for (Clerigo clerigo : listaClerigos) {
                System.out.println("    Nome:" + clerigo.nome + " Vida: " + clerigo.vida+" Ataque: " + clerigo.ataque + " Defesa: " + clerigo.defesa);
        }}


 /*       int a = listaGuerreiros.size();
         System.out.println("A listaGuerreiros tem "+a+" elementos");

        for (Guerreiro guerreiro : listaGuerreiros) {
            System.out.println(guerreiro);
        }

        for (Guerreiro guerreiro : listaGuerreiros) {
            System.out.println(guerreiro.nome+" "+guerreiro.vida);
        }

       System.out.println("listaGuerreiros.get(0) ="+listaGuerreiros.get(0));
*/
        System.out.println("Escolha o numero  atacante");
        int at = sc.nextInt();
        at = at-1;
        System.out.println("Escolha o numero alvo");
        int al = sc.nextInt();
        al =al-1;
        System.out.println("at = "+at);
        System.out.println("al = "+al);

       //listaGuerreiros(pl).atacarArmas(sl,machado);
        listaGuerreiros.get(0).atacarArmas(listaBarbaros.get(0),machado);
        listaGuerreiros.get(at).atacarArmas(listaBarbaros.get(al),machado);
        listaBarbaros.get(0).atacarArmas(listaGuerreiros.get(0),machado);
        listaBarbaros.get(at).atacarArmas(listaGuerreiros.get(1),machado);

        for (Guerreiro guerreiro : listaGuerreiros) {
            System.out.println("    Nome:" + guerreiro.nome + " Vida: " + guerreiro.vida+" Ataque: " + guerreiro.ataque + " Defesa: " + guerreiro.defesa);
        }
        for (Barbaro barbaro : listaBarbaros) {
            System.out.println("    Nome:" + barbaro.nome + " Vida: " + barbaro.vida+" Ataque: " + barbaro.ataque + " Defesa: " + barbaro.defesa);
        }



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

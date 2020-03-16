package Tema_Desafio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Criacao {
    int cf;
    int cm;

    //Criar personagens
    public void criarPersonagem() {
        Scanner sc = new Scanner(System.in);
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
                int cm = sc.nextInt();}
            if(tp=='M'){System.out.print("Digite qual o custo de mana: ");
                int cm = sc.nextInt();}

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
        for (Guerreiro guerreiro : listaGuerreiros) {
           System.out.println("Guerreiro -->  Nome:" + guerreiro.nome + " Vida: " + guerreiro.vida+" Ataque: " + guerreiro.ataque + " Defesa: " + guerreiro.defesa);
                }
        for (Barbaro barbaro : listaBarbaros) {
            System.out.println("Barbaro --> Nome:" + barbaro.nome + " Vida: " + barbaro.vida+" Ataque: " + barbaro.ataque + " Defesa: " + barbaro.defesa);
            }
        for (Druida druida : listaDruidas) {
            System.out.println("Druida -->  Nome:" + druida.nome + " Vida: " + druida.vida+" Ataque: " + druida.ataque + " Defesa: " + druida.defesa);
            }
        for (Mago mago : listaMagos) {
            System.out.println("Mago -->  Nome:" + mago.nome + " Vida: " + mago.vida+" Ataque: " + mago.ataque + " Defesa: " + mago.defesa);
            }
        for (Feiticeiro feiticeiro : listaFeiticeiros) {
            System.out.println("Feiticeiro -->  Nome:" + feiticeiro.nome + " Vida: " + feiticeiro.vida+" Ataque: " + feiticeiro.ataque + " Defesa: " + feiticeiro.defesa);
            }
        for (Clerigo clerigo : listaClerigos) {
            System.out.println("Clerigo -->  Nome:" + clerigo.nome + " Vida: " + clerigo.vida+" Ataque: " + clerigo.ataque + " Defesa: " + clerigo.defesa);
            }


        //int a = listaGuerreiros.size();
       // System.out.println("A listaGuerreiros tem "+a+" elementos");

        System.out.println("Escolha o atacante");
        String pl = sc.next();
        System.out.println("Escolha o alvo");
        String sl = sc.next();

        System.out.println(listaGuerreiros.get(0));
/*
        public String resgatar(int indice){
            return array.get(indice);
        }
*/

 //       listaGuerreiros(pl).atacarArmas(sl,machado);


  //      ramza.atacarArmas(ragnar, machado);//ramza(guerreiro) ataca ragnar(barbaro)




        sc.close();
    }
}





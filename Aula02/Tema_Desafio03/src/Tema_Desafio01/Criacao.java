package Tema_Desafio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Criacao {
    int qf;//quantidade de Fé
    int qm;//quantidade de Mana
    int n=0;
    private List<Guerreiro>listaGuerreiros;//6.ii -Não deve ser possível alterar o nome, ataque e defesa dos personagens
    private List<Barbaro>listaBarbaros;
    private List<Druida>listaDruidas;
    private List<Mago>listaMagos;
    private List<Clerigo>listaClerigos;
    private List<Feiticeiro>listaFeiticeiros;

    public Criacao() {
    }

    public List<Guerreiro> getListaGuerreiros() {
        return listaGuerreiros;
    }

    public List<Barbaro> getListaBarbaros() {
        return listaBarbaros;
    }

    public List<Druida> getListaDruidas() {
        return listaDruidas;
    }

    public List<Mago> getListaMagos() {
        return listaMagos;
    }

    public List<Clerigo> getListaClerigos() {
        return listaClerigos;
    }

    public List<Feiticeiro> getListaFeiticeiros() {
        return listaFeiticeiros;
    }

    //Criar personagens
    public void criarPersonagem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos personagens deseja criar? ");
        n = sc.nextInt();
        listaGuerreiros = new ArrayList<>();
        listaBarbaros = new ArrayList<>();
        listaDruidas = new ArrayList<>();
        listaMagos = new ArrayList<>();
        listaClerigos = new ArrayList<>();
        listaFeiticeiros = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            //System.out.println(i);
            System.out.println("Digite o tipo de personagem: \nG - GUERREIRO, B - BARBARO, D - DRUIDA,\nC - CLERIGO, M - MAGO ou F - FEITICEIRO;");
            char tp = sc.next().charAt(0);
            System.out.print("Digite o nome do personagem: ");
            String no = sc.next();
            System.out.print("Digite quantas vidas ele terá: ");
            int v = sc.nextInt();
            System.out.print("Digite o poder de ataque: ");
            double a = sc.nextDouble();
            System.out.print("Digite a defesa: ");
            double d = sc.nextDouble();
            if(tp=='D'){System.out.print("Digite qual a quantidade de fé: ");
                qf = sc.nextInt();}
            if(tp=='C'){System.out.print("Digite qual a quantidade de fé: ");
                qf = sc.nextInt();}
            if(tp=='F'){System.out.print("Digite qual a quantidade de mana: ");
                qm = sc.nextInt();}
            if(tp=='M'){System.out.print("Digite qual a quantidade de mana: ");
                qm = sc.nextInt();}

            String guerreiro = "Guerreiro"+n;
            if (tp == 'G') {
                listaGuerreiros.add(new Guerreiro (no, v, a, d));
                System.out.println("Guerreiros estão equipados com Machado");}
            String barbaro = "Barbaro"+n;
            if (tp == 'B') {
                listaBarbaros.add(new Barbaro (no, v, a, d));
                System.out.println("Barbaros estão equipados com Bola de Fogo");}
            String druida = "Druida"+n;
            if (tp == 'D') {
                listaDruidas.add(new Druida(no, v, a, d,qf));
                System.out.println("Druidas estão equipados com Arma Espiritual");}
            String clerigo = "Clerigo"+n;
            if (tp == 'C') {
                listaClerigos.add(new Clerigo(no, v, a, d,qf));
                System.out.println("Clerigos estão equipados com Cajado");}
            String mago = "Mago"+n;
            if (tp == 'M') {
                listaMagos.add(new Mago (no, v, a, d,qm));
                System.out.println("Magos estão equipados com Raio");}
            String feiticeiros = "Feiticeiro"+n;
            if (tp == 'F') {
                listaFeiticeiros.add(new Feiticeiro (no, v, a, d,qm));
                System.out.println("Feiticeiros estão equipados com Fire");}
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
                System.out.println("    Nome:" + druida.nome + " Vida: " + druida.vida+" Ataque: " + druida.ataque + " Defesa: " + druida.defesa+ " Fé: "+druida.fe);
                }}
         if(listaMagos.size()>0){
            System.out.println("Lista de Magos:");
            for (Mago mago : listaMagos) {
                System.out.println("    Nome:" + mago.nome + " Vida: " + mago.vida+" Ataque: " + mago.ataque + " Defesa: " + mago.defesa+ " Mana: "+mago.mana);
                }}
        if(listaFeiticeiros.size()>0){
            System.out.println("Lista de Feiticeiros:");
            for (Feiticeiro feiticeiro : listaFeiticeiros) {
             System.out.println("    Nome:" + feiticeiro.nome + " Vida: " + feiticeiro.vida+" Ataque: " + feiticeiro.ataque + " Defesa: " + feiticeiro.defesa+" Mana: "+feiticeiro.mana);
            }}
        if(listaClerigos.size()>0){
            System.out.println("Lista de Clerigos:");
            for (Clerigo clerigo : listaClerigos) {
                System.out.println("    Nome:" + clerigo.nome + " Vida: " + clerigo.vida+" Ataque: " + clerigo.ataque + " Defesa: " + clerigo.defesa+ " Fé: "+clerigo.fe);
             }}
    }

}






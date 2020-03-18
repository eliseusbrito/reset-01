package Tema_Desafio01;

import java.util.Scanner;

public class Menu {
    public int c;
    Criacao ca = new Criacao();//ca --> criacao app

    public Criacao getCa() {
        return ca;
    }

    public int getC() {
        return c;
    }

    public void printMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------------------------------\n\t\t\tSIMULADOR DE COMBATE RPG\n\n\t\t\t\t\t\tCódigo Tema02_ Desafio01: Eliseu Brito - Programa RESET CWI\n------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Digite 1 para criar personagens");
        System.out.println("Digite 2 para listar personagens");
        System.out.println("Digite 3 para equipar armas ");
        System.out.println("Digite 4 para roteiro fixo de combate");
        System.out.println("Digite 5 para criar roteiro de combate");
        System.out.println("Digite 6 para criar roteiro e personalizar equipamentos");
        System.out.println("Digite 9 para configurar relatorio");
        System.out.println("Digite 10 para ir para menu inicial");
        System.out.println();
        c = sc.nextInt();
        //sc.close();
        System.out.println("rodou printMEnu()");

        switch (c) {
            //switch(1) {
            case 1:
                ca.criarPersonagem();
                System.out.println("rodou caso 1");
                break;

            case 2:
                listarPersonagens();
                System.out.println("rodou caso 2");
                break;
            case 4:
                roteiroFixo();
                System.out.println("rodou caso 4");
                break;
            case 9:
                ConfiguraRelatorio conf = new ConfiguraRelatorio();
                conf.configRel();
                break;
            default:
                System.out.println("rodou default");
                Menu menu = new Menu();
                menu.printMenu();
        }

        int a;

/*
        if (ca.getListaGuerreiros() != null) {
            a = ca.getListaGuerreiros().size();
            System.out.println("Size: " + a);
        }
        System.out.println("A listaGuerreiros tem " + a + " elementos");
        for (Guerreiro guerreiro : ListaGuerreiros) {
            System.out.println(guerreiro);
        }
*/

/*
        for (Clerigo clerigo : ca.getListaClerigos()) {
            System.out.println("Clerigo -->  Nome:" + clerigo.nome + " Vida: " + clerigo.vida + " Ataque: " + clerigo.ataque + " Defesa: " + clerigo.defesa);
*/

/*        System.out.println("ca.getListaGuerreiros().get(0) --> "+ca.getListaGuerreiros().get(0));
        System.out.println("ca.getListaGuerreiros().get(0).nome --> "+ca.getListaGuerreiros().get(0).nome);
        System.out.println("ca.getListaBarbaros().get(0) --> "+ca.getListaBarbaros().get(0));
        System.out.println("ca.getListaBarbaros().get(0).nome --> "+ca.getListaBarbaros().get(0).nome);*/
       /* Guerreiro pum = ca.getListaGuerreiros().get(0);
        System.out.println("pum= " +pum);
        Barbaro pba= ca.getListaBarbaros().get(0);
        System.out.println("pba= " +pba);
        pum.atacarArmas(pba,machado);*/
    }

       public void roteiroFixo(){

            //Armas, Poderes e Magias
            Arma machado = new Arma("Machado", 10);
            Arma bolaDeFogo = new Arma("Bola de fogo", 5);
            Magia raio = new Magia("Raio", 10, 5);
            Magia fire = new Magia("Fire", 10, 10);
            PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual", 10, 5);
            PoderDivino cajado = new PoderDivino("Cajado", 10, 7);

            //Ataques
            ca.getListaGuerreiros().get(0).atacarArmas(ca.getListaBarbaros().get(0), machado);
            //       if (x == 2) {Guerreiro.imprimeGB();}
            ca.getListaBarbaros().get(0).atacarArmas(ca.getListaDruidas().get(0), bolaDeFogo);
            //       if (x == 2) { Barbaro.imprimeBD();  }
            ca.getListaBarbaros().get(0).atacarArmas(ca.getListaGuerreiros().get(0), bolaDeFogo);
            //     if (x == 2) { Barbaro.imprimeBG(); }
            ca.getListaBarbaros().get(0).atacarArmas(ca.getListaBarbaros().get(0), bolaDeFogo);
            //       if (x == 2) { Barbaro.imprimeBB();}
            ca.getListaDruidas().get(0).atacarPoderesDivinos(ca.getListaBarbaros().get(0), armaEspiritual);
            //       if (x == 2) { Druida.imprimeDB();}
             }


    public void listarPersonagens(){
        int a;
        if (ca.getListaGuerreiros() != null) {
            a = ca.getListaGuerreiros().size();
            System.out.println("Size: " + a);
        }

    }
    }

package Tema_Desafio01;

import java.util.Scanner;

public class Menu {

    public void rodaMenu (){
        System.out.println("\n------------------------------------------------------------------------------------------------\n\t\t\tSIMULADOR DE COMBATE RPG\n\n\t\t\t\t\t\tCódigo Tema02_ Desafio01: Eliseu Brito - Programa RESET CWI\n------------------------------------------------------------------------------------------------");
        System.out.println();
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para criar persoagens");
        System.out.println("Digite 2 para equipar armas ");
        System.out.println("Digite 3 para roteiro fixo de combate");
        System.out.println("Digite 4 para criar roteiro de combate");
        System.out.println("Digite 5 para criar roteiro e personalizar equipamentos");
        System.out.println("Digite 9 para configurar relatorio");
        System.out.println("Digite 10 para ir para menu inicial");
        c= sc.nextInt();

        switch(c) {
            case 1:
                Criacao criacao = new Criacao();
                criacao.criarPersonagem();
                System.out.println("rodou caso 1");
                break;
            case 9:
                ConfiguraRelatorio conf = new ConfiguraRelatorio();
                conf.configRel();
                break;
            default:
                System.out.println("rodou default");
                //Menu menu = new Menu();
                //Menu.rodaMenu();
        }



    }
}

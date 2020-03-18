package Tema_Desafio01;

import java.util.Scanner;
import static Tema_Desafio01.Menu.*;

public class ConfiguraRelatorio {
    public void configRel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("inicia configuração");
        System.out.println("Digite 1 para relatório padrão e 2 para detalhado: ");
        int x = sc.nextInt();
        //sc.close();
        //limparTela();
        System.out.println("Rodou configuração Relatorio: valor escolhido foi "+x);
        Menu menu = new Menu();
        menu.printMenu();
    }

    public void limparTela(){
        for(int i = 0; i < 25; i++)
            System.out.println("");
    }
}

package Tema_Desafio01;

import java.util.Scanner;

public class ConfiguraRelatorio {
    public void configRel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 1 para relatório padrão e 2 para detalhado: ");
        int x = sc.nextInt();
        sc.close();
        System.out.println("Rodou configuração Relatorio: valor escolhido foi "+x);
    }
}

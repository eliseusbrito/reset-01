package Exercicio3Melhorado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppBetter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
         List<Aluno> list = new ArrayList<>();
         System.out.print("Digite quantos alunos quer gerenciar: ");
         int n = sc.nextInt();
         for (int i = 1; i <= n; i++) {
             System.out.print("Digite o nome do Aluno " + i + " : ");
             String name = sc.next();
             System.out.print("Digite a nota do Aluno " + i + " : ");
             double nota = sc.nextDouble();
             list.add(new Aluno(name,nota));
         }

         for (Aluno alu : list){
        //Aluno alu = new Aluno("Eliseu",8);
        if (alu.nota>=7.0) {
            alu.imprimirAprovado();
        } else {
            alu.imprimirReprovado();
        }
         }

       sc.close();
    }
}

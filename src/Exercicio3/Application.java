package Exercicio3;

public class Application {
    public static void main(String[] args) {

        Aluno alu = new Aluno("Eliseu",8);
        if (alu.nota>=7.0) {
            alu.imprimirAprovado();
        } else {
            alu.imprimirReprovado();
        }
         }

           }


package Exercicio3;

public class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void imprimirAprovado(){
        System.out.println("Nome do Aluno: " +nome);
        System.out.println("Nota Final: " + nota);
        System.out.println("Situação: Aprovado");
    }

    public void imprimirReprovado(){
        System.out.println("Nome do Aluno: " +nome);
        System.out.println("Nota Final: " + nota);
        System.out.println("Situação: Reprovado");
    }

}

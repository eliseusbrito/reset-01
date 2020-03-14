package Exercicio3Melhorado;

public class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void imprimirAprovado(){
        System.out.println("Nome do Aluno: " +nome +"   Nota Final: " + nota + "     Situação: Aprovado");
    }

    public void imprimirReprovado(){
        System.out.println("Nome do Aluno: " +nome +"   Nota Final: " + nota + "     Situação: Reprovado");
    }

}

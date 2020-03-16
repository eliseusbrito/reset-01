package exercicio1;

public class Aluno {
    String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    void obterNota(){
        System.out.println("Rodou metodo obterNota");
    }

    private void montarCola(){
        System.out.println("Rodou metodo montarCola");
    }

}

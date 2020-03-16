package exercicio1;

public class App {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Eliseu");
        Turma turma = new Turma("71");
        System.out.println(aluno.nome);
        System.out.println(turma.nome);
        aluno.obterNota();
        //aluno.montarCola();dá erro pois esta protegido com private
        turma.obterNome();
        turma.obterQuantidadeDeAlunos();


    }
}

package console;

import dominio.CategoriaCuriosidade;
import dominio.Curiosidade;
import gerenciador.CuriosidadeGerenciador;

import java.util.List;
import java.util.Scanner;

public class CuriosidadeMenu {
    private CuriosidadeGerenciador gerenciador;

    public CuriosidadeMenu() {
        this.gerenciador = new CuriosidadeGerenciador();
    }

    public void opcoes(){
        Scanner sc = new Scanner(System.in);
        char opcao=' ';
        while (opcao != 'X') {
            System.out.println("Digite a opção");
            System.out.println("[C] - Cadastrar \n[L] - Listar\n[P] - Pesquisar\n[D] - Deletar\n[E] - Editar\n[X] - Sair");
            opcao = sc.next().charAt(0);
            switch (opcao) {
                case 'C':
                    cadastrar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    pesquisar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'E':
                    editar();
                    break;
            }}
    }

    public Curiosidade cadastrar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrar Curiosidade");
        System.out.print("Descreva a Curiosidade> ");
        String descricao = sc.next();
        System.out.println(" [ C ] COMPORTAMENTO \n [ E ] EVENTO \n [ A ] APARÊNCIA \n [ L ] ALIMENTAÇÃO");
        System.out.print("> ");
        char estilo = sc.next().charAt(0);
        CategoriaCuriosidade categoriaCuriosidade;
        switch (estilo) {
            case 'C':
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case 'E':
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case 'A':
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case 'L':
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.NAOINFORMADA;
                break;
        }

        Curiosidade curiosidade = new Curiosidade(descricao,categoriaCuriosidade);
        return gerenciador.salvar(curiosidade);


    }

    public List<Curiosidade> listar(){
        System.out.println("\nListagem de Curiosidade...");
        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);       }
        return curiosidades;    }

    public void pesquisar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Curiosidade...");
        System.out.println("Qual o código da curiosidade? ");
        System.out.print("> ");
        int id = scanner.nextInt();
        Curiosidade curiosidade = gerenciador.pesquisar(id);
        if (curiosidade == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidade);
        }    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Curiosidade...");
        System.out.println("Qual curiosidade deseja deletar?");
        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }
        System.out.print("> ");
        int id = scanner.nextInt();
        if (gerenciador.deletar(id)) {
            System.out.println("Curiosidade deletada.");
        } else {
            System.out.println("Curiosidade não encontrada.");
        }     }

    public Curiosidade editar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEdição de Curiosidade...");
        System.out.println("Qual curiosidade deseja editar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        System.out.print("> ");
        int id = sc.nextInt();
        System.out.print("Descreva a Curiosidade> ");
        String descricao = sc.next();
        System.out.println(" [ C ] COMPORTAMENTO \n [ E ] EVENTO \n [ A ] APARÊNCIA \n [ L ] ALIMENTAÇÃO");
        System.out.print("> ");
        char estilo = sc.next().charAt(0);
        CategoriaCuriosidade categoriaCuriosidade;
        switch (estilo) {
            case 'C':
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case 'E':
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case 'A':
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case 'L':
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.NAOINFORMADA;
                break;
        }



       Curiosidade atualizacao = new Curiosidade(descricao, categoriaCuriosidade);

       Curiosidade curiosidadeAtualizada = gerenciador.editar(id, atualizacao);

        if (curiosidadeAtualizada == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidadeAtualizada);
        }

        return curiosidadeAtualizada;
    }

}

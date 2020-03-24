package console;

import dominio.Esporte;
import gerenciador.EsporteGerenciador;

import java.util.List;
import java.util.Scanner;

public class EsporteMenu {
    private EsporteGerenciador gerenciador;

    public EsporteMenu() {
        this.gerenciador = new EsporteGerenciador();
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

    public Esporte cadastrar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrar Esporte");
        System.out.print("Digite o nome do Esporte> ");
        String nome = sc.next();

        Esporte esporte = new Esporte(nome);
        return gerenciador.salvar(esporte);
    }

    public List<Esporte> listar(){
        System.out.println("\nListagem de Esporte...");
        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println(esporte);       }
        return esportes;    }

    public void pesquisar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Esporte...");
        System.out.println("Qual o código do esporte? ");
        System.out.print("> ");
        int id = scanner.nextInt();
        Esporte esporte = gerenciador.pesquisar(id);
        if (esporte == null) {
            System.out.println("Esporte não encontrado.");
        } else {
            System.out.println(esporte);
        }    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Esporte...");
        System.out.println("Qual esporte deseja deletar?");
        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[" + esporte.getId() + "] - " + esporte.getNome());
        }
        System.out.print("> ");
        int id = scanner.nextInt();
        if (gerenciador.deletar(id)) {
            System.out.println("Esporte deletado.");
        } else {
            System.out.println("Esporte não encontrado.");
        }     }

    public Esporte editar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEdição de Esporte...");
        System.out.println("Qual esporte deseja editar?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[" + esporte.getId() + "] - " + esporte.getNome());
        }

        System.out.print("> ");
        int id = sc.nextInt();

        System.out.print("Digite o nome da Esporte> ");
        String nome = sc.next();

        Esporte atualizacao = new Esporte(nome);

        Esporte esporteAtualizada = gerenciador.editar(id, atualizacao);

        if (esporteAtualizada == null) {
            System.out.println("Esporte não encontrado.");
        } else {
            System.out.println(esporteAtualizada);
        }

        return esporteAtualizada;
    }

}


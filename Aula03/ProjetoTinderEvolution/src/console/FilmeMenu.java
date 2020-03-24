package console;

import dominio.CategoriaFilme;
import dominio.Filme;
import gerenciador.FilmeGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class FilmeMenu {

    private FilmeGerenciador gerenciador;

    public FilmeMenu() {
        this.gerenciador = new FilmeGerenciador();
    }

    public void opcoes() {
        Scanner sc = new Scanner(System.in);
        char opcao = ' ';
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
            }
        }
    }

    public Filme cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrar Filme");
        System.out.print("Digite o nome do Filme> ");
        String nome = sc.next();
        System.out.print("Digite o Diretor do Filme> ");
        String artista = sc.next();
        System.out.print("Digite o dia de lançamento> ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de lançamento> ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de lançamento> ");
        int ano = sc.nextInt();
        System.out.println("Escolha a categoria do filme> ");
        System.out.println("[ D ] DRAMA \n[ C ] COMEDIA \n[ S ] SUSPENSE \n [ T ] TERROR \n [ A ] AÇÃO \n [ M ] MUSICAL");
        System.out.print("> ");
        char categoria = sc.next().charAt(0);
        CategoriaFilme categoriaFilme;
        switch (categoria) {
            case 'D':
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case 'C':
                categoriaFilme = CategoriaFilme.COMEDIA;
                break;
            case 'S':
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case 'T':
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case 'A':
                categoriaFilme = CategoriaFilme.ACAO;
                break;
            case 'M':
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.NAOINFORMADO;
                break;
        }
        System.out.print("Digite a sinopse do Filme> ");
        String sinopse = sc.next();

        Filme filme = new Filme(nome, artista, LocalDate.of(ano, mes, dia), categoriaFilme, sinopse);
        return gerenciador.salvar(filme);

    }

    public List<Filme> listar() {
        System.out.println("\nListagem de Filmes...");
        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        return filmes;
    }

    public void pesquisar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Filmes...");
        System.out.println("Qual o código do filme? ");
        System.out.print("> ");
        int id = scanner.nextInt();
        Filme filme = gerenciador.pesquisar(id);
        if (filme == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filme);
        }
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Filmes...");
        System.out.println("Qual filme deseja deletar?");
        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
        }
        System.out.print("> ");
        int id = scanner.nextInt();
        if (gerenciador.deletar(id)) {
            System.out.println("Filme deletado.");
        } else {
            System.out.println("Filme não encontrado.");
        }
    }

    public Filme editar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEdição de Filme...");
        System.out.println("Qual filme deseja editar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
        }

        System.out.print("> ");
        int id = sc.nextInt();
        System.out.print("Digite o nome do Filme> ");
        String nome = sc.next();
        System.out.print("Digite o Diretor do Filme> ");
        String artista = sc.next();
        System.out.print("Digite o dia de lançamento> ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de lançamento> ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de lançamento> ");
        int ano = sc.nextInt();
        System.out.println("Escolha o estilo do filme> ");
        System.out.println("[ D ] DRAMA \n[ C ] COMEDIA \n[ S ] SUSPENSE \n [ T ] TERROR \n [ A ] AÇÃO \n [ M ] MUSICAL");
        System.out.print("> ");
        char estilo = sc.next().charAt(0);
        CategoriaFilme categoriaFilme;
        switch (estilo) {
            case 'D':
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case 'C':
                categoriaFilme = CategoriaFilme.COMEDIA;
                break;
            case 'S':
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case 'T':
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case 'A':
                categoriaFilme = CategoriaFilme.ACAO;
                break;
            case 'M':
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.NAOINFORMADO;
                break;
        }
        System.out.print("Digite a sinopse do Filme> ");
        String sinopse = sc.next();
        Filme atualizacao = new Filme(nome, artista, LocalDate.of(ano, mes, dia), categoriaFilme,sinopse);

        Filme filmeAtualizada = gerenciador.editar(id, atualizacao);

        if (filmeAtualizada == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filmeAtualizada);
        }

        return filmeAtualizada;

    }
}
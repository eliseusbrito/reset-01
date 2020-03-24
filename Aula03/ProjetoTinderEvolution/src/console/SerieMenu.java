package console;

import dominio.CategoriaSerie;
import dominio.Serie;
import gerenciador.SerieGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class SerieMenu {
    private SerieGerenciador gerenciador;

    public SerieMenu() {
        this.gerenciador = new SerieGerenciador();
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

    public Serie cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrar Série");
        System.out.print("Digite o nome da Série> ");
        String nome = sc.next();
        System.out.print("Digite o Diretor> ");
        String diretor = sc.next();
        System.out.print("Digite o dia de lançamento> ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de lançamento> ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de lançamento> ");
        int ano = sc.nextInt();
        System.out.print("Digite o número de Temporadas> ");
        int temporadas = sc.nextInt();
        System.out.print("Digite o número de Episódios> ");
        int episodios = sc.nextInt();
        System.out.println("Escolha o estilo da série> ");
        System.out.println("[ D ] DRAMA \n[ C ] COMEDIA \n[ S ] SUSPENSE \n [ T ] TERROR \n [ A ] AÇÃO \n [ I ] SITCOM");
        System.out.print("> ");
        char estilo = sc.next().charAt(0);
        CategoriaSerie categoriaSerie;
        switch (estilo) {
            case 'D':
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case 'C':
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case 'S':
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case 'T':
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            case 'A':
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case 'M':
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie = CategoriaSerie.NAOINFORMADO;
                break;
        }
        System.out.print("Digite a sinopse do Filme> ");
        String sinopse = sc.next();


        Serie serie = new Serie(nome,diretor, LocalDate.of(ano, mes, dia),temporadas, episodios,categoriaSerie,sinopse);
        return gerenciador.salvar(serie);


    }

    public List<Serie> listar(){
        System.out.println("\nListagem de Série...");
        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println(serie);       }
        return series;    }

    public void pesquisar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Série...");
        System.out.println("Qual o código da série? ");
        System.out.print("> ");
        int id = scanner.nextInt();
        Serie serie = gerenciador.pesquisar(id);
        if (serie == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serie);
        }    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Série...");
        System.out.println("Qual série deseja deletar?");
        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }
        System.out.print("> ");
        int id = scanner.nextInt();
        if (gerenciador.deletar(id)) {
            System.out.println("Série deletada.");
        } else {
            System.out.println("Série não encontrada.");
        }     }

    public Serie editar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEdição de Série...");
        System.out.println("Qual série deseja editar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        System.out.print("> ");
        int id = sc.nextInt();

        System.out.print("Digite o nome da Série> ");
        String nome = sc.next();
        System.out.print("Digite o Diretor> ");
        String diretor = sc.next();
        System.out.print("Digite o dia de lançamento> ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de lançamento> ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de lançamento> ");
        int ano = sc.nextInt();
        System.out.print("Digite o número de Temporadas> ");
        int temporadas = sc.nextInt();
        System.out.print("Digite o número de Episódios> ");
        int episodios = sc.nextInt();
        System.out.println("Escolha a categoria da série> ");
        System.out.println("[ D ] DRAMA \n[ C ] COMEDIA \n[ S ] SUSPENSE \n [ T ] TERROR \n [ A ] AÇÃO \n [ I ] SITCOM");
        System.out.print("> ");
        char categoria = sc.next().charAt(0);
        CategoriaSerie categoriaSerie;
        switch (categoria) {
            case 'D':
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case 'C':
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case 'S':
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case 'T':
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            case 'A':
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case 'I':
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie = CategoriaSerie.NAOINFORMADO;
                break;
        }
        System.out.print("Digite a sinopse do Filme> ");
        String sinopse = sc.next();

        Serie atualizacao = new Serie(nome,diretor, LocalDate.of(ano, mes, dia),temporadas, episodios,categoriaSerie,sinopse);

        Serie serieAtualizada = gerenciador.editar(id, atualizacao);

        if (serieAtualizada == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serieAtualizada);
        }

        return serieAtualizada;
    }
}

package console;

import dominio.CategoriaJogo;
import dominio.Jogo;
import dominio.PlataformaJogo;
import gerenciador.JogoGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class JogoMenu {
    private JogoGerenciador gerenciador;
    String pb;

    public JogoMenu() {
        this.gerenciador = new JogoGerenciador();
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

    public Jogo cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrar Jogo");
        System.out.print("Digite o nome da Jogo> ");
        String nome = sc.next();
        System.out.println("Você deseja informar o Publisher - [S] Sim     [N] Não");
        char decisao = sc.next().charAt(0);
        if(decisao =='S'){
             System.out.print("Digite o Publisher> ");
             String pbi = sc.next();
        pb = pbi;}else{pb=null;}

        System.out.print("Digite o dia de lançamento> ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de lançamento> ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de lançamento> ");
        int ano = sc.nextInt();
        System.out.println("Escolha a categoria do jogo> ");
        System.out.println("[ D ] DRAMA\n [ C ] COMEDIA \n [ S] SUSPENSE \n [ T ] TERROR \n [ A ] AÇÃO \n [ M ] MUSICAL");
        System.out.print("> ");
        char categoria = sc.next().charAt(0);
        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case 'D':
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case 'C':
                categoriaJogo = CategoriaJogo.COMEDIA;
                break;
            case 'S':
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case 'T':
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            case 'A':
                categoriaJogo = CategoriaJogo.ACAO;
                break;
            case 'M':
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            default:
                categoriaJogo = CategoriaJogo.NAOINFORMADO;
                break;
        }
        System.out.println("Escolha a plataforma do jogo> ");
        System.out.println("[ X ] XBOX \n [ P ] PS4 \n [ C ] PC \n [ S ] SNES");
        System.out.print("> ");
        char plataforma = sc.next().charAt(0);
        PlataformaJogo plataformaJogo;
        switch (plataforma) {
            case 'X':
                plataformaJogo = PlataformaJogo.XBOX;
                break;
            case 'P':
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case 'C':
                plataformaJogo = PlataformaJogo.PC;
                break;
            case 'S':
                plataformaJogo = PlataformaJogo.SNES;
                break;
            default:
                plataformaJogo = PlataformaJogo.NAOINFORMADA;
                break;
        }


        Jogo jogo = new Jogo(nome,pb,LocalDate.of(ano, mes, dia),categoriaJogo,plataformaJogo);
        return gerenciador.salvar(jogo);
    }

    public List<Jogo> listar(){
        System.out.println("\nListagem de Jogos...");
        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println(jogo);       }
        return jogos;    }

    public void pesquisar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Jogos...");
        System.out.println("Qual o código da jogo? ");
        System.out.print("> ");
        int id = scanner.nextInt();
        Jogo jogo = gerenciador.pesquisar(id);
        if (jogo == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogo);
        }    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Jogo...");
        System.out.println("Qual jogo deseja deletar?");
        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }
        System.out.print("> ");
        int id = scanner.nextInt();
        if (gerenciador.deletar(id)) {
            System.out.println("Jogo deletado.");
        } else {
            System.out.println("Jogo não encontrado.");
        }     }

    public Jogo editar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEdição de Jogo...");
        System.out.println("Qual jogo deseja editar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }
        System.out.print("> ");
        int id = sc.nextInt();

        System.out.print("Digite o nome da Jogo> ");
        String nome = sc.next();
        System.out.print("Digite o Publisher> ");
        String publisher = sc.next();
        System.out.print("Digite o dia de lançamento> ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de lançamento> ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de lançamento> ");
        int ano = sc.nextInt();
        System.out.println("Escolha a categoria do jogo> ");
        System.out.println("[ D ] DRAMA\n [ C ] COMEDIA \n [ S] SUSPENSE \n [ T ] TERROR \n [ A ] AÇÃO \n [ M ] MUSICAL");
        System.out.print("> ");
        char categoria = sc.next().charAt(0);
        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case 'D':
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case 'C':
                categoriaJogo = CategoriaJogo.COMEDIA;
                break;
            case 'S':
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case 'T':
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            case 'A':
                categoriaJogo = CategoriaJogo.ACAO;
                break;
            case 'M':
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            default:
                categoriaJogo = CategoriaJogo.NAOINFORMADO;
                break;
        }
        System.out.println("Escolha a plataforma do jogo> ");
        System.out.println("[ X ] XBOX \n [ P ] PS4 \n [ C ] PC \n [ S ] SNES");
        System.out.print("> ");
        char plataforma = sc.next().charAt(0);
        PlataformaJogo plataformaJogo;
        switch (plataforma) {
            case 'X':
                plataformaJogo = PlataformaJogo.XBOX;
                break;
            case 'P':
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case 'C':
                plataformaJogo = PlataformaJogo.PC;
                break;
            case 'S':
                plataformaJogo = PlataformaJogo.SNES;
                break;
            default:
                plataformaJogo = PlataformaJogo.NAOINFORMADA;
                break;
        }
        Jogo atualizacao = new Jogo(nome,publisher,LocalDate.of(ano, mes, dia),categoriaJogo,plataformaJogo);

        Jogo jogoAtualizado = gerenciador.editar(id, atualizacao);

        if (jogoAtualizado == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogoAtualizado);
        }

        return jogoAtualizado;
    }

}


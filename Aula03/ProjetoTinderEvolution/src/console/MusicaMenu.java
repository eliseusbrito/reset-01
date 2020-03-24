package console;

import dominio.EstiloMusical;
import dominio.Musica;
import gerenciador.MusicaGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MusicaMenu {

    private MusicaGerenciador gerenciador;

    public MusicaMenu() {
        this.gerenciador = new MusicaGerenciador();
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

    public Musica cadastrar(){
        //Musica musica = new Musica("Não Sei" ,"Sei não", "Desconhecido",LocalDate.of(2019, 07, 14),EstiloMusical.FUNK);
        //Musica musica1 = new Musica("Voando" ,"Sabino", "Desconhecido",LocalDate.of(2015, 04, 5),EstiloMusical.PAGODE);

            Scanner sc = new Scanner(System.in);
            System.out.println("Cadastrar Música");
            System.out.print("Digite o nome da Música> ");
            String nome = sc.next();
            System.out.print("Digite o Artista> ");
            String artista = sc.next();
            System.out.print("Digite o Autor> ");
            String autor = sc.next();
            System.out.print("Digite o dia de lançamento> ");
            int dia = sc.nextInt();
            System.out.print("Digite o mês de lançamento> ");
            int mes = sc.nextInt();
            System.out.print("Digite o ano de lançamento> ");
            int ano = sc.nextInt();
            System.out.println("Escolha o estilo musical> ");
            System.out.println("[ F ] FUNK\n[ P ] PAGODE\n[ R ] ROCK [ I ] INDIE\n[ S ] SERTANEJO\n[ M ] METAL");
            System.out.print("> ");
            char estilo = sc.next().charAt(0);
            EstiloMusical estiloMusical;
            switch (estilo) {
                case 'F':
                    estiloMusical = EstiloMusical.FUNK;
                    break;
                case 'P':
                    estiloMusical = EstiloMusical.PAGODE;
                    break;
                case 'R':
                    estiloMusical = EstiloMusical.ROCK;
                    break;
                case 'I':
                    estiloMusical = EstiloMusical.INDIE;
                    break;
                case 'S':
                    estiloMusical = EstiloMusical.SERTANEJO;
                    break;
                case 'M':
                    estiloMusical = EstiloMusical.METAL;
                    break;
                default:
                    estiloMusical = EstiloMusical.NAOINFORMADO;
                    break;
            }

          Musica musica = new Musica(nome,artista, autor,LocalDate.of(ano, mes, dia),estiloMusical);
          return gerenciador.salvar(musica);


        }

    public List<Musica> listar(){
       System.out.println("\nListagem de Música...");
       List<Musica> musicas = gerenciador.listar();
       for (Musica musica : musicas) {
           System.out.println(musica);       }
       return musicas;    }

    public void pesquisar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Música...");
        System.out.println("Qual o código da música? ");
        System.out.print("> ");
        int id = scanner.nextInt();
        Musica musica = gerenciador.pesquisar(id);
        if (musica == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musica);
        }    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Música...");
        System.out.println("Qual música deseja deletar?");
        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println("[" + musica.getId() + "] - " + musica.getNome());
        }
        System.out.print("> ");
        int id = scanner.nextInt();
        if (gerenciador.deletar(id)) {
            System.out.println("Música deletada.");
        } else {
            System.out.println("Música não encontrada.");
        }     }

    public Musica editar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEdição de Música...");
        System.out.println("Qual música deseja editar?");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println("[" + musica.getId() + "] - " + musica.getNome());
        }

        System.out.print("> ");
        int id = sc.nextInt();

        System.out.print("Digite o nome da Música> ");
        String nome = sc.next();
        System.out.print("Digite o Artista> ");
        String artista = sc.next();
        System.out.print("Digite o Autor> ");
        String autor = sc.next();
        System.out.print("Digite o dia de lançamento> ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de lançamento> ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de lançamento> ");
        int ano = sc.nextInt();
        System.out.println("Escolha o estilo musical> ");
        System.out.println("[ F ] FUNK\n[ P ] PAGODE\n[ R ] ROCK [ I ] INDIE\n[ S ] SERTANEJO\n[ M ] METAL");
        System.out.print("> ");
        char estilo = sc.next().charAt(0);
        EstiloMusical estiloMusical;
        switch (estilo) {
            case 'F':
                estiloMusical = EstiloMusical.FUNK;
                break;
            case 'P':
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case 'R':
                estiloMusical = EstiloMusical.ROCK;
                break;
            case 'I':
                estiloMusical = EstiloMusical.INDIE;
                break;
            case 'S':
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            case 'M':
                estiloMusical = EstiloMusical.METAL;
                break;
            default:
                estiloMusical = EstiloMusical.NAOINFORMADO;
                break;
        }


        Musica atualizacao = new Musica(nome, artista, autor, LocalDate.of(ano, mes, dia), estiloMusical);

        Musica musicaAtualizada = gerenciador.editar(id, atualizacao);

        if (musicaAtualizada == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musicaAtualizada);
        }

        return musicaAtualizada;
    }
}




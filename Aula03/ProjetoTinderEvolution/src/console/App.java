package console;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MusicaMenu musicaMenu = new MusicaMenu();
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        FilmeMenu filmeMenu = new FilmeMenu();
        SerieMenu serieMenu = new SerieMenu();
        JogoMenu jogoMenu = new JogoMenu();
        EsporteMenu esporteMenu = new EsporteMenu();
        CuriosidadeMenu curiosidadeMenu = new CuriosidadeMenu();

        System.out.println("Bem vindo ao Tinder Evolution\n");
        char opcao=' ';
        while (opcao != 'X') {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a opção");
            System.out.println(" [U] - Usuário\n [M] - Música \n [F] - Filmes \n [S] - Séries \n [J] - Jogos \n [E] - Esportes \n [C] - Curiosidades \n [X] - Sair");
            opcao = sc.next().charAt(0);
            switch (opcao) {
                case 'U':
                    usuarioMenu.opcoes();
                    break;
                case 'M':
                    musicaMenu.opcoes();
                    break;
                case 'F':
                    filmeMenu.opcoes();
                    break;
                case 'S':
                    serieMenu.opcoes();
                    break;
                case 'J':
                    jogoMenu.opcoes();
                    break;
                case 'E':
                    esporteMenu.opcoes();
                    break;
                case 'C':
                    curiosidadeMenu.opcoes();
                    break;
                case 'X':
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }
}

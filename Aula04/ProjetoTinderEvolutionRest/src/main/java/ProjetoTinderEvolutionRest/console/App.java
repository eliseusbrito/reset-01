package ProjetoTinderEvolutionRest.console;

public class App {
    public static void main(String[] args) {
        CadastroInicial cadastroInicial = new CadastroInicial();
        cadastroInicial.todos();

        Opcoes opcoes = new Opcoes();
        CurtidaMenu avaliacao = new CurtidaMenu();
        DesCurtidaMenu desavaliacao = new DesCurtidaMenu();

        ListaMenu pesquisa = new ListaMenu();
//        LikeDislikeUsuarioMenuTipoBancoDados matchMenu = new LikeDislikeUsuarioMenuTipoBancoDados();
        LikeDislikeUsuarioMenu matchMenu = new LikeDislikeUsuarioMenu();


        System.out.println("\n********* Bem vindo ao Tinder Evolution *********\n");
        System.out.println("Aqui você pode conhecer pessoas novas baseada nos gostos em comum.");
        System.out.println("Cadastre seu usuário, suas preferencias de músicas, filmes, séries, jogos, esporte e curiosidades");
        System.out.println("Você pode Curtir os itens cadastrados e listar os itens curtidos de um determinado usuário.");
        System.out.println("Também pode dar like ou dislike nos usuários.");
        System.out.println("Quando dois usuários derem \"like\" entre si, um match é criado e você pode lista-lo");
        System.out.println("Ainda tem a opção de listar o usuário com mais características em comum que já não tenha um match ou dislike");
        System.out.println("");
        char opcao=' ';
        while (opcao != 'X') {
            System.out.println("Bem vindo a Tela Inicial do Tinder Evolution");
            System.out.println("Digite a opção:\n [C] - CURTIR ITENS  \n [L] - LISTAR ITENS\n [D] - DESCURTIR ITENS\n [M] - MATCH & LikeDisLike USUARIOS\n Cadastros:");

            opcao = MeuScannerCustomizado.nextChar("   [U] - Usuário\n   [m] - Música\n   [F] - Filmes\n   [S] - Séries\n   [J] - Jogos\n   [E] - Esportes\n   [I] - Curiosidades\n [X] - Sair\n > ");
            switch (opcao) {
                case 'C':
                    avaliacao.opcoes();
                    break;
                case 'L':
                    pesquisa.opcoes();
                    break;
                case 'D':
                    desavaliacao.opcoes();
                    break;
                case 'M':
//                  matchMenu.entradaDados();
                  matchMenu.entradaDados();
                    break;
                case 'U':
                    opcoes.listarOpcoes('U');
                    break;
                case 'm':
 //                 musicaMenu.opcoes();
                    opcoes.listarOpcoes('m');
                    break;
                case 'F':
                    opcoes.listarOpcoes('F');
                    break;
                case 'S':
                    opcoes.listarOpcoes('S');
                    break;
                case 'J':
                    opcoes.listarOpcoes('J');
                    break;
                case 'E':
                    opcoes.listarOpcoes('E');
                    break;
                case 'I':
                    opcoes.listarOpcoes('I');
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

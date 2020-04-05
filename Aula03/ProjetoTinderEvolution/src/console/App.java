package console;

public class App {
    public static void main(String[] args) {
        CadastroInicial cadastroInicial = new CadastroInicial();
        cadastroInicial.todos();

        Opcoes opcoes = new Opcoes();
        AvaliacaoMenu avaliacao = new AvaliacaoMenu();
        PesquisaMenu pesquisa = new PesquisaMenu();


        System.out.println("\nBem vindo ao Tinder Evolution\n");
        char opcao=' ';
        while (opcao != 'X') {
            opcao = MeuScannerCustomizado.nextChar("Digite a opção\n [U] - Usuário\n [M] - Música\n [F] - Filmes\n [S] - Séries\n [J] - Jogos\n [E] - Esportes\n [C] - Curiosidades\n [A] - Avaliações\n [P] - Pesquisas\n [M] - Match\n [X] - Sair\n > ");
            switch (opcao) {
                case 'U':
                    opcoes.listarOpcoes('U');
                    break;
                case 'M':
 //                 musicaMenu.opcoes();
                    opcoes.listarOpcoes('M');
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
                case 'C':
                    opcoes.listarOpcoes('C');
                    break;
                case 'A':
                    avaliacao.opcoes();
                    break;
                case 'P':
                    pesquisa.opcoes();
                    break;
                case 'T':

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

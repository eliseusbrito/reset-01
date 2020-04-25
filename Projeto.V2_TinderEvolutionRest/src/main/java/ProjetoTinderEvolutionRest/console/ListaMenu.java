package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;

public class ListaMenu {
    Usuario sapo = new Usuario();

    public void opcoes() {
        char opcao = ' ';
        while (opcao != 'V') {
            opcao = MeuScannerCustomizado.nextChar("\nDigite qual item você quer listar\n [M] - Música\n [F] - Filmes\n [S] - Séries\n [J] - Jogos\n [E] - Esportes\n [C] - Curiosidades\n [V] - Voltar\n > ");
            switch (opcao) {
                case 'M':
                    listaMusica();
                    break;
                case 'F':
                    listaFilme();
                    break;
                case 'S':
                    listaSerie();
                    break;
                case 'J':
                    listaJogo();
                    break;
                case 'E':
                    listaEsporte();
                    break;
                case 'C':
                    listaCuriosidade();
                    break;
                case 'X':
                    System.out.println("Saindo...");
                    break;
                default:
            }
        }
    }

    public Usuario listaMusica() {
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        int idUsuario = MeuScannerCustomizado.nextInt("Digite o Usuario:\n >");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        usuario.listarMusicasCurtidas(usuario.getId());
        return usuario;
            };

    public Usuario listaFilme() {
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        int idUsuario = MeuScannerCustomizado.nextInt("Digite o Usuario:\n >");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        usuario.listarFilmesCurtidos(usuario.getId(),usuario.getNome());
        return usuario;
    };
    public Usuario listaSerie() {
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        int idUsuario = MeuScannerCustomizado.nextInt("Digite o Usuario:\n >");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        usuario.listarSeriesCurtidas(usuario.getId(),usuario.getNome());
        return usuario;
    };

    public Usuario listaJogo() {
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        int idUsuario = MeuScannerCustomizado.nextInt("Digite o Usuario:\n >");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        usuario.listarJogosCurtidos(usuario.getId(),usuario.getNome());
        return usuario;
    };

    public Usuario listaEsporte() {
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        int idUsuario = MeuScannerCustomizado.nextInt("Digite o Usuario:\n >");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        usuario.listarEsportesCurtidos(usuario.getId(),usuario.getNome());
        return usuario;
    };

    public Usuario listaCuriosidade() {
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        int idUsuario = MeuScannerCustomizado.nextInt("Digite o Usuario:\n >");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        usuario.listarCuriosidadesCurtidas(usuario.getId(),usuario.getNome());
        return usuario;
    };
}

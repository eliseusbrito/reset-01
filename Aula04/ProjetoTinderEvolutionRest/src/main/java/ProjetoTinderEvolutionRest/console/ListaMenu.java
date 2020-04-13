package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.acervo.CurtidaMusicaAcervo;
import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.MusicaGerenciador;
import ProjetoTinderEvolutionRest.console.UsuarioMenu;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;

import java.util.ArrayList;
import java.util.List;

import static ProjetoTinderEvolutionRest.acervo.LikeDisUsuarioAcervo.avalUsuarios;
import static ProjetoTinderEvolutionRest.acervo.UsuarioAcervo.usuarios;

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

//    public void listaMusica() {
//        UsuarioMenu usuarioMenu = new UsuarioMenu();
//        usuarioMenu.listar();
//        CurtidaMusicaAcervo avaliacaoMusicaAcervo = new CurtidaMusicaAcervo();
//        System.out.println("\nLista músicas curtidas de determinado usuário");
//        int idUsuario = MeuScannerCustomizado.nextInt("Digite o Usuario:\n >");
//        for (int f = 0; f < UsuarioAcervo.usuarios.size(); f++) {
//            if (UsuarioAcervo.usuarios.get(f).getId() == idUsuario){
//            System.out.println("Listagem de Músicas do Usuario " + UsuarioAcervo.usuarios.get(f).getNome());
//        }}
//        avaliacaoMusicaAcervo.listaPorUsuario(idUsuario);
//    }

    public Usuario listaMusica() {
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        int idUsuario = MeuScannerCustomizado.nextInt("Digite o Usuario:\n >");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        usuario.listarMusicasCurtidas(usuario.getId(),usuario.getNome());
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

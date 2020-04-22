package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.LikeDislikeGerenciador;

public class DesCurtidaMenu {

    private LikeDislikeGerenciador gerenciadorLikeDislike = new LikeDislikeGerenciador();


    public void opcoes() {
        char opcao = ' ';
        while (opcao != 'V') {
            opcao = MeuScannerCustomizado.nextChar("Digite qual item você quer Descurtir:\n [M] - Música\n [F] - Filmes\n [S] - Séries\n [J] - Jogos\n [E] - Esportes\n [C] - Curiosidades\n [V] - Voltar\n > ");
            switch (opcao) {
                case 'M':
                    descurtirMusica();
                    break;
                case 'F':
                    descurtirFilme();
                    break;
                case 'S':
                    descurtirSerie();
                    break;
                case 'J':
                    descurtirJogo();
                    break;
                case 'E':
                    descurtirEsporte();
                    break;
                case 'C':
                    descurtirCuriosidade();
                    break;
                case 'X':
                    System.out.println("Voltando...");
                    break;
                default:
            }
        }
    }

    public Usuario descurtirMusica() {
        MusicaMenu musicaMenu = new MusicaMenu();
        musicaMenu.listar();
        int musica = MeuScannerCustomizado.nextInt("Digite a Música que quer DesCurtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorLikeDislike.descurtirMusica(musica, usuario);
    }
    public Usuario descurtirFilme() {
        FilmeMenu filmeMenu = new FilmeMenu();
        filmeMenu.listar();
        int filme = MeuScannerCustomizado.nextInt("Digite o Filme que quer DesCurtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorLikeDislike.descurtirFilme(filme, usuario);
    }
    public Usuario descurtirSerie() {
        SerieMenu serieMenu = new SerieMenu();
        serieMenu.listar();
        int serie = MeuScannerCustomizado.nextInt("Digite a Série que quer DesCurtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorLikeDislike.descurtirSerie(serie, usuario);
    }
    public Usuario descurtirJogo() {
        JogoMenu jogoMenu = new JogoMenu();
        jogoMenu.listar();
        int jogo = MeuScannerCustomizado.nextInt("Digite o Jogo que quer DesCurtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorLikeDislike.descurtirJogo(jogo, usuario);
    }

    public Usuario descurtirEsporte() {
        EsporteMenu esporteMenu = new EsporteMenu();
        esporteMenu.listar();
        int esporte = MeuScannerCustomizado.nextInt("Digite o Esporte que quer DesCurtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorLikeDislike.descurtirEsporte(esporte, usuario);
    }
    public Usuario descurtirCuriosidade() {
        CuriosidadeMenu curiosidadeMenu = new CuriosidadeMenu();
        curiosidadeMenu.listar();
        int curiosidade = MeuScannerCustomizado.nextInt("Digite a Curiosidade que quer DesCurtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorLikeDislike.descurtirCuriosidade(curiosidade, usuario);
    }

}

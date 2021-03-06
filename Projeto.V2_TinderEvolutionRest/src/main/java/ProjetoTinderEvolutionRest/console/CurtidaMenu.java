package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.CurtirDescurtirGerenciador;

public class CurtidaMenu {

    private CurtirDescurtirGerenciador gerenciadorCurtirDescurtir = new CurtirDescurtirGerenciador();


    public void opcoes() {
        char opcao = ' ';
        while (opcao != 'V') {
            opcao = MeuScannerCustomizado.nextChar("Digite qual item você quer curtir:\n [M] - Música\n [F] - Filmes\n [S] - Séries\n [J] - Jogos\n [E] - Esportes\n [C] - Curiosidades\n [V] - Voltar\n > ");
            switch (opcao) {
                case 'M':
                    curtirMusica();
                    break;
                case 'F':
                    curtirFilme();
                    break;
                case 'S':
                    curtirSerie();
                    break;
                case 'J':
                    curtirJogo();
                    break;
                case 'E':
                    curtirEsporte();
                    break;
                case 'C':
                    curtirCuriosidade();
                    break;
                case 'V':
                    System.out.println("Voltando...");
                    break;
                default:
            }
        }
    }


    public Usuario curtirMusica(){
        MusicaMenu musicaMenu = new MusicaMenu();
        musicaMenu.listar();
        int musica = MeuScannerCustomizado.nextInt("Digite a Música que quer Curtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorCurtirDescurtir.curtirMusica(musica,usuario);
    }

    public Usuario curtirFilme() {
        FilmeMenu filmeMenu = new FilmeMenu();
        filmeMenu.listar();
        int filme = MeuScannerCustomizado.nextInt("Digite o Filme que quer Curtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorCurtirDescurtir.curtirFilme(filme,usuario);
    }

    public Usuario curtirSerie() {
        SerieMenu serieMenu = new SerieMenu();
        serieMenu.listar();
        int serie = MeuScannerCustomizado.nextInt("Digite a Série que quer Curtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorCurtirDescurtir.curtirSerie(serie,usuario);
    }

    public Usuario curtirJogo() {
        JogoMenu jogoMenu = new JogoMenu();
        jogoMenu.listar();
        int jogo = MeuScannerCustomizado.nextInt("Digite o Jogo que quer Curtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorCurtirDescurtir.curtirJogo(jogo,usuario);
    }

    public Usuario curtirEsporte(){
        EsporteMenu esporteMenu = new EsporteMenu();
        esporteMenu.listar();
        int esporte = MeuScannerCustomizado.nextInt("Digite o Esporte que quer Curtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorCurtirDescurtir.curtirEsporte(esporte,usuario);
    }

    public Usuario curtirCuriosidade(){
        CuriosidadeMenu curiosidadeMenu = new CuriosidadeMenu();
        curiosidadeMenu.listar();
        int curiosidade = MeuScannerCustomizado.nextInt("Digite a Curiosidade que quer Curtir \n  > ");
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorCurtirDescurtir.curtirCuriosidade(curiosidade,usuario);
    }
}

package console;

import dominio.AvaliacaoMusica;
import dominio.Musica;
import gerenciador.AvaliacaoMusicaGerenciador;
import gerenciador.MusicaGerenciador;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoMenu {

    private AvaliacaoMusicaGerenciador gerenciador;

    public AvaliacaoMenu() {
        this.gerenciador = new AvaliacaoMusicaGerenciador();
    }

    public void opcoes() {
        char opcao = ' ';
        while (opcao != 'X') {
            opcao = MeuScannerCustomizado.nextChar("Digite qual item você quer avaliar\n [M] - Música\n [F] - Filmes\n [S] - Séries\n [J] - Jogos\n [E] - Esportes\n [C] - Curiosidades\n [A] - Avaliações\n [X] - Sair\n > ");
            switch (opcao) {
                case 'M':
                    avaliarMusica();
                    break;
                case 'F':
                    //avaliarfilme();
                    break;
                case 'S':
                    //avaliarSerie();
                    break;
                case 'J':
                    //avaliarJogo();
                    break;
                case 'E':
                    //avaliarEsporte();
                    break;
                case 'C':
                    //avaliarCuriosidade();
                    break;
                case 'X':
                    System.out.println("Saindo...");
                    break;
                default:
            }
        }
    }

    public AvaliacaoMusica avaliarMusica() {
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite o Usuário que quer Avaliar: \n  > ");

        MusicaMenu musicaMenu = new MusicaMenu();
        musicaMenu.listar();
        int musica = MeuScannerCustomizado.nextInt("Digite a Música que quer Avaliar \n  > ");

        char likeOrDislike = MeuScannerCustomizado.nextChar("[L] - Like     [D] - Dislike \n  > ");
        if (likeOrDislike == 'L') {
            boolean avalMusica = true;
            AvaliacaoMusica avaliacaoMusica = new AvaliacaoMusica(usuario, musica, avalMusica);
            List<AvaliacaoMusica> avaliaMusica = new ArrayList();
            avaliaMusica.add(avaliacaoMusica);
            System.out.println(avaliacaoMusica);
            return gerenciador.salvar(avaliacaoMusica);
        } else {
            boolean avalMusica = false;
            AvaliacaoMusica avaliacaoMusica = new AvaliacaoMusica(usuario, musica, avalMusica);
            List<AvaliacaoMusica> avaliaMusica = new ArrayList();
            avaliaMusica.add(avaliacaoMusica);
            return gerenciador.salvar(avaliacaoMusica);
        }


    }


    public List<AvaliacaoMusica> listar(){
        System.out.println("\nListagem de Avaliações...");
        List<AvaliacaoMusica> avaliacaos = gerenciador.listar();
        for (AvaliacaoMusica avaliacao : avaliacaos) {
            System.out.println(avaliacao);       }
        return avaliacaos;    }


    public void avaliarFilme() {
    }

    public void avaliarSerie() {
    }
}

//### Avaliações
//- Um usuário poderá avaliar uma música
//- Um usuário poderá avaliar um filme
//- Um usuário poderá avaliar uma série
//- Um usuário poderá avaliar um jogo
//- Um usuário poderá avaliar um esporte
//- Um usuário poderá definir uma curiosidade

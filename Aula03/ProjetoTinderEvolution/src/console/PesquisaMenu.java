package console;

import Acervo.AvaliacaoMusicaAcervo;
import dominio.AvaliacaoMusica;

import java.util.List;

public class PesquisaMenu {

    public void opcoes() {
        char opcao = ' ';
        while (opcao != 'X') {
            opcao = MeuScannerCustomizado.nextChar("Digite qual item você quer pesquisar\n [M] - Música\n [F] - Filmes\n [S] - Séries\n [J] - Jogos\n [E] - Esportes\n [C] - Curiosidades\n [A] - Avaliações\n [X] - Sair\n > ");
            switch (opcao) {
                case 'M':
                    pesquisarMusica();
                    break;
                case 'F':
                    //pesquisarfilme();
                    break;
                case 'S':
                    //pesquisarSerie();
                    break;
                case 'J':
                    //pesquisarJogo();
                    break;
                case 'E':
                    //pesquisarEsporte();
                    break;
                case 'C':
                    //pesquisarCuriosidade();
                    break;
                case 'X':
                    System.out.println("Saindo...");
                    break;
                default:
            }
        }
    }



    public void pesquisarMusica() {
        MusicaMenu musicaMenu = new MusicaMenu();
        musicaMenu.listar();
        AvaliacaoMenu avaliacaoMenu = new AvaliacaoMenu();
        avaliacaoMenu.listar();
        AvaliacaoMusicaAcervo avaliacaoMusicaAcervo = new AvaliacaoMusicaAcervo();

        int idMusica = MeuScannerCustomizado.nextInt("Digite a musica que quer saber quem gosta \n >");


/*
        List<AvaliacaoMusica> avaliacaos = gerenciador.listar();
        for (int i = 0; i < avaliacaoMusicas.size(); i++) {
            if(avaliacaoMusicas.get(i).getId=idMusica)
            System.out.println(avaliacaoMusicas.get(i).getNome);}
*/

        avaliacaoMusicaAcervo.listaPorUsuario(1);

    }



}

//### Pesquisas
//- Listar usuários que gostem de determinada música
//        AvaliacaoMusica{id=1, idUsuario=2, idMusica=3, avalMusica=true}
//        AvaliacaoMusica{id=2, idUsuario=1, idMusica=1, avalMusica=true}
//        AvaliacaoMusica{id=3, idUsuario=2, idMusica=4, avalMusica=true}
//        AvaliacaoMusica{id=2, idUsuario=2, idMusica=4, avalMusica=true}
//        AvaliacaoMusica{id=1, idUsuario=2, idMusica=2, avalMusica=true}

//- Listar usuários que gostem de determinado filme
//- Listar usuários que gostem de determinada série
//- Listar usuários que gostem de determinado jogo
//- Listar usuários que gostem de determinado esporte
//- Listar usuários que possuem determinada curiosidade
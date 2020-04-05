package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.acervo.CurtidaMusicaAcervo;
import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;

import static ProjetoTinderEvolutionRest.acervo.MatchAcervo.avalUsuarios;

public class ListaMenu {

    public void opcoes() {
        char opcao = ' ';
        while (opcao != 'X') {
            opcao = MeuScannerCustomizado.nextChar("Digite qual item você quer listar\n [M] - Música\n [F] - Filmes\n [S] - Séries\n [J] - Jogos\n [E] - Esportes\n [C] - Curiosidades\n [A] - Avaliações\n [X] - Sair\n > ");
            switch (opcao) {
                case 'M':
                    listaMusica();
                    break;
                case 'F':
                    //listafilme();
                    break;
                case 'S':
                    //listaSerie();
                    break;
                case 'J':
                    //listaJogo();
                    break;
                case 'E':
                    //listaEsporte();
                    break;
                case 'C':
                    //listaCuriosidade();
                    break;
                case 'A':
                    listarAvaliacoes();
                    break;
                case 'X':
                    System.out.println("Saindo...");
                    break;
                default:
            }
        }
    }

    public void listaMusica() {
//        MusicaMenu musicaMenu = new MusicaMenu();
//        musicaMenu.listar();
//        AvaliacaoMenu avaliacaoMenu = new AvaliacaoMenu();
//        avaliacaoMenu.listar();
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        CurtidaMusicaAcervo avaliacaoMusicaAcervo = new CurtidaMusicaAcervo();
        int idUsuario = MeuScannerCustomizado.nextInt("\nDigite o Id do usuario que gostaria de saber quais musicas ele gosta \n >");


        for (int f = 0; f < UsuarioAcervo.usuarios.size(); f++) {
            if (UsuarioAcervo.usuarios.get(f).getId() == idUsuario){
            System.out.println("Listagem de Músicas do Usuario " + UsuarioAcervo.usuarios.get(f).getNome());
        }}
        avaliacaoMusicaAcervo.listaPorUsuario(idUsuario);
    }

    public void listarAvaliacoes(){
        for (int i = 0; i < avalUsuarios.size(); i++) {
            System.out.println(avalUsuarios.get(i).getId()+" "+avalUsuarios.get(i).getIdUsuarioD()+" "+avalUsuarios.get(i).getIdUsuarioR());
        }


    }

}

//### Listas
//        - Listar músicas  de determinado usuário
//        - Listar filmes curtidos de determinado usuário
//        - Listar séries  de determinado usuário
//        - Listar jogos curtidos de determinado usuário
//        - Listar esportes curtidos de determinado usuário
//        - Listar curiosidades determinado usuário

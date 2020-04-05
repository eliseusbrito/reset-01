package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.CurtidaMusica;
import ProjetoTinderEvolutionRest.gerenciador.CurtidaMusicaGerenciador;
import java.util.ArrayList;
import java.util.List;

public class CurtidaMenu {

    private CurtidaMusicaGerenciador gerenciador;

    public CurtidaMenu() {
        this.gerenciador = new CurtidaMusicaGerenciador();
    }

    public void opcoes() {
        char opcao = ' ';
        while (opcao != 'X') {
            opcao = MeuScannerCustomizado.nextChar("Digite qual item você quer curtir\n [M] - Música\n [F] - Filmes\n [S] - Séries\n [J] - Jogos\n [E] - Esportes\n [C] - Curiosidades\n [X] - Sair\n > ");
            switch (opcao) {
                case 'M':
                    curtirMusica();
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

    public CurtidaMusica curtirMusica() {
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        usuarioMenu.listar();
        int usuario = MeuScannerCustomizado.nextInt("Digite o Usuário que esta curtindo: \n  > ");

        MusicaMenu musicaMenu = new MusicaMenu();
        musicaMenu.listar();
        int musica = MeuScannerCustomizado.nextInt("Digite a Música que quer Curtir \n  > ");

        boolean avalMusica = true;
        CurtidaMusica curtidaMusica = new CurtidaMusica(usuario, musica, avalMusica);
        return gerenciador.salvar(curtidaMusica);
}


    public List<CurtidaMusica> listar(){
        System.out.println("\nListagem de Avaliações...");
        List<CurtidaMusica> curtidas = gerenciador.listar();
        for (CurtidaMusica curtida : curtidas) {
            System.out.println(curtida);       }
        return curtidas;    }


    public void curtirFilme() {
    }

    public void curtirSerie() {
    }
}

//### Curtidas
//        - Um usuário poderá curtir uma música
//        - Um usuário poderá curtir um filme
//        - Um usuário poderá curtir uma série
//        - Um usuário poderá curtir um jogo
//        - Um usuário poderá curtir um esporte
//        - Um usuário poderá definir uma curiosidade
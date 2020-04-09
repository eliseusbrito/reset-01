package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.acervo.CurtidaMusicaAcervo;
import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.MusicaGerenciador;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;

import java.util.ArrayList;
import java.util.List;

import static ProjetoTinderEvolutionRest.acervo.LikeDisUsuarioAcervo.avalUsuarios;
import static ProjetoTinderEvolutionRest.acervo.UsuarioAcervo.usuarios;

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

    public void listaMusica() {
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        Usuario usuario = new Usuario();
        //List<Musica> musicasCurtidas = new ;
        usuarioMenu.listar();
        System.out.println("\nLista músicas curtidas de determinado usuário");
        int idUsuario = MeuScannerCustomizado.nextInt("Digite o Usuario:\n >");
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getId()==idUsuario){
        System.out.println("[" + usuarios.get(i).getId() + "  " + usuarios.get(i).getNome());
        System.out.println("[" + usuarios.get(i).getMusicasCurtidas());
       // System.out.println(musicasCurtidas.get());
               // for (int x = 0; x < musicasCurtidas.size(); x++) {
              //  System.out.println(usuario.getMusicasCurtidas());}

                //private List<Musica> musicasCurtidas = new ArrayList<>();

//                for (int i = 0; i < usuarios.size(); i++) {
                MusicaGerenciador gerenciadorDeMusica = new MusicaGerenciador();
                List<Musica> musicasCurtidas = new ArrayList<>();
                for (Musica id : usuario.getMusicasCurtidas()) {
                    Musica musicaCurtida = gerenciadorDeMusica.pesquisar(idUsuario);
                    musicasCurtidas.add(musicaCurtida);
                }
                System.out.println(musicasCurtidas);

            };



//        return usuarioCurtirMusica;
    }}




    public void listarAvaliacoes(){
        for (int i = 0; i < avalUsuarios.size(); i++) {
            System.out.println(avalUsuarios.get(i).getId()+" "+avalUsuarios.get(i).getidUsuarioAvaliador()+" "+avalUsuarios.get(i).getidUsuarioAvaliado());
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

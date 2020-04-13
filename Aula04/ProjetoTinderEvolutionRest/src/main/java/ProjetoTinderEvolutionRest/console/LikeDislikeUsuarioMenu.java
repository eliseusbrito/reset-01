package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.MatchGerenciador;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;

import java.util.ArrayList;
import java.util.List;

public class LikeDislikeUsuarioMenu {

    private MatchGerenciador gerenciadorMatch = new MatchGerenciador();

    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
    List<Usuario> matches = new ArrayList<>();

    public void entradaDados() {
        char opcao = ' ';
        while (opcao != 'V') {
            opcao = MeuScannerCustomizado.nextChar("Digite a opção\n [L] - Like um Usuário \n [D] - Dislike um Usuário\n [U] - Listar Likes por usuario\n [T] - Listar todos Likes\n [M] - Listar Matches\n [C] - Usuario Comum\n [V] - Voltar\n > ");
            switch (opcao) {
                case 'L':
                    likeUsuario();
                    break;
                case 'D':
                    dislikeUsuario();
                    break;
                case 'U':
                    listarLikes();
                    break;
                case 'T':
                    listarTodosLikes();
                    break;
                case 'M':
                    matches();
                    break;
                case 'C':
                    usuariosComuns();
                    break;
                case 'V':
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public Usuario likeUsuario() {
        int idUsuarioCurtido = MeuScannerCustomizado.nextInt("Digite o Usuário que quer dar Like \n  > ");
        int idUsuarioQueCurtiu = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        salvarMatches(idUsuarioCurtido, idUsuarioQueCurtiu);
        return gerenciadorMatch.curtirUsuario(idUsuarioCurtido, idUsuarioQueCurtiu);
    }

    public Usuario dislikeUsuario(){
        int idUsuarioDescurtido = MeuScannerCustomizado.nextInt("Digite o Usuário que quer Descurtir \n  > ");
        int idUsuarioQueDescurtiu = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        removerMatches(idUsuarioDescurtido,idUsuarioQueDescurtiu);
        return gerenciadorMatch.descurtirUsuario(idUsuarioDescurtido,idUsuarioQueDescurtiu);
    }

    public Usuario listarLikes() {
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        int idUsuario = MeuScannerCustomizado.nextInt("Qual seu Usuario? Listara Usuários que receberam likes deste usuário:\n >");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        usuario.listarUsuariosCurtidos(usuario.getId(),usuario.getNome());
        return usuario;
    };

    public void listarTodosLikes() {
        System.out.println("Listagem de todos os Likes");
        for (int i = 1; i <= UsuarioAcervo.usuarios.size(); i++) {
            Usuario usuario = usuarioGerenciador.pesquisar(i);
            if(usuario.getUsuariosCurtidos().isEmpty()){
            } else{usuario.listarUsuariosCurtidos(usuario.getId(), usuario.getNome());}
        }
    }

    public void matches(){
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        listarMatches(usuario);
    }

    public void salvarMatches(int idUsuarioCurtido, int idUsuarioQueCurtiu) {
        Usuario usuarioCurtido = usuarioGerenciador.pesquisar(idUsuarioCurtido);
        Usuario usuarioQueCurtiu = usuarioGerenciador.pesquisar(idUsuarioQueCurtiu);
        for (int i = 0; i < usuarioCurtido.getUsuariosCurtidos().size(); i++) {
        if(usuarioCurtido.getUsuariosCurtidos().get(i).getId()==idUsuarioQueCurtiu){
            System.out.println("Criou um match entre "+usuarioCurtido.getNome()+" e "+usuarioQueCurtiu.getNome()+".");
            usuarioCurtido.salvarMatch(usuarioQueCurtiu);
            usuarioQueCurtiu.salvarMatch(usuarioCurtido);
            }
        }
    }

    public void removerMatches(int idUsuarioDescurtido, int idUsuarioQueDescurtiu) {
        Usuario usuarioDescurtido = usuarioGerenciador.pesquisar(idUsuarioDescurtido);
        Usuario usuarioQueDescurtiu = usuarioGerenciador.pesquisar(idUsuarioQueDescurtiu);
        for (int i = 0; i < usuarioDescurtido.getUsuariosCurtidos().size(); i++) {
            if(usuarioDescurtido.getUsuariosCurtidos().get(i).getId()==idUsuarioQueDescurtiu){
                System.out.println("Removeu um match entre "+usuarioDescurtido.getNome()+" e "+usuarioQueDescurtiu.getNome()+".");
                usuarioDescurtido.removerMatch(usuarioQueDescurtiu);
                usuarioQueDescurtiu.removerMatch(usuarioDescurtido);
            }
        }
    }

    public void listarMatches(int idUsuario){
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        System.out.println("Listagem de Matches do usuário "+usuario.getNome());
        System.out.println(usuario.getMatches());
    }

//    public void usuariosComuns(){
//
//        int idUsuario = MeuScannerCustomizado.nextInt("Digite seu usuário:");
//        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
//        System.out.println("i = usuarios.size= "+UsuarioAcervo.usuarios.size());
//        System.out.println("x = getMusicasCurtidas().size() = "+usuario.getMusicasCurtidas().size());
//
//        for (int i = 0; i < UsuarioAcervo.usuarios.size(); i++) {
//            int contMusicaIguais=0;
//            System.out.println("i (usuario) i= "+ i);
//            for (int x = 0; x < usuario.getMusicasCurtidas().size(); x++) {
//                System.out.println("  x (musica curtida) x= "+ x);
//                System.out.println("    usuario.getMusicasCurtidas(i).get().getId()= "+usuario.getMusicasCurtidas().get(i).getNome());
//                System.out.println("    UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getId()= "+UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getNome());
//                if(usuario.getMusicasCurtidas().get(i).getId()==UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getId()){
//                    contMusicaIguais++;
//                    System.out.println("contMusicaIguais= "+contMusicaIguais);
//                }
//            }
//        }
    public void usuariosComuns() {
        int contMusicaIguais = 0;
        int idUsuario = MeuScannerCustomizado.nextInt("Digite seu usuário:");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        System.out.println("i = usuarios.size= " + UsuarioAcervo.usuarios.size());
//        System.out.println("x = getMusicasCurtidas().size() = "+usuario.getMusicasCurtidas().size());
        List<Musica> musicasCurtidasUsuarioPesquisado = usuario.getMusicasCurtidas();
        System.out.println("musicasCurtidasUsuarioPesquisado.size(): " + musicasCurtidasUsuarioPesquisado.size());
        for (int i = 0; i < musicasCurtidasUsuarioPesquisado.size(); i++) {
            System.out.println(musicasCurtidasUsuarioPesquisado.get(i));
        }
        for (int i = 0; i < UsuarioAcervo.usuarios.size(); i++) {
            System.out.println("i (usuario) i= " + i);
            System.out.println("x = UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().size() = " + UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().size());
            for (int x = 0; x < UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().size(); x++) {
                System.out.println("  x (musica curtida) x= " + x);
                if(!musicasCurtidasUsuarioPesquisado.contains(UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getNome())){
//                if(!musicasCurtidasUsuarioPesquisado.contains(UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getId())){
//                if (musicasCurtidasUsuarioPesquisado.equals(UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getId())) {
                    System.out.println("UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getNome()): " + UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getNome());
                    contMusicaIguais++;
                    System.out.println("        contMusicaIguais: " + contMusicaIguais);

                }
                ;


            }
        }
    }
}


        //Obter o usuário com mais características em comum que já não tenha um match ou dislike





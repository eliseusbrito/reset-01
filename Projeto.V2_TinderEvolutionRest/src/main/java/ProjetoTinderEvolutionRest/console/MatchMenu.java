package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.MatchGerenciador;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;
import java.util.List;

public class MatchMenu {

    private MatchGerenciador gerenciadorMatch = new MatchGerenciador();

    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    public void entradaDados() {
        char opcao = ' ';
        while (opcao != 'V') {
            opcao = MeuScannerCustomizado.nextChar("Digite a opção\n [M] - Listar Matches\n [L] - Like em um Usuário \n [W] - Desfazer Like em um Usuário \n [U] - Listar Likes por usuario\n [T] - Listar todos Likes\n [D] - Dislike em um Usuário\n [Z] - Desfazer Dislike em um Usuário\n [P] - Listar Dislikes por usuario\n [A] - Listar todos Dislikes\n [C] - Usuario Comum\n [V] - Voltar\n > ");
            switch (opcao) {
                case 'M':
                    listarMatches();
                    break;
                case 'L':
                    likeUsuario();
                    break;
                case 'W':
                    desfazerlikeUsuario();
                    break;
                case 'U':
                    listarLikes();
                    break;
                case 'T':
                    listarTodosUsuariosLiked();
                    break;
                case 'D':
                    dislikeUsuario();
                    break;
                case 'Z':
                    desfazerdislikeUsuario();
                    break;
                case 'P':
                    listarDislikes();
                    break;
                case 'A':
                    listarTodosDislikes();
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
        int idusuarioLiked = MeuScannerCustomizado.nextInt("Digite o Usuário que quer dar Like \n  > ");
        int idUsuarioQueCurtiu = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorMatch.likeUsuario(idusuarioLiked, idUsuarioQueCurtiu);
    }

    public Usuario desfazerlikeUsuario() {
        int idusuarioDisliked = MeuScannerCustomizado.nextInt("Digite o Usuário que quer Desfazer o Like \n  > ");
        int idUsuarioQueDescurtiu = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorMatch.desfazerlikeUsuario(idusuarioDisliked,idUsuarioQueDescurtiu);
    }

    public List<Usuario> listarLikes() {
        int idUsuario = MeuScannerCustomizado.nextInt("Qual seu Usuario? Listara Usuários que receberam likes deste usuário:\n >");
        return gerenciadorMatch.listarUsuariosLiked(idUsuario);
    };

    public void listarTodosUsuariosLiked() {
        System.out.println("Listagem de todos os Likes");
        for (int i = 1; i <= UsuarioAcervo.usuarios.size(); i++) {
            Usuario usuario = usuarioGerenciador.pesquisar(i);
            if(usuario.getUsuariosLiked().isEmpty()){
            } else{usuario.listarUsuariosLiked(usuario.getId(), usuario.getNome());}
        }
    }

    public Usuario dislikeUsuario() {
        int idusuarioDisliked = MeuScannerCustomizado.nextInt("Digite o Usuário que quer dar um Dislike \n  > ");
        int idUsuarioQueDesliked = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorMatch.dislikeUsuario(idusuarioDisliked, idUsuarioQueDesliked);
    }

    public Usuario desfazerdislikeUsuario(){
        int idusuarioDisliked = MeuScannerCustomizado.nextInt("Digite o Usuário que quer Desfazer o Dislike \n  > ");
        int idUsuarioQueDescurtiu = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        return gerenciadorMatch.desfazerDislikeUsuario(idusuarioDisliked,idUsuarioQueDescurtiu);
    }

    public List<Usuario> listarDislikes() {
        int idUsuario = MeuScannerCustomizado.nextInt("Qual seu Usuario? Listara Usuários que receberam Dislikes deste usuário:\n >");
        return gerenciadorMatch.listarUsuariosDisliked(idUsuario);
    };

    public void listarTodosDislikes() {
        System.out.println("Listagem de todos os Dislikes");
        for (int i = 1; i <= UsuarioAcervo.usuarios.size(); i++) {
            Usuario usuario = usuarioGerenciador.pesquisar(i);
            if(usuario.getUsuariosDisliked().isEmpty()){
            } else{usuario.listarUsuariosDisliked(usuario.getId(), usuario.getNome());}
        }
    }

    //Matches
    public void listarMatches(){
        int usuario = MeuScannerCustomizado.nextInt("Digite seu usuário: \n  > ");
        gerenciadorMatch.listarMatches(usuario);
    }

    public void salvarMatches(int idusuarioLiked, int idUsuarioQueCurtiu) {
        gerenciadorMatch.salvarMatches(idusuarioLiked,idUsuarioQueCurtiu);
    }

    public void removerMatches(int idusuarioDisliked, int idUsuarioQueDescurtiu) {
       gerenciadorMatch.removerMatches(idusuarioDisliked, idUsuarioQueDescurtiu);
    }

    public void usuariosComuns$() {
        int contMusicaIguais = 0;
        int idUsuario = MeuScannerCustomizado.nextInt("Digite seu usuário:");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        System.out.println("i = usuarios.size= " + UsuarioAcervo.usuarios.size());
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
                    System.out.println("UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getNome()): " + UsuarioAcervo.usuarios.get(i).getMusicasCurtidas().get(x).getNome());
                    contMusicaIguais++;
                    System.out.println("        contMusicaIguais: " + contMusicaIguais);
                }
            }
        }
    }

    public void usuariosComuns() {
        int idUsuario = MeuScannerCustomizado.nextInt("Digite seu usuário:");
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        gerenciadorMatch.listarUsuariosComuns(idUsuario);
    }
}

//Obter o usuário com mais características em comum que já não tenha um match ou dislike





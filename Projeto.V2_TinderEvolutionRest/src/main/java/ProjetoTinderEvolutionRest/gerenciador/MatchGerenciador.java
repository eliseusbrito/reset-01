package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class MatchGerenciador {

    UsuarioAcervo usuarioAvervo = new UsuarioAcervo();
    private UsuarioAcervo usuarioGerenciador = new UsuarioAcervo();

    public Usuario likeUsuario(int idUsuarioLiked, int idUsuario) {
        Usuario usuarioLiked = usuarioGerenciador.pesquisar(idUsuarioLiked);
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        for (int i = 0; i < usuario.getUsuariosLiked().size(); i++) {
            if (usuarioLiked.getNome().equals(usuario.getUsuariosLiked().get(i).getNome())) {
                System.out.println("O usuário "+usuarioLiked.getNome()+" já foi liked pelo usuário "+usuario.getNome()+". Solicitação desconsiderada. ");
                return null;
            }
        }
        for (int i = 0; i < usuario.getUsuariosDisliked().size(); i++) {
            if (usuarioLiked.getNome().equals(usuario.getUsuariosDisliked().get(i).getNome())) {
                System.out.println("O usuário "+usuarioLiked.getNome()+" tem um dislike do usuário "+usuario.getNome()+". Você precisa desfazer este Dislike para depois ser possivel dar um Like. Solicitação desconsiderada.");
                return null;
            }
        }
        return usuarioAvervo.likeUsuario(idUsuarioLiked,idUsuario);
    }

    public Usuario desfazerlikeUsuario (int idUsuarioDisliked, int idUsuario) {
        Usuario usuarioLiked = usuarioGerenciador.pesquisar(idUsuarioDisliked);
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        for (int i = 0; i < usuario.getUsuariosLiked().size(); i++) {
            if (usuarioLiked.getNome().equals(usuario.getUsuariosLiked().get(i).getNome())) {
                return usuarioAvervo.desfazerlikeUsuario(idUsuarioDisliked,idUsuario);
            }
        }
        System.out.println("O usuário "+usuarioLiked.getNome()+" não tinha recebido like do usuário "+usuario.getNome()+" para ser desfeito. Solicitação desconsiderada. ");
        return null;
    }

    public List<Usuario> listarUsuariosLiked(int id){
        return usuarioAvervo.listarUsuariosLiked(id);
    }

    public Usuario dislikeUsuario(int idUsuarioDisliked, int idUsuario) {
        Usuario usuarioDisliked = usuarioGerenciador.pesquisar(idUsuarioDisliked);
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        for (int i = 0; i < usuario.getUsuariosDisliked().size(); i++) {
            if (usuarioDisliked.getNome().equals(usuario.getUsuariosDisliked().get(i).getNome())) {
                System.out.println("O usuário "+usuarioDisliked.getNome()+" já foi disliked pelo usuário "+usuario.getNome()+". Solicitação desconsiderada. ");
                return null;
            }
        }
        for (int i = 0; i < usuario.getUsuariosLiked().size(); i++) {
            if (usuarioDisliked.getNome().equals(usuario.getUsuariosLiked().get(i).getNome())) {
                System.out.println("O usuário "+usuarioDisliked.getNome()+" tem um like do usuário "+usuario.getNome()+". Você precisa desfazer este like para depois ser possivel dar um dislike. Solicitação desconsiderada.");
                return null;
            }
        }
        return usuarioAvervo.dislikeUsuario(idUsuarioDisliked,idUsuario);
    }

    public Usuario desfazerDislikeUsuario (int idUsuarioDisliked, int idUsuario) {
        Usuario usuarioDisliked = usuarioGerenciador.pesquisar(idUsuarioDisliked);
        Usuario usuario = usuarioGerenciador.pesquisar(idUsuario);
        for (int i = 0; i < usuario.getUsuariosDisliked().size(); i++) {
            if (usuarioDisliked.getNome().equals(usuario.getUsuariosDisliked().get(i).getNome())) {
            return usuarioAvervo.desfazerDislikeUsuario(idUsuarioDisliked,idUsuario);
            }
        }
        System.out.println("O usuário "+usuarioDisliked.getNome()+" não tinha recebido dislike do usuário "+usuario.getNome()+" para ser desfeito. Solicitação desconsiderada. ");
        return null;
    }

    public List<Usuario> listarUsuariosDisliked(int id){
        return usuarioAvervo.listarUsuariosDisliked(id);
    }

    public List<Usuario> listarMatches(int idUsuario){
        return usuarioAvervo.listarMatches(idUsuario);
    }

    public void salvarMatches(int idusuarioLiked, int idUsuarioQueCurtiu) {
        usuarioAvervo.salvarMatches(idusuarioLiked,idUsuarioQueCurtiu);
    }

    public void removerMatches(int idusuarioLiked, int idUsuarioQueCurtiu) {
        usuarioAvervo.salvarMatches(idusuarioLiked, idUsuarioQueCurtiu);
    }

    public Usuario listarUsuariosComuns(int id) {
        UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
        Usuario usuario = usuarioGerenciador.pesquisar(id);
        Usuario usuarioBest = null;
        int pontuacaoUsuarioBest = 0;
        for (Usuario usuarioBestLoop : usuarioGerenciador.listar()) {
            if (usuarioBestLoop.getId() == usuario.getId()) {
                continue;       }
            boolean usuarioDeuMatch = false;
            for (Usuario usuarioLoopMatch : usuario.listarMatches()) {
                if (usuarioBestLoop.getId() == usuarioLoopMatch.getId()) {
                    usuarioDeuMatch = true;
                    break;           }         }
            boolean usuarioDislike = false;
            for (Usuario usuarioLoop : usuario.listarDislike()){
                if (usuarioBestLoop.getId() == usuarioLoop.getId()){
                    usuarioDislike = true;
                    break;                }            }
            if (usuarioDeuMatch || usuarioDislike) {
                continue;            }
            int contadorMusica = 0, contadorFilme = 0, contadorSerie = 0,contadorJogo = 0, contadorEsporte = 0;
            for (Musica musicaCurtida : usuario.getMusicasCurtidas()) {
                for (Musica musicaBest : usuarioBestLoop.getMusicasCurtidas()) {
//                    System.out.println("musicaBest.getId(): "+"musicaBest.getId()");
//                    System.out.println("usuarioBestLoop.getMusicasCurtidas: "+usuarioBestLoop.getMusicasCurtidas());
                    if (musicaBest.getId() == musicaCurtida.getId()) {
                        contadorMusica++;                    }                }            }
            for (Filme filmeCurtido : usuario.getFilmesCurtidos()) {
                for (Filme filmeBest : usuarioBestLoop.getFilmesCurtidos()) {
                    if (filmeBest.getId() == filmeCurtido.getId()) {
                        contadorFilme++;                    }                }            }
            for (Serie serieCurtida : usuario.getSeriesCurtidas()) {
                for (Serie serieBest : usuarioBestLoop.getSeriesCurtidas()) {
                    if (serieBest.getId() == serieCurtida.getId()) {
                        contadorSerie++;                    }                }            }
            for (Jogo jogoCurtido : usuario.getJogosCurtidos()) {
                for (Jogo jogoBest : usuarioBestLoop.getJogosCurtidos()) {
                    if (jogoBest.getId() == jogoCurtido.getId()) {
                        contadorJogo++;                    }                }            }
            for (Esporte esporteCurtido : usuario.getEsportesCurtidos()) {
                for (Esporte esporteBest : usuarioBestLoop.getEsportesCurtidos()) {
                    if (esporteBest.getId() == esporteCurtido.getId()) {
                        contadorEsporte++;                    }                }            }
            int pontuacaoUsuarioLoop = contadorMusica + contadorFilme + contadorSerie + contadorJogo + contadorEsporte;
            if (usuarioBest == null) {
                usuarioBest = usuarioBestLoop;
                pontuacaoUsuarioBest = pontuacaoUsuarioLoop;            }
            if (pontuacaoUsuarioLoop > pontuacaoUsuarioBest) {
                usuarioBest = usuarioBestLoop;
                pontuacaoUsuarioBest = pontuacaoUsuarioLoop;            }
        }
        System.out.println("O Usuário "+usuarioBest.getNome()+" é o usuário com maior número de caracaterísticas iguais a do usuário "+usuario.getNome()+".");
        System.out.println("Pontos em Comum: "+pontuacaoUsuarioBest);
        return usuarioBest;
    }
}


package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Usuario;
import org.springframework.stereotype.Service;

@Service

public class MatchGerenciador {

    UsuarioAcervo usuarioAvervo = new UsuarioAcervo();


    public Usuario likeUsuario(int usuarioLiked, int idUsuario) {
//        System.out.println("usuarioLiked= "+usuarioLiked);
//        System.out.println("idUsuario= "+idUsuario);
        return usuarioAvervo.likeUsuario(usuarioLiked,idUsuario);
    }

    public Usuario dislikeUsuario (int usuarioDisliked, int idUsuario) {
//        System.out.println("usuarioDisliked: "+usuarioDisliked);
//        System.out.println("idUsuario: "+idUsuario);
        return usuarioAvervo.dislikeUsuario(usuarioDisliked,idUsuario);
    }

    public Usuario listarUsuariosCurtidos(int id){
        return usuarioAvervo.listarUsuariosCurtidos(id);
    }

}

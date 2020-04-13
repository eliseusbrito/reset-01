package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Usuario;

public class MatchGerenciador {

    UsuarioAcervo usuarioAvervo = new UsuarioAcervo();


    public Usuario curtirUsuario(int usuarioCurtido, int idUsuario) {
        return usuarioAvervo.curtirUsuario(usuarioCurtido,idUsuario);
    }

    public Usuario descurtirUsuario(int usuarioDescurtido, int idUsuario) {
        return usuarioAvervo.descurtirUsuario(usuarioDescurtido,idUsuario);
    }

}

package ProjetoTinderEvolutionRest.acervo;

import ProjetoTinderEvolutionRest.dominio.LikeDislikeUsuario;
import java.util.ArrayList;
import java.util.List;

public class LikeDisUsuarioAcervo {
    private static int contador = 1;
    public static final List<LikeDislikeUsuario> avalUsuarios = new ArrayList<>();

    public LikeDislikeUsuario salvar(LikeDislikeUsuario match) {
        match.setId(contador++);
        avalUsuarios.add(match);
        return match;
    }

    public List<LikeDislikeUsuario> listar() {
        return avalUsuarios;
    }


}
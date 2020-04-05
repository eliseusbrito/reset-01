package ProjetoTinderEvolutionRest.acervo;

import ProjetoTinderEvolutionRest.dominio.Match;
import java.util.ArrayList;
import java.util.List;

import static ProjetoTinderEvolutionRest.acervo.UsuarioAcervo.usuarios;

public class MatchAcervo {
    private static int contador = 1;
    public static final List<Match> avalUsuarios = new ArrayList<>();

    public Match salvar(Match match) {
        match.setId(contador++);
        avalUsuarios.add(match);
        return match;
    }

    public List<Match> listar() {
        return avalUsuarios;
    }


}
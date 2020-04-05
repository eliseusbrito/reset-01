package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.MatchAcervo;
import ProjetoTinderEvolutionRest.dominio.Match;

import java.util.List;

public class MatchGerenciador {

    MatchAcervo acervo = new MatchAcervo();

    public Match salvar (Match match){

        List<Match> matchLista = acervo.listar();

        return acervo.salvar(match);

    }


    public List<Match> listar() {
        return acervo.listar();
    }


}

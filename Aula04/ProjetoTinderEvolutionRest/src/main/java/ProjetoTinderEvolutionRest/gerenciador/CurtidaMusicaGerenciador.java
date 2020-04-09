package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.CurtidaMusicaAcervo;
import ProjetoTinderEvolutionRest.dominio.CurtidaMusica;

import java.util.List;

public class CurtidaMusicaGerenciador {


        CurtidaMusicaAcervo acervo = new CurtidaMusicaAcervo();

        public CurtidaMusica salvar (CurtidaMusica avaliacaoMusica){

            List<CurtidaMusica> avaliacaoMusicas = acervo.listar();

            return acervo.salvar(avaliacaoMusica);

        }


    public List<CurtidaMusica> listar() {
        return acervo.listar();
    }



    }



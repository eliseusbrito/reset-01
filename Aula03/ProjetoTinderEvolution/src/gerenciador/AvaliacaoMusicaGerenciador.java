package gerenciador;

import Acervo.AvaliacaoMusicaAcervo;
import dominio.AvaliacaoMusica;
import dominio.Curiosidade;
import dominio.Musica;

import java.util.List;

public class AvaliacaoMusicaGerenciador {


        AvaliacaoMusicaAcervo acervo = new AvaliacaoMusicaAcervo();

        public AvaliacaoMusica salvar (AvaliacaoMusica avaliacaoMusica){

            List<AvaliacaoMusica> avaliacaoMusicas = acervo.listar();

            return acervo.salvar(avaliacaoMusica);

        }


    public List<AvaliacaoMusica> listar() {
        return acervo.listar();
    }

    }



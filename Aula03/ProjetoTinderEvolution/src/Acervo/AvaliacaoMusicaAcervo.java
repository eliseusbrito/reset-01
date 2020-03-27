package Acervo;

import dominio.AvaliacaoMusica;
import dominio.Musica;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoMusicaAcervo {

    private static int contador = 1;
    private static final List<AvaliacaoMusica> avaliacaoMusicas = new ArrayList<>();

    public Musica salvar(Musica musica) {
//        avaliacaoMusicas.setId(contador++);
//        avaliacaoMusicas.add(avaliacaoMusicas);
        return musica;
    }
}

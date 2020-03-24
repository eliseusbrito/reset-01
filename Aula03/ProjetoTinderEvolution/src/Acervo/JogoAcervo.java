package Acervo;

import dominio.Jogo;

import java.util.ArrayList;
import java.util.List;

public class JogoAcervo {
    private static int contador = 1;
    private static final List<Jogo> jogos = new ArrayList<>();

    public Jogo salvar(Jogo jogo) {
        jogo.setId(contador++);
        jogos.add(jogo);
        return jogo;
    }

    public List<Jogo> listar() {
        return jogos;
    }

    public Jogo pesquisar(int id) {
        for (Jogo jogo : jogos) {
            if (jogo.getId() == id) {
                return jogo;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Jogo jogoParaDeletar = pesquisar(id);
        if (jogoParaDeletar != null) {
            return jogos.remove(jogoParaDeletar);
        }
        return false;
    }

    public Jogo editar(final Jogo jogoParaEditar, final Jogo jogoAtualizada) {

        jogoParaEditar.setNome(jogoAtualizada.getNome());
        jogoParaEditar.setPublisher(jogoAtualizada.getPublisher());
        jogoParaEditar.setDataDeLancamento(jogoAtualizada.getDataDeLancamento());
        jogoParaEditar.setCategoriaJogo(jogoAtualizada.getCategoriaJogo());
        jogoParaEditar.setPlataformaJogo(jogoAtualizada.getPlataformaJogo());

        return jogoParaEditar;

    }

}

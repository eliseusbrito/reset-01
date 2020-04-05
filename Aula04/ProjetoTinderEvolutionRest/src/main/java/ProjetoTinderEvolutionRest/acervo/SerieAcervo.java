package ProjetoTinderEvolutionRest.acervo;

import ProjetoTinderEvolutionRest.dominio.Serie;

import java.util.ArrayList;
import java.util.List;

public class SerieAcervo {
    private static int contador = 1;
    private static final List<Serie> series = new ArrayList<>();

    public Serie salvar(Serie serie) {
        serie.setId(contador++);
        series.add(serie);
        return serie;
    }

    public List<Serie> listar() {
        return series;
    }

    public Serie pesquisar(int id) {
        for (Serie serie : series) {
            if (serie.getId() == id) {
                return serie;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Serie serieParaDeletar = pesquisar(id);
        if (serieParaDeletar != null) {
            return series.remove(serieParaDeletar);
        }
        return false;
    }

    public Serie editar(final Serie serieParaEditar, final Serie serieAtualizada) {

        serieParaEditar.setNome(serieAtualizada.getNome());
        serieParaEditar.setDiretor(serieAtualizada.getDiretor());
        serieParaEditar.setDataDeLancamento(serieAtualizada.getDataDeLancamento());
        serieParaEditar.setNumeroDeTemporadas(serieAtualizada.getNumeroDeTemporadas());
        serieParaEditar.setNumeroDeEpisodios(serieAtualizada.getNumeroDeEpisodios());
        serieParaEditar.setCategoriaSerie(serieAtualizada.getCategoriaSerie());
        serieParaEditar.setSinopse(serieAtualizada.getSinopse());
        return serieParaEditar;

    }
}


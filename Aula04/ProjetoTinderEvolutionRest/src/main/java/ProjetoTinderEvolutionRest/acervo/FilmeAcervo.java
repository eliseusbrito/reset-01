package ProjetoTinderEvolutionRest.acervo;

import ProjetoTinderEvolutionRest.dominio.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmeAcervo {
    private static int contador = 1;
    private static final List<Filme> filmes = new ArrayList<>();

    public Filme salvar(Filme filme) {
        filme.setId(contador++);
        filmes.add(filme);
        return filme;
    }

    public List<Filme> listar() {
        return filmes;
    }

    public Filme pesquisar(int id) {
        for (Filme filme : filmes) {
            if (filme.getId() == id) {
                return filme;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Filme filmeParaDeletar = pesquisar(id);
        if (filmeParaDeletar != null) {
            return filmes.remove(filmeParaDeletar);
        }
        return false;
    }

    public Filme editar(final Filme filmeParaEditar, final Filme filmeAtualizada) {

        filmeParaEditar.setNome(filmeAtualizada.getNome());
        filmeParaEditar.setDiretor(filmeAtualizada.getDiretor());
        filmeParaEditar.setDataDeLancamento(filmeAtualizada.getDataDeLancamento());
        filmeParaEditar.setCategoriaFilme(filmeAtualizada.getCategoriaFilme());
        filmeParaEditar.setSinopse(filmeAtualizada.getSinopse());
        return filmeParaEditar;

    }
}

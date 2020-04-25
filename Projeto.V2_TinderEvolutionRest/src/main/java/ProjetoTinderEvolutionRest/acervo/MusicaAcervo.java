package ProjetoTinderEvolutionRest.acervo;

import ProjetoTinderEvolutionRest.dominio.Musica;
import java.util.ArrayList;
import java.util.List;

public class MusicaAcervo {
    private static int contador = 1;
    public static final List<Musica> musicas = new ArrayList<>();

    public Musica salvar(Musica musica) {
        musica.setId(contador++);
        musicas.add(musica);
        return musica;
    }

    public List<Musica> listar() {
        return musicas;
    }

    public Musica pesquisar(int id) {
        for (Musica musica : musicas) {
            if (musica.getId() == id) {
                return musica;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Musica musicaParaDeletar = pesquisar(id);
        if (musicaParaDeletar != null) {
            return musicas.remove(musicaParaDeletar);
        }
        return false;
    }

    public Musica editar(final Musica musicaParaEditar, final Musica musicaAtualizada) {
        musicaParaEditar.setNome(musicaAtualizada.getNome());
        musicaParaEditar.setArtista(musicaAtualizada.getArtista());
        musicaParaEditar.setAutor(musicaAtualizada.getAutor());
        musicaParaEditar.setDataDeLancamento(musicaAtualizada.getDataDeLancamento());
        musicaParaEditar.setEstiloMusical(musicaAtualizada.getEstiloMusical());
        return musicaParaEditar;
    }
}


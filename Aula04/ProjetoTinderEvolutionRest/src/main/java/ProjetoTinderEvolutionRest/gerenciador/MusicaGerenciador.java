package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.MusicaAcervo;
import ProjetoTinderEvolutionRest.dominio.Musica;

import java.time.LocalDate;
import java.util.List;

public class MusicaGerenciador {

    public Musica editar(int id, Musica musicaAtualizada) {

        Musica musicaParaEditar = pesquisar(id);

        if (musicaParaEditar == null) {
            return null;
        } else {
            return acervo.editar(musicaParaEditar, musicaAtualizada);
        }
    }

    private MusicaAcervo acervo = new MusicaAcervo();

    public Musica salvar(Musica musica) {
        List<Musica> musicas = acervo.listar();
        for (Musica musicaExistente : musicas) {
            if (musica.getNome().equals(musicaExistente.getNome())) {
                System.out.println("Nome já existente. A música não foi cadastrada. ");
                return musicaExistente;
            }       }
        if (musica.getDataDeLancamento().isAfter(LocalDate.now())) {
            System.out.println("A data digitada foi maior que data atual. A música não foi cadastrada.");
            return null;        }
        if (musica.getNome().equals(null)||musica.getArtista().equals(null)||musica.getAutor().equals(null)||musica.getDataDeLancamento().equals(null)||musica.getEstiloMusical().equals(null)){
            System.out.println("Algum campo não foi prenchido. A música não foi cadastrada.");
            return null;        }
        if (musica.getNome().equals("")||musica.getArtista().equals("")||musica.getAutor().equals("")||musica.getDataDeLancamento().equals("")||musica.getEstiloMusical().equals("")){
            System.out.println("Algum campo não foi prenchido. A música não foi cadastrada.");
            return null;        }
        if (musica.getNome().isEmpty() || musica.getArtista().isEmpty() || musica.getAutor().isEmpty() || musica.getDataDeLancamento().equals(null) || musica.getEstiloMusical().equals(null)) {
            System.out.println("Algum campo não foi prenchido. A música não foi cadastrada.");
            return null;
        }
        return acervo.salvar(musica);
    }

    public List<Musica> listar() {
        return acervo.listar();
    }

    public Musica pesquisar(int id) {
        if (id > 0) {
            return acervo.pesquisar(id);
        }
        return null;
    }

    public boolean deletar(int id) {
        if (id > 0) {
            return acervo.deletar(id);
        }
        return false;
    }
}

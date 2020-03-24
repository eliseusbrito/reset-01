package gerenciador;

import Acervo.SerieAcervo;
import dominio.Serie;

import java.time.LocalDate;
import java.util.List;

public class SerieGerenciador {
    private SerieAcervo acervo = new SerieAcervo();

    public Serie salvar(Serie serie) {
        List<Serie> series = acervo.listar();
        for (Serie serieExistente : series) {
            if (serie.getNome().equals(serieExistente.getNome())) {
                System.out.println("Nome já existente. A série não foi cadastrada. ");
                return serieExistente;
            }       }
        if (serie.getDataDeLancamento().isAfter(LocalDate.now())) {
            System.out.println("A data digitada foi maior que data atual. A série não foi cadastrada.");
            return null;        }
        if (serie.getNumeroDeTemporadas()<=0) {
            System.out.println("Deve ter no mínimo uma temporada. A série não foi cadastrada.");
            return null;        }
        if (serie.getNumeroDeEpisodios()>=serie.getNumeroDeTemporadas()) {
            System.out.println("Deve ter no mínimo um episodio por Temporada. A série não foi cadastrada.");
            return null;        }

        return acervo.salvar(serie);
    }

    public List<Serie> listar() {
        return acervo.listar();
    }

    public Serie pesquisar(int id) {
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

    public Serie editar(int id, Serie serieAtualizada) {

        Serie serieParaEditar = pesquisar(id);

        if (serieParaEditar == null) {
            return null;
        } else {
            return acervo.editar(serieParaEditar, serieAtualizada);
        }
    }
}




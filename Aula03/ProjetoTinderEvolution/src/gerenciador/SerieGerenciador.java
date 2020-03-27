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
        if (serie.getNumeroDeEpisodios()<serie.getNumeroDeTemporadas()) {
            System.out.println("Deve ter no mínimo um episodio por Temporada. A série não foi cadastrada.");
            return null;        }
        if (serie.getNome().equals(null)||serie.getDiretor().equals(null)||serie.getDataDeLancamento().equals(null)||serie.getNumeroDeTemporadas().equals(null)||serie.getNumeroDeEpisodios().equals(null)||serie.getCategoriaSerie().equals(null)||serie.getSinopse().equals(null)){
            System.out.println("Algum campo não foi prenchido. A Série não foi cadastrada.");
            return null;        }
        if (serie.getNome().equals("")||serie.getDiretor().equals("")||serie.getDataDeLancamento().equals("")||serie.getNumeroDeTemporadas().equals("")||serie.getNumeroDeEpisodios().equals("")||serie.getCategoriaSerie().equals("")||serie.getSinopse().equals("")){
            System.out.println("Algum campo não foi prenchido. A Série não foi cadastrada.");
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




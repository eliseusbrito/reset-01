package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.FilmeAcervo;
import ProjetoTinderEvolutionRest.dominio.Filme;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service

public class FilmeGerenciador {
    private FilmeAcervo acervo = new FilmeAcervo();


    public Filme salvar(Filme filme) {
        List<Filme> filmes = acervo.listar();
        for (Filme filmeExistente : filmes) {
            if (filme.getNome().equals(filmeExistente.getNome())) {
                System.out.println("Nome já existente. O filme não foi cadastrado. ");
                return filmeExistente;
            }       }
        if (filme.getDataDeLancamento().isAfter(LocalDate.now())) {
            System.out.println("A data digitada foi maior que data atual. O filme não foi cadastrado.");
            return null;        }
        if (filme.getNome().equals(null)||filme.getNome().equals(null)||filme.getDiretor().equals(null)||filme.getDataDeLancamento().equals(null)||filme.getCategoriaFilme().equals(null)||filme.getSinopse().equals(null)){
            System.out.println("Algum campo não foi prenchido. O Filme não foi cadastrado.");
            return null;        }
        if (filme.getNome().equals("")||filme.getNome().equals("")||filme.getDiretor().equals("")||filme.getDataDeLancamento().equals("")||filme.getCategoriaFilme().equals("")||filme.getSinopse().equals("")){
            System.out.println("Algum campo não foi prenchido. O Filme não foi cadastrado.");
            return null;        }
        return acervo.salvar(filme);
    }


    public List<Filme> listar() {
        return acervo.listar();
    }

    public Filme pesquisar(int id) {
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

    public Filme editar(int id, Filme filmeAtualizado) {

        Filme filmeParaEditar = pesquisar(id);

        if (filmeParaEditar == null) {
            return null;
        } else {
            return acervo.editar(filmeParaEditar, filmeAtualizado);
        }
    }
}

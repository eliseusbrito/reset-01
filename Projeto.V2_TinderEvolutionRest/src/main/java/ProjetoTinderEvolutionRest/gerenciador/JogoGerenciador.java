package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.JogoAcervo;
import ProjetoTinderEvolutionRest.dominio.Jogo;

import java.time.LocalDate;
import java.util.List;

public class JogoGerenciador {
    public Jogo editar(int id, Jogo jogoAtualizado) {

        Jogo jogoParaEditar = pesquisar(id);

        if (jogoParaEditar == null) {
            return null;
        } else {
            return acervo.editar(jogoParaEditar, jogoAtualizado);
        }
    }

    private JogoAcervo acervo = new JogoAcervo();

    public Jogo salvar(Jogo jogo) {
        List<Jogo> jogos = acervo.listar();
        for (Jogo jogoExistente : jogos) {
            if (jogo.getNome().equals(jogoExistente.getNome())) {
                System.out.println("Nome já existente. O jogo não foi cadastrado. ");
                return jogoExistente;
            }       }
        if (jogo.getDataDeLancamento().isAfter(LocalDate.now())) {
            System.out.println("A data digitada foi maior que data atual. O jogo não foi cadastrado.");
            return null;        }
        if (jogo.getNome().equals(null)||jogo.getDataDeLancamento().equals(null)||jogo.getCategoriaJogo().equals(null)||jogo.getPlataformaJogo().equals(null)){
            System.out.println("Algum campo não foi prenchido. O Jogo não foi cadastrado.");
            return null;        }
        if (jogo.getNome().equals("")||jogo.getDataDeLancamento().equals("")||jogo.getCategoriaJogo().equals("")||jogo.getPlataformaJogo().equals("")){
            System.out.println("Algum campo não foi prenchido. O Jogo não foi cadastrado.");
            return null;        }
        return acervo.salvar(jogo);
    }

    public List<Jogo> listar() {
        return acervo.listar();
    }

    public Jogo pesquisar(int id) {
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

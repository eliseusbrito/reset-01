package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.CuriosidadeAcervo;
import ProjetoTinderEvolutionRest.dominio.Curiosidade;

import java.util.List;

public class CuriosidadeGerenciador {
    public Curiosidade editar(int id, Curiosidade curiosidadeAtualizada) {

        Curiosidade curiosidadeParaEditar = pesquisar(id);

        if (curiosidadeParaEditar == null) {
            return null;
        } else {
            return acervo.editar(curiosidadeParaEditar, curiosidadeAtualizada);
        }
    }

    private CuriosidadeAcervo acervo = new CuriosidadeAcervo();

    public Curiosidade salvar(Curiosidade curiosidade) {
        if (curiosidade.getDescricao().equals(null)||curiosidade.getCategoriaCuriosidade().equals(null)){
            System.out.println("Algum campo não foi prenchido. A Curiosidade não foi cadastrada.");
            return null;}
        if (curiosidade.getDescricao().equals("")||curiosidade.getCategoriaCuriosidade().equals("")){
                System.out.println("Algum campo não foi prenchido. A Curiosidade não foi cadastrada.");
            return null; }

        return acervo.salvar(curiosidade);
    }

    public List<Curiosidade> listar() {
        return acervo.listar();
    }

    public Curiosidade pesquisar(int id) {
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


package gerenciador;

import Acervo.CuriosidadeAcervo;
import dominio.Curiosidade;

import java.time.LocalDate;
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
        List<Curiosidade> curiosidades = acervo.listar();
        for (Curiosidade curiosidadeExistente : curiosidades) {
            if (curiosidade.getDescricao().equals(curiosidadeExistente.getDescricao())) {
                System.out.println("Descrição já existente. A curiosidade não foi cadastrada. ");
                return curiosidadeExistente;
            }       }
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


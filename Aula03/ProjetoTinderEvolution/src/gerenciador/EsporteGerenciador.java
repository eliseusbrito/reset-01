package gerenciador;

import Acervo.EsporteAcervo;
import dominio.Esporte;
import java.util.List;

public class EsporteGerenciador {
    public Esporte editar(int id, Esporte esporteAtualizada) {

        Esporte esporteParaEditar = pesquisar(id);

        if (esporteParaEditar == null) {
            return null;
        } else {
            return acervo.editar(esporteParaEditar, esporteAtualizada);
        }
    }

    private EsporteAcervo acervo = new EsporteAcervo();

    public Esporte salvar(Esporte esporte) {
        List<Esporte> esportes = acervo.listar();
        for (Esporte esporteExistente : esportes) {
            if (esporte.getNome().equals(esporteExistente.getNome())) {
                System.out.println("Nome já existente. O esporte não foi cadastrado. ");
                return esporteExistente;
            }       }
        if (esporte.getNome().equals(null)) {
            System.out.println("Algum campo não foi prenchido. O esporte não foi cadastrado.");
                return null;}
        if (esporte.getNome().equals("")) {
            System.out.println("Algum campo não foi prenchido. O esporte não foi cadastrado.");
                return null;}
        return acervo.salvar(esporte);
    }

    public List<Esporte> listar() {
        return acervo.listar();
    }

    public Esporte pesquisar(int id) {
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


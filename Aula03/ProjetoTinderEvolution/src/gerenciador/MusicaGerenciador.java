package gerenciador;

import Acervo.MusicaAcervo;
import dominio.Musica;

import java.sql.SQLOutput;
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

//### Música
//- Não pode existir duas músicas com o mesmo nome
//- A data de lançamento não pode ser uma data futura
//- Os estilos aceitos são { funk | pagode | rock | indie | sertanejo | metal }
//- Todos os campos são obrigatórios
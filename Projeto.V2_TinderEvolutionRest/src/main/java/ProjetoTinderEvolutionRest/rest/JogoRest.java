package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogo")
public class JogoRest {
    private static int contador = 1;

    private List<Jogo> listaJogos = new ArrayList<>();

    @GetMapping
    public List<Jogo> listarTodosJogos() {
        System.out.println("listou todos os jogos");
        return listaJogos;
    }

    @GetMapping("{id}")
    public Jogo buscarPorId(@PathVariable("id") int id) {
        for (Jogo jogo : listaJogos) {
            if (jogo.getId() == id) {
                System.out.println("buscou jogo específico: [" + id + "]");
                return jogo;
            }
        }
        System.out.println("Jogo informado não existe: [" + id + "]");
        return null;
    }

    @PostMapping
    public Jogo cadastrar(@RequestBody Jogo jogo) {
        jogo.setId(contador);
        listaJogos.add(jogo);
        System.out.println("Adicionou jogo: "+ contador);
        contador++;
        return jogo;
    }

    @PutMapping("{id}")
    public Jogo editar(@PathVariable("id") int id, @RequestBody Jogo body) {
        for (Jogo jogo : listaJogos) {
            if (jogo.getId() == id) {
                jogo.setNome(body.getNome());
                jogo.setPublisher(body.getPublisher());
                jogo.setDataDeLancamento(body.getDataDeLancamento());
                jogo.setCategoriaJogo(body.getCategoriaJogo());
                jogo.setPlataformaJogo(body.getPlataformaJogo());
                System.out.println("atualizado o jogo informado: [" + id + "] - " + jogo);
                return jogo;
            }
        }
        System.out.println("Não havia jogo para atualizar: [" + id + "]");
        return null;
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        for (Jogo jogo : listaJogos) {
            if (jogo.getId() == id) {
                listaJogos.remove(jogo.getId()-1);
                System.out.println("deletou a jogo informado: [" + id + "]");
            }
        }
        System.out.println("Não havia jogo para deletar");
    }


}

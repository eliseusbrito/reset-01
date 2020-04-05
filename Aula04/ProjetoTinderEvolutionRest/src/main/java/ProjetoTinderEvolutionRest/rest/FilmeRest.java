package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Filme;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeRest {
    private static int contador = 1;

    private List<Filme> listaFilmes = new ArrayList<>();

    @GetMapping
    public List<Filme> listarTodosFilmes() {
        System.out.println("listou todos os filmes");
        return listaFilmes;
    }

    @GetMapping("{id}")
    public Filme buscarPorId(@PathVariable("id") int id) {
        for (Filme filme : listaFilmes) {
            if (filme.getId() == id) {
                System.out.println("buscou filme específico: [" + id + "]");
                return filme;
            }
        }
        System.out.println("Filme informado não existe: [" + id + "]");
        return null;
    }

    @PostMapping
    public Filme cadastrar(@RequestBody Filme filme) {
        filme.setId(contador);
        listaFilmes.add(filme);
        System.out.println("Adicionou filme: "+ contador);
        contador++;
        return filme;
    }

    @PutMapping("{id}")
    public Filme editar(@PathVariable("id") int id, @RequestBody Filme body) {
        for (Filme filme : listaFilmes) {
            if (filme.getId() == id) {
                filme.setNome(body.getNome());
                filme.setDiretor(body.getDiretor());
                filme.setDataDeLancamento(body.getDataDeLancamento());
                filme.setCategoriaFilme(body.getCategoriaFilme());
                filme.setSinopse(body.getSinopse());
                System.out.println("atualizado o filme informado: [" + id + "] - " + filme);
                return filme;
            }
        }
        System.out.println("Não havia filme para atualizar: [" + id + "]");
        return null;
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        for (Filme filme : listaFilmes) {
            if (filme.getId() == id) {
                listaFilmes.remove(filme.getId()-1);
                System.out.println("deletou o filme informado: [" + id + "]");
            }
        }
        System.out.println("Não havia filme para deletar");
    }

}

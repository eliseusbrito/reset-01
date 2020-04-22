package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Filme;
import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.gerenciador.FilmeGerenciador;
import ProjetoTinderEvolutionRest.gerenciador.MusicaGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeRest {
    private FilmeGerenciador gerenciador = new FilmeGerenciador();


    @GetMapping
    public List<Filme> listarTodosFilmes() {
        System.out.println("listou todos os filmes");
        return gerenciador.listar();
    }


    @GetMapping("{id}")
    public Filme buscarPorId(@PathVariable("id") int id) {
        Filme filme = gerenciador.pesquisar(id);
        if (filme.getId() == id) {
            System.out.println("buscou filme específico: [" + id + "]");
            return filme;
        }
        System.out.println("Filme informado não existe: [" + id + "]");
        return null;
    }

    @PostMapping
    public Filme cadastrar(@RequestBody Filme filme) {
        return gerenciador.salvar(filme);
    }

    @PutMapping("{id}")
    public Filme editar(@PathVariable("id") int id, @RequestBody Filme body) {
        return gerenciador.editar(id, body);
    }


    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        Filme filme = gerenciador.pesquisar(id);
        System.out.println(filme);
        if(filme==null){throw new RuntimeException("Não havia filme para deletar");
        }else{
            gerenciador.deletar(filme.getId());
            System.out.println("Deletou o filme informado: [" + id + "]");
        }
    }


}

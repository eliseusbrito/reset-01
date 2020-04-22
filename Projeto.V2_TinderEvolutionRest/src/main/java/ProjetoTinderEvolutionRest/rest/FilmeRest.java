package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Filme;
import ProjetoTinderEvolutionRest.gerenciador.FilmeGerenciador;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/filme")

public class FilmeRest {

    private FilmeGerenciador gerenciador = new FilmeGerenciador();

    @GetMapping
    public List<Filme> listarTodosFilmes() {
        System.out.println("Listou todos os filmes");
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Filme buscarPorId(@PathVariable("id") int id) {
        System.out.println("Buscou uma música: [" + id + "]");
        return gerenciador.pesquisar(id);
    }

    @PostMapping
    public Filme cadastrar(@RequestBody Filme filme) {
        System.out.println("Salvou um filme");
        return gerenciador.salvar(filme);
    }

    @PutMapping("{id}")
    public Filme editar(@PathVariable("id") int id, @RequestBody Filme body) {
        System.out.println("Editou um filme");
        return gerenciador.editar(id, body);
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        gerenciador.deletar(id);
        System.out.println("Deletou o filme informado: [" + id + "]");
    }

}

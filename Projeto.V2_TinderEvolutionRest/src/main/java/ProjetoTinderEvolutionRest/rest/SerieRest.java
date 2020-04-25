package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Serie;
import ProjetoTinderEvolutionRest.gerenciador.SerieGerenciador;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/serie")

public class SerieRest {

    private SerieGerenciador gerenciador = new SerieGerenciador();

    @GetMapping
    public List<Serie> listarTodosSeries() {
        System.out.println("listou todos as series");
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Serie buscarPorId(@PathVariable("id") int id) {
        System.out.println("Buscou série por Id");
        return gerenciador.pesquisar(id);
    }

    @PostMapping
    public Serie cadastrar(@RequestBody Serie serie) {
        System.out.println("Salvou uma série");
        return gerenciador.salvar(serie);
    }

    @PutMapping("{id}")
    public Serie editar(@PathVariable("id") int id, @RequestBody Serie body) {
        System.out.println("Editou uma série");
        return gerenciador.editar(id, body);
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        gerenciador.deletar(id);
        System.out.println("Deletou a série informada: [" + id + "]");
    }
}

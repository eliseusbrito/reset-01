package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Curiosidade;
import ProjetoTinderEvolutionRest.gerenciador.CuriosidadeGerenciador;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/curiosidade")

public class CuriosidadeRest {
    private CuriosidadeGerenciador gerenciador = new CuriosidadeGerenciador();

    @GetMapping
    public List<Curiosidade> listar(){
        System.out.println("listou todas as curiosidades");
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Curiosidade buscarPorId(@PathVariable("id") int id) {
        System.out.println("Buscou curiosidade por Id");
        return gerenciador.pesquisar(id);
    }

    @PostMapping
    public Curiosidade cadastrar(@RequestBody Curiosidade curiosidade) {
        System.out.println("Salvou uma curiosidade");
        return gerenciador.salvar(curiosidade);
    }

    @PutMapping("{id}")
    public Curiosidade editar(@PathVariable("id") int id, @RequestBody Curiosidade body) {
        System.out.println("Editou uma curiosidade");
        return gerenciador.editar(id, body);
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        gerenciador.deletar(id);
        System.out.println("Deletou a curiosidade informada: [" + id + "]");
    }

}

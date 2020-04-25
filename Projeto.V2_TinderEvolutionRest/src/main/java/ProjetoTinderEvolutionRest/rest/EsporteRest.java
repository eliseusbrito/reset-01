package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Esporte;
import ProjetoTinderEvolutionRest.dominio.Esporte;
import ProjetoTinderEvolutionRest.gerenciador.EsporteGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/esporte")
public class EsporteRest {
    private EsporteGerenciador gerenciador = new EsporteGerenciador();

    @GetMapping
    public List<Esporte> listar(){
        System.out.println("listou todas os Esportes");
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Esporte buscarPorId(@PathVariable("id") int id) {
        System.out.println("Buscou esporte por Id");
        return gerenciador.pesquisar(id);
    }

    @PostMapping
    public Esporte cadastrar(@RequestBody Esporte esporte) {
        System.out.println("Salvou um esporte");
        return gerenciador.salvar(esporte);
    }

    @PutMapping("{id}")
    public Esporte editar(@PathVariable("id") int id, @RequestBody Esporte body) {
        System.out.println("Editou um esporte");
        return gerenciador.editar(id, body);
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        gerenciador.deletar(id);
        System.out.println("Deletou o esporte informado: [" + id + "]");
    }

}

package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.gerenciador.MusicaGerenciador;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/musica")

public class MusicaRest {

    private MusicaGerenciador gerenciador = new MusicaGerenciador();

    @GetMapping
    public List<Musica> listar(){
        System.out.println("listou todas as músicas");
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Musica buscarPorId(@PathVariable("id") int id) {
        System.out.println("Buscou música por Id");
        return gerenciador.pesquisar(id);
    }

    @PostMapping
    public Musica cadastrar(@RequestBody Musica musica) {
        System.out.println("Salvou uma música");
        return gerenciador.salvar(musica);
    }

    @PutMapping("{id}")
    public Musica editar(@PathVariable("id") int id, @RequestBody Musica body) {
        System.out.println("Editou uma música");
        return gerenciador.editar(id, body);
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        gerenciador.deletar(id);
        System.out.println("Deletou a musica informada: [" + id + "]");
    }
}
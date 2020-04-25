package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Jogo;
import ProjetoTinderEvolutionRest.gerenciador.JogoGerenciador;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/jogo")
public class JogoRest {

    private JogoGerenciador gerenciador = new JogoGerenciador();

    @GetMapping
    public List<Jogo> listar(){
        System.out.println("listou todos os jogo");
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Jogo buscarPorId(@PathVariable("id") int id) {
        System.out.println("Buscou jogo por Id");
        return gerenciador.pesquisar(id);
    }

    @PostMapping
    public Jogo cadastrar(@RequestBody Jogo jogo) {
        System.out.println("Salvou um jogo");
        return gerenciador.salvar(jogo);
    }

    @PutMapping("{id}")
    public Jogo editar(@PathVariable("id") int id, @RequestBody Jogo body) {
        System.out.println("Editou um jogo");
        return gerenciador.editar(id, body);
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        gerenciador.deletar(id);
        System.out.println("Deletou o jogo informada: [" + id + "]");
    }


}

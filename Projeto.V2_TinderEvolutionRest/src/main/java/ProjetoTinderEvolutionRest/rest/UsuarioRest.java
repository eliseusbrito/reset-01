package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuario")

public class UsuarioRest {

    private UsuarioGerenciador gerenciador = new UsuarioGerenciador();

    @GetMapping
    public List<Usuario> listarTodosUsuarios() {
        System.out.println("Listou todos os usuarios");
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Usuario buscarPorId(@PathVariable("id") int id) {
        System.out.println("Buscou usuário por Id");
        return gerenciador.pesquisar(id);
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        System.out.println("Cadastrou usuário");
        return gerenciador.salvar(usuario);
    }

    @PutMapping("{id}")
    public Usuario editar(@PathVariable("id") int id, @RequestBody Usuario body) {
        System.out.println("Editou usuário");
        return gerenciador.editar(id, body);
    }

    @DeleteMapping("{id}")
    public boolean excluir(@PathVariable("id") int id) {
        System.out.println("Excluiu usuário");
        return gerenciador.deletar(id);
    }

}

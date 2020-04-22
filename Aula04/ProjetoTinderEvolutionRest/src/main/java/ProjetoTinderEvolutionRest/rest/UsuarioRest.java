package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")

public class UsuarioRest {

    private static int contador = 1;

    private List<Usuario> listaUsuarios = new ArrayList<>();

    private UsuarioGerenciador gerenciador = new UsuarioGerenciador();

    @GetMapping
    public List<Usuario> listarTodosUsuarios() {
        System.out.println("listou todos os usuarios");
        return gerenciador.listar();
//        return listaUsuarios;
    }

    @GetMapping("{id}")
    public Usuario buscarPorId(@PathVariable("id") int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                System.out.println("buscou usuario específico: [" + id + "]");
                return usuario;
            }
        }
        System.out.println("Usuario informado não existe: [" + id + "]");
        return null;
    }

//    @GetMapping("{id}")
//    public Usuario buscarPorId(@PathVariable("id") int id) {
//        return listaUsuarios.get(id-1);
//    }//este codigo também funciona, somenteé pior porque quando pele para listar id inexistente dá erro no postman, se usar o if retorna lista null


//    @PostMapping
//    public Usuario cadastrar(@RequestBody Usuario usuario) {
//        usuario.setId(contador);
//        listaUsuarios.add(usuario);
//        System.out.println("Adicionou usuario: "+ contador);
//        contador++;
//        return usuario;
//    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        System.out.println("Entrou em PostMApping Usuario Cadastrar");
        System.out.println("RequestBoby: "+ usuario);
        return gerenciador.salvar(usuario);
    }

    @PutMapping("{id}")
    public Usuario editar(@PathVariable("id") int id, @RequestBody Usuario body) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                usuario.setNome(body.getNome());
                usuario.setEmail(body.getEmail());
                usuario.setTelefone(body.getTelefone());
                usuario.setDataDeNascimento(body.getDataDeNascimento());
                usuario.setBio(body.getBio());
                usuario.setLatitude(body.getLatitude());
                usuario.setLongitude(body.getLongitude());
                System.out.println("atualizado o usuario informado: [" + id + "] - " + usuario);
                return usuario;
            }
        }
        System.out.println("Não havia usuario para atualizar: [" + id + "]");
        return null;
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                listaUsuarios.remove(usuario.getId()-1);
                System.out.println("deletou o usuario informado: [" + id + "]");
            }
        }
        System.out.println("Não havia usuario para deletar");
    }

//    @DeleteMapping("{id}")
//    public void excluir(@PathVariable("id") int id) {
//        listaUsuarios.remove(id-1);
//        System.out.println("deletou usuario");
//    }//este codigo também funciona, somenteé pior porque quando pele para listar id inexistente dá erro no postman, se usar o if retorna lista null


}

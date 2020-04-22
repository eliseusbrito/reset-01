package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.MatchGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/matches")
public class MatchRest {

    @Autowired
    private MatchGerenciador gerenciadorMatches = new MatchGerenciador();

    //Listar Matches
//    @GetMapping("{id-usuario}")
//    public List<Usuario> listarMatches(@PathVariable("id-usuario") int id) {
//        return gerenciadorMatches.listarMatches(id);
//    }


    @PostMapping("/{id-avaliado}/avaliador/{id-avaliador}")
    public Usuario likeUsuario(@PathVariable("id-avaliado") int id, @PathVariable("id-avaliador") int idAvaliador) {
//        System.out.println("id = "+id);
//        System.out.println("idAvaliador = "+idAvaliador);
//        System.out.println("entrou");
        return gerenciadorMatches.likeUsuario(id, idAvaliador);
    }

    @DeleteMapping("/{id-avaliado}/avaliador/{id-avaliador}")
    public Usuario dislikeUsuario(@PathVariable("id-avaliado") int id, @PathVariable("id-avaliador") int idAvaliador){
//        System.out.println("id: "+id);
//        System.out.println("idAvaliador: "+idAvaliador);
        return gerenciadorMatches.dislikeUsuario(id, idAvaliador);
    }


}

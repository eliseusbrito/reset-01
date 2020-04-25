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

    @GetMapping("/liked/{id}")
    public List<Usuario> listarUsuariosLiked(@PathVariable("id") int id) {
        return gerenciadorMatches.listarUsuariosLiked(id);
    }

    @GetMapping("/disliked/{id}")
    public List<Usuario> listarUsuariosDisliked(@PathVariable("id") int id) {
        return gerenciadorMatches.listarUsuariosDisliked(id);
    }

    @GetMapping("/{id}")
    public List<Usuario> listarMathes(@PathVariable("id") int id) {
        return gerenciadorMatches.listarMatches(id);
    }

    @GetMapping("/{id}/best")
    public Usuario listarBest(@PathVariable("id") int id) {
        return gerenciadorMatches.listarUsuariosComuns(id);
    }

    @PostMapping("/{id-avaliado}/avaliador/{id-avaliador}/like")
    public Usuario likeUsuario(@PathVariable("id-avaliado") int id, @PathVariable("id-avaliador") int idAvaliador) {
        System.out.println("Like no usuário "+id);
        return gerenciadorMatches.likeUsuario(id, idAvaliador);
    }

    @PostMapping("/{id-avaliado}/avaliador/{id-avaliador}/dislike")
    public Usuario dislikeUsuario(@PathVariable("id-avaliado") int id, @PathVariable("id-avaliador") int idAvaliador) {
        System.out.println("Dislike no usuário "+id);
        return gerenciadorMatches.dislikeUsuario(id, idAvaliador);
    }

    @DeleteMapping("/{id-avaliado}/avaliador/{id-avaliador}/like")
    public Usuario desfazLikeUsuario(@PathVariable("id-avaliado") int id, @PathVariable("id-avaliador") int idAvaliador){
        System.out.println("Desfez Like no Usuario "+id);
        return gerenciadorMatches.desfazerlikeUsuario(id,idAvaliador);
    }

    @DeleteMapping("/{id-avaliado}/avaliador/{id-avaliador}/dislike")
    public Usuario desfazDislikeUsuario(@PathVariable("id-avaliado") int id, @PathVariable("id-avaliador") int idAvaliador){
        System.out.println("Desfez Dislike no usuario "+id);
        return gerenciadorMatches.desfazerDislikeUsuario(id, idAvaliador);
    }


}

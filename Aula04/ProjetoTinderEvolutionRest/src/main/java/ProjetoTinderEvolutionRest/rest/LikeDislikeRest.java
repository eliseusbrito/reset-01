package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Filme;
import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.LikeDislikeGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/likes")

public class LikeDislikeRest {

    @Autowired
    private LikeDislikeGerenciador gerenciadorLikeDislike= new LikeDislikeGerenciador();

    //Musica
    @GetMapping("/musica/{id-usuario}")
    public List<Musica> listarMusicasCurtidas(@PathVariable("id-usuario") int id) {
        return gerenciadorLikeDislike.listarMusicasUsuarios(id);
    }

    @PostMapping("/musica/{id-musica}/avaliador/{id-avaliador}")//http://localhost:8080/likes/musica/1/avaliador/1
    public Usuario curtirMusica(@PathVariable("id-musica") int id, @PathVariable("id-avaliador") int idAvaliador) {
        return gerenciadorLikeDislike.curtirMusica(id, idAvaliador);
    }

    //Filme
    @GetMapping("/filme/{id-usuario}")
    public List<Filme> listarFilmesCurtidas(@PathVariable("id-usuario") int id) {
        return gerenciadorLikeDislike.listarFilmesUsuarios(id);
    }

    @PostMapping("/filme/{id-filme}/avaliador/{id-avaliador}")
    public Usuario curtirFilme(@PathVariable("id-filme") int id, @PathVariable("id-avaliador") int idAvaliador) {
//        Usuario curtirFilme = new Usuario();
        System.out.println(id);
        System.out.println(idAvaliador);
        System.out.println("???????????");
        return gerenciadorLikeDislike.curtirFilme(id, idAvaliador);
    }

}

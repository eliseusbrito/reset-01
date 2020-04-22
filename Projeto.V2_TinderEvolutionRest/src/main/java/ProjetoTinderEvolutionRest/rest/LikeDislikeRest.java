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
    @GetMapping("/musica/{id}")
    public List<Musica> listarMusicasCurtidas(@PathVariable("id") int id) {
        System.out.println("Entrou em GetMapping Musica");
        return gerenciadorLikeDislike.listarMusicasUsuarios(id);
    }

    @PostMapping("/musica/{idMusica}/avaliador/{idAvaliador}")//http://localhost:8080/likes/musica/1/avaliador/1
    public Usuario curtirMusica(@PathVariable("idMusica") int idMusica, @PathVariable("idAvaliador") int idAvaliador) {
        System.out.println("IdMusica: "+idMusica);
        System.out.println("idAvaliador: "+idAvaliador);
        return gerenciadorLikeDislike.curtirMusica(idMusica, idAvaliador);
    }

    //Filme
    @GetMapping("/filme/{id}")
    public List<Filme> listarFilmesCurtidas(@PathVariable("id") int id) {
        return gerenciadorLikeDislike.listarFilmesUsuarios(id);
    }

    @PostMapping("/filme/{idFilme}/avaliador/{idAvaliador}")
    public Usuario curtirFilme(@PathVariable("idFilme") int idFilme, @PathVariable("idAvaliador") int idAvaliador) {
        System.out.println("PostMapping FILME em Rest");
        System.out.println("idFilme: " + idFilme);
        System.out.println("idAvaliador: "+idAvaliador);
        return gerenciadorLikeDislike.curtirFilme(idFilme, idAvaliador);
    }

}

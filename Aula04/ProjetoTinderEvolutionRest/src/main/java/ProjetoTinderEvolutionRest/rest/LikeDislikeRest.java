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

    @PostMapping("/filme/{id}/avaliador/{idAvaliador}")
    public Usuario curtirFilme(@PathVariable("id") int id, @PathVariable("idAvaliador") int idAvaliador) {
//        Usuario curtirFilme = new Usuario();
        System.out.println(id);
        System.out.println(idAvaliador);
        System.out.println("???????????");
        return gerenciadorLikeDislike.curtirFilme(id, idAvaliador);
    }

}

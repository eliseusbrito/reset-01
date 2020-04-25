package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.*;
import ProjetoTinderEvolutionRest.gerenciador.CurtirDescurtirGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/likes")

public class CurtirDescurtirRest {

    @Autowired
    private CurtirDescurtirGerenciador gerenciadorCurtirDescurtir= new CurtirDescurtirGerenciador();

    //Musica
    @GetMapping("/musica/{id}")
    public Usuario listarMusicasCurtidas(@PathVariable("id") int id) {
        return gerenciadorCurtirDescurtir.listarMusicasUsuarios(id);
    }

    @PostMapping("/musica/{idMusica}/avaliador/{idAvaliador}")
    public Usuario curtirMusica(@PathVariable("idMusica") int idMusica, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.curtirMusica(idMusica, idAvaliador);
    }

    @DeleteMapping("/musica/{idMusica}/avaliador/{idAvaliador}")
    public Usuario descurtirMusica(@PathVariable("idMusica") int idMusica, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.descurtirMusica(idMusica, idAvaliador);
    }

    //Filme
    @GetMapping("/filme/{id}")
    public List<Filme> listarFilmesCurtidas(@PathVariable("id") int id) {
        return gerenciadorCurtirDescurtir.listarFilmesUsuarios(id);
    }

    @PostMapping("/filme/{idFilme}/avaliador/{idAvaliador}")
    public Usuario curtirFilme(@PathVariable("idFilme") int idFilme, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.curtirFilme(idFilme, idAvaliador);
    }

    @DeleteMapping("/filme/{idMusica}/avaliador/{idAvaliador}")
    public Usuario descurtirFilme(@PathVariable("idFilme") int idFilme, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.descurtirFilme(idFilme, idAvaliador);
    }

    //Serie
    @GetMapping("/serie/{id}")
    public List<Serie> listarSeriesCurtidas(@PathVariable("id") int id) {
        return gerenciadorCurtirDescurtir.listarSeriesUsuarios(id);
    }

    @PostMapping("/serie/{idSerie}/avaliador/{idAvaliador}")
    public Usuario curtirSerie(@PathVariable("idSerie") int idSerie, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.curtirSerie(idSerie, idAvaliador);
    }

    @DeleteMapping("/serie/{idSerie}/avaliador/{idAvaliador}")
    public Usuario descurtirSerie(@PathVariable("idSerie") int idSerie, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.descurtirSerie(idSerie, idAvaliador);
    }

    //Jogo
    @GetMapping("/jogo/{id}")
    public List<Jogo> listarJogosCurtidas(@PathVariable("id") int id) {
        return gerenciadorCurtirDescurtir.listarJogosUsuarios(id);
    }

    @PostMapping("/jogo/{idJogo}/avaliador/{idAvaliador}")
    public Usuario curtirJogo(@PathVariable("idJogo") int idJogo, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.curtirJogo(idJogo, idAvaliador);
    }

    @DeleteMapping("/jogo/{idJogo}/avaliador/{idAvaliador}")
    public Usuario descurtirJogo(@PathVariable("idJogo") int idJogo, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.descurtirJogo(idJogo, idAvaliador);
    }

    //Esporte
    @GetMapping("/esporte/{id}")
    public List<Esporte> listarEsportesCurtidas(@PathVariable("id") int id) {
        return gerenciadorCurtirDescurtir.listarEsportesUsuarios(id);
    }

    @PostMapping("/esporte/{idEsporte}/avaliador/{idAvaliador}")
    public Usuario curtirEsporte(@PathVariable("idEsporte") int idEsporte, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.curtirEsporte(idEsporte, idAvaliador);
    }

    @DeleteMapping("/esporte/{idEsporte}/avaliador/{idAvaliador}")
    public Usuario descurtirEsporte(@PathVariable("idEsporte") int idEsporte, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.descurtirEsporte(idEsporte, idAvaliador);
    }

    //Curiosidade
    @GetMapping("/curiosidade/{id}")
    public List<Curiosidade> listarCuriosidadesCurtidas(@PathVariable("id") int id) {
        return gerenciadorCurtirDescurtir.listarCuriosidadesUsuarios(id);
    }

    @PostMapping("/curiosidade/{idCuriosidade}/avaliador/{idAvaliador}")
    public Usuario curtirCuriosidade(@PathVariable("idCuriosidade") int idCuriosidade, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.curtirCuriosidade(idCuriosidade, idAvaliador);
    }

    @DeleteMapping("/curiosidade/{idCuriosidade}/avaliador/{idAvaliador}")
    public Usuario descurtirCuriosidade(@PathVariable("idCuriosidade") int idCuriosidade, @PathVariable("idAvaliador") int idAvaliador) {
        return gerenciadorCurtirDescurtir.descurtirCuriosidade(idCuriosidade, idAvaliador);
    }



}

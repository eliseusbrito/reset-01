package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.FilmeAcervo;
import ProjetoTinderEvolutionRest.acervo.LikeDisUsuarioAcervo;
import ProjetoTinderEvolutionRest.acervo.MusicaAcervo;
import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Filme;
import ProjetoTinderEvolutionRest.dominio.LikeDislikeUsuario;
import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.dominio.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LikeDislikeGerenciador {

    private UsuarioGerenciador gerenciadorUsuario = new UsuarioGerenciador();
    private MusicaGerenciador gerenciadorMusica = new MusicaGerenciador();
    private UsuarioAcervo acervoCurtirMusica = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirFilme = new UsuarioAcervo();
    private MusicaAcervo acervoMusica = new MusicaAcervo();
    private FilmeAcervo acervoFilme = new FilmeAcervo();
    private


    LikeDisUsuarioAcervo acervo = new LikeDisUsuarioAcervo();

    public LikeDislikeUsuario salvar (LikeDislikeUsuario match){
        List<LikeDislikeUsuario> matchLista = acervo.listar();
        return acervo.salvar(match);
    }

    public List<LikeDislikeUsuario> listar() {
        return acervo.listar();
    }


//    Curtir música
    public Usuario curtirMusica(int idMusica, int idUsuario) {
        return acervoCurtirMusica.curtirMusica(idMusica,idUsuario);
    }

    public List<Musica> listarMusicasUsuarios(int id){
        return acervoMusica.listar();
    }

//    Curtir Filme
    public Usuario curtirFilme(int idFilme, int idUsuario) {
        return acervoCurtirFilme.curtirFilme(idFilme,idUsuario);
    }

    public List<Filme> listarFilmesUsuarios(int id){
        return acervoFilme.listar();
    }

}
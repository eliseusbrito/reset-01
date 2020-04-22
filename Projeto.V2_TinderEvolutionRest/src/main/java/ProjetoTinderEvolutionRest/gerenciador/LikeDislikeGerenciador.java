package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.*;
import ProjetoTinderEvolutionRest.dominio.*;
import org.springframework.stereotype.Service;

import java.util.List;

import static ProjetoTinderEvolutionRest.acervo.MusicaAcervo.musicas;
import static ProjetoTinderEvolutionRest.acervo.FilmeAcervo.filmes;
import static ProjetoTinderEvolutionRest.acervo.SerieAcervo.series;
import static ProjetoTinderEvolutionRest.acervo.JogoAcervo.jogos;
import static ProjetoTinderEvolutionRest.acervo.EsporteAcervo.esportes;
import static ProjetoTinderEvolutionRest.acervo.CuriosidadeAcervo.curiosidades;

@Service

public class LikeDislikeGerenciador {

    private UsuarioGerenciador gerenciadorUsuario = new UsuarioGerenciador();
    private MusicaGerenciador gerenciadorMusica = new MusicaGerenciador();
    private FilmeGerenciador gerenciadorFilme = new FilmeGerenciador();
    private SerieGerenciador gerenciadorSerie = new SerieGerenciador();
    private JogoGerenciador gerenciadorJogo = new JogoGerenciador();
    private EsporteGerenciador gerenciadorEsporte = new EsporteGerenciador();
    private CuriosidadeGerenciador gerenciadorCuriosidade = new CuriosidadeGerenciador();
    private UsuarioAcervo acervoCurtirMusica = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirFilme = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirSerie = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirJogo = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirEsporte = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirCuriosidade = new UsuarioAcervo();
    private MusicaAcervo acervoMusica = new MusicaAcervo();
    private FilmeAcervo acervoFilme = new FilmeAcervo();
    private SerieAcervo acervoSerie = new SerieAcervo();
    private JogoAcervo acervoJogo = new JogoAcervo();
    private EsporteAcervo acervoEsporte = new EsporteAcervo();
    private CuriosidadeAcervo acervoCuriosidade = new CuriosidadeAcervo();

//    Curtir música
    public Usuario curtirMusica(int idMusica, int idUsuario) {
//        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
//        usuarioAcervo.pesquisar(idUsuario);
//        Musica musicaCurtida = gerenciadorMusica.pesquisar(idMusica);
//        for (Musica musicaExistente : musicas) {
//            if (musicaCurtida.getNome().equals(musicaExistente.getNome())) {
//                System.out.println("Nome já existente. A música não foi cadastrada. ");
//                return null;
//            }
//        }
        System.out.println("idMusica: "+idMusica);
        System.out.println("idUsuario: "+idUsuario);
        return acervoCurtirMusica.curtirMusica(idMusica, idUsuario);
    }

    public Usuario descurtirMusica(int idMusica, int idUsuario) {
        return acervoCurtirMusica.descurtirMusica(idMusica,idUsuario);
    }

    public List<Musica> listarMusicasUsuarios(int id){
        return acervoMusica.listar();
    }

//    Curtir Filme
    public Usuario curtirFilme(int idFilme, int idUsuario) {
//        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
//        usuarioAcervo.pesquisar(idUsuario);
//        Filme filmeCurtido = gerenciadorFilme.pesquisar(idFilme);
//        for (Filme filmeExistente : filmes) {
//            if (filmeCurtido.getNome().equals(filmeExistente.getNome())) {
//                System.out.println("Nome já existente. O filme não foi cadastrado. ");
//                return null;
//            }
//        }
        return acervoCurtirFilme.curtirFilme(idFilme,idUsuario);
    }

    public Usuario descurtirFilme(int idFilme, int idUsuario) {
        return acervoCurtirFilme.descurtirFilme(idFilme,idUsuario);
    }

    public List<Filme> listarFilmesUsuarios(int id){
        return acervoFilme.listar();
    }

    public Usuario curtirSerie(int idSerie, int idUsuario) {
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.pesquisar(idUsuario);
        Serie serieCurtida = gerenciadorSerie.pesquisar(idSerie);
        for (Serie serieExistente : series) {
            if (serieCurtida.getNome().equals(serieExistente.getNome())) {
                System.out.println("Nome já existente. A série não foi cadastrada. ");
                return null;
            }
        }
        return acervoCurtirSerie.curtirSerie(idSerie,idUsuario);
    }

    public Usuario descurtirSerie(int idSerie, int idUsuario) {
        return acervoCurtirSerie.descurtirSerie(idSerie,idUsuario);
    }

    public List<Serie> listarSeriesUsuarios(int id){
        return acervoSerie.listar();
    }

    public Usuario curtirJogo(int idJogo, int idUsuario) {
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.pesquisar(idUsuario);
        Jogo jogoCurtida = gerenciadorJogo.pesquisar(idJogo);
        for (Jogo jogoExistente : jogos) {
            if (jogoCurtida.getNome().equals(jogoExistente.getNome())) {
                System.out.println("Nome já existente. O jogo não foi cadastrado. ");
                return null;
            }
        }
        return acervoCurtirJogo.curtirJogo(idJogo,idUsuario);
    }

    public Usuario descurtirJogo(int idJogo, int idUsuario) {
        return acervoCurtirJogo.descurtirJogo(idJogo,idUsuario);
    }

    public List<Jogo> listarJogosUsuarios(int id){
        return acervoJogo.listar();
    }

    public Usuario curtirEsporte(int idEsporte, int idUsuario) {
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.pesquisar(idUsuario);
        Esporte esporteCurtida = gerenciadorEsporte.pesquisar(idEsporte);
        for (Esporte esporteExistente : esportes) {
            if (esporteCurtida.getNome().equals(esporteExistente.getNome())) {
                System.out.println("Nome já existente. O Esporte não foi cadastrado. ");
                return null;
            }
        }
        return acervoCurtirEsporte.curtirEsporte(idEsporte,idUsuario);
    }

    public Usuario descurtirEsporte(int idEsporte, int idUsuario) {
        return acervoCurtirEsporte.descurtirEsporte(idEsporte,idUsuario);
    }

    public List<Esporte> listarEsportesUsuarios(int id){
        return acervoEsporte.listar();
    }

    public Usuario curtirCuriosidade(int idCuriosidade, int idUsuario) {
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.pesquisar(idUsuario);
        Curiosidade curiosidadeCurtida = gerenciadorCuriosidade.pesquisar(idCuriosidade);
        for (Curiosidade curiosidadeExistente : curiosidades) {
            if (curiosidadeCurtida.getDescricao().equals(curiosidadeExistente.getDescricao())) {
                System.out.println("Nome já existente. A curiosidade não foi cadastrada. ");
                return null;
            }
        }
        return acervoCurtirCuriosidade.curtirCuriosidade(idCuriosidade,idUsuario);
    }

    public Usuario descurtirCuriosidade(int idCuriosidade, int idUsuario) {
        return acervoCurtirCuriosidade.descurtirCuriosidade(idCuriosidade,idUsuario);
    }

    public List<Curiosidade> listarCuriosidadesUsuarios(int id){
        return acervoCuriosidade.listar();
    }


}
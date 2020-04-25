package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.*;
import ProjetoTinderEvolutionRest.dominio.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CurtirDescurtirGerenciador {

    private MusicaGerenciador gerenciadorMusica = new MusicaGerenciador();
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

    public Usuario curtirMusica(int idMusica, int idUsuario) {
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.pesquisar(idUsuario);
        Usuario usuario = new Usuario();
        Musica musicaCurtida = gerenciadorMusica.pesquisar(idMusica);
        System.out.println("musicaCurtida: "+musicaCurtida);
        for (int i = 0; i < usuario.getMusicasCurtidas().size(); i++) {
            System.out.println(usuario.getMusicasCurtidas().get(i));
            if (musicaCurtida.getNome().equals(usuario.getMusicasCurtidas().get(i))) {
                System.out.println("Nome já existente. A música não foi cadastrada. ");
                return null;
            }
        }
        System.out.println("idMusica: "+idMusica);
        System.out.println("idUsuario: "+idUsuario);
        return acervoCurtirMusica.curtirMusica(idMusica, idUsuario);
    }

    public Usuario descurtirMusica(int idMusica, int idUsuario) {
        return acervoCurtirMusica.descurtirMusica(idMusica,idUsuario);
    }

    public Usuario listarMusicasUsuarios(int id){
        return acervoCurtirMusica.listarMusicasCurtidas(id);
    }

    public Usuario curtirFilme(int idFilme, int idUsuario) {
        return acervoCurtirFilme.curtirFilme(idFilme,idUsuario);
    }

    public Usuario descurtirFilme(int idFilme, int idUsuario) {
        return acervoCurtirFilme.descurtirFilme(idFilme,idUsuario);
    }

    public List<Filme> listarFilmesUsuarios(int id){
        return acervoFilme.listar();
    }

    public Usuario curtirSerie(int idSerie, int idUsuario) {
        return acervoCurtirSerie.curtirSerie(idSerie,idUsuario);
    }

    public Usuario descurtirSerie(int idSerie, int idUsuario) {
        return acervoCurtirSerie.descurtirSerie(idSerie,idUsuario);
    }

    public List<Serie> listarSeriesUsuarios(int id){
        return acervoSerie.listar();
    }

    public Usuario curtirJogo(int idJogo, int idUsuario) {
        return acervoCurtirJogo.curtirJogo(idJogo,idUsuario);
    }

    public Usuario descurtirJogo(int idJogo, int idUsuario) {
        return acervoCurtirJogo.descurtirJogo(idJogo,idUsuario);
    }

    public List<Jogo> listarJogosUsuarios(int id){
        return acervoJogo.listar();
    }

    public Usuario curtirEsporte(int idEsporte, int idUsuario) {
        return acervoCurtirEsporte.curtirEsporte(idEsporte,idUsuario);
    }

    public Usuario descurtirEsporte(int idEsporte, int idUsuario) {
        return acervoCurtirEsporte.descurtirEsporte(idEsporte,idUsuario);
    }

    public List<Esporte> listarEsportesUsuarios(int id){
        return acervoEsporte.listar();
    }

    public Usuario curtirCuriosidade(int idCuriosidade, int idUsuario) {
        return acervoCurtirCuriosidade.curtirCuriosidade(idCuriosidade,idUsuario);
    }

    public Usuario descurtirCuriosidade(int idCuriosidade, int idUsuario) {
        return acervoCurtirCuriosidade.descurtirCuriosidade(idCuriosidade,idUsuario);
    }

    public List<Curiosidade> listarCuriosidadesUsuarios(int id){
        return acervoCuriosidade.listar();
    }


}
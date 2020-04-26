package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.*;
import ProjetoTinderEvolutionRest.dominio.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class CurtirDescurtirGerenciador {

    private MusicaGerenciador gerenciadorMusica = new MusicaGerenciador();
    private FilmeGerenciador gerenciadorFilme = new FilmeGerenciador();
    private SerieGerenciador gerenciadorSerie = new SerieGerenciador();
    private JogoGerenciador gerenciadorJogo = new JogoGerenciador();
    private EsporteGerenciador gerenciadorEsporte = new EsporteGerenciador();
    private CuriosidadeGerenciador gerenciadorCuriosidade = new CuriosidadeGerenciador();
    private UsuarioGerenciador gerenciadorUsuario = new UsuarioGerenciador();
    private UsuarioAcervo acervoCurtirMusica = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirFilme = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirSerie = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirJogo = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirEsporte = new UsuarioAcervo();
    private UsuarioAcervo acervoCurtirCuriosidade = new UsuarioAcervo();
    private FilmeAcervo acervoFilme = new FilmeAcervo();
    private SerieAcervo acervoSerie = new SerieAcervo();
    private JogoAcervo acervoJogo = new JogoAcervo();
    private EsporteAcervo acervoEsporte = new EsporteAcervo();
    private CuriosidadeAcervo acervoCuriosidade = new CuriosidadeAcervo();

    public Usuario curtirMusica(int idMusica, int idUsuario) {
        Usuario usuario = gerenciadorUsuario.pesquisar(idUsuario);
        Musica musicaCurtida = gerenciadorMusica.pesquisar(idMusica);
        for (int i = 0; i < usuario.getMusicasCurtidas().size(); i++) {
            if (musicaCurtida.getNome().equals(usuario.getMusicasCurtidas().get(i).getNome())) {
                System.out.println("A música "+musicaCurtida.getNome()+" já foi curtida pelo usuário "+usuario.getNome()+". Solicitação desconsiderada. ");
                return null;
            }
        }
        return acervoCurtirMusica.curtirMusica(idMusica, idUsuario);
    }

    public Usuario descurtirMusica(int idMusica, int idUsuario) {
        return acervoCurtirMusica.descurtirMusica(idMusica,idUsuario);
    }

    public Usuario listarMusicasUsuarios(int id){
        return acervoCurtirMusica.listarMusicasCurtidas(id);
    }

    public Usuario curtirFilme(int idFilme, int idUsuario) {
        Usuario usuario = gerenciadorUsuario.pesquisar(idUsuario);
        Filme filmeCurtido = gerenciadorFilme.pesquisar(idFilme);
        for (int i = 0; i < usuario.getFilmesCurtidos().size(); i++) {
            if (filmeCurtido.getNome().equals(usuario.getFilmesCurtidos().get(i).getNome())) {
                System.out.println("O filme "+filmeCurtido.getNome()+" já foi curtido pelo usuário "+usuario.getNome()+". Solicitação desconsiderada. ");
                return null;
            }
        }
        return acervoCurtirFilme.curtirFilme(idFilme,idUsuario);
    }

    public Usuario descurtirFilme(int idFilme, int idUsuario) {
        return acervoCurtirFilme.descurtirFilme(idFilme,idUsuario);
    }

    public List<Filme> listarFilmesUsuarios(int id){
        return acervoFilme.listar();
    }

    public Usuario curtirSerie(int idSerie, int idUsuario) {
        Usuario usuario = gerenciadorUsuario.pesquisar(idUsuario);
        Serie serieCurtida = gerenciadorSerie.pesquisar(idSerie);
        for (int i = 0; i < usuario.getSeriesCurtidas().size(); i++) {
            if (serieCurtida.getNome().equals(usuario.getSeriesCurtidas().get(i).getNome())) {
                System.out.println("A série "+serieCurtida.getNome()+" já foi curtida pelo usuário "+usuario.getNome()+". Solicitação desconsiderada. ");
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
        Usuario usuario = gerenciadorUsuario.pesquisar(idUsuario);
        Jogo jogoCurtido = gerenciadorJogo.pesquisar(idJogo);
        for (int i = 0; i < usuario.getJogosCurtidos().size(); i++) {
            if (jogoCurtido.getNome().equals(usuario.getJogosCurtidos().get(i).getNome())) {
                System.out.println("O jogo "+jogoCurtido.getNome()+" já foi curtido pelo usuário "+usuario.getNome()+". Solicitação desconsiderada. ");
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
        Usuario usuario = gerenciadorUsuario.pesquisar(idUsuario);
        Esporte esporteCurtido = gerenciadorEsporte.pesquisar(idEsporte);
        for (int i = 0; i < usuario.getEsportesCurtidos().size(); i++) {
            if (esporteCurtido.getNome().equals(usuario.getEsportesCurtidos().get(i).getNome())) {
                System.out.println("O esporte "+esporteCurtido.getNome()+" já foi curtido pelo usuário "+usuario.getNome()+". Solicitação desconsiderada. ");
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
        Usuario usuario = gerenciadorUsuario.pesquisar(idUsuario);
        Curiosidade curiosidadeCurtida = gerenciadorCuriosidade.pesquisar(idCuriosidade);
        for (int i = 0; i < usuario.getCuriosidadesCurtidas().size(); i++) {
            if (curiosidadeCurtida.getDescricao().equals(usuario.getCuriosidadesCurtidas().get(i).getDescricao())) {
                System.out.println("A curiosidade "+curiosidadeCurtida.getDescricao()+" já foi curtida pelo usuário "+usuario.getNome()+". Solicitação desconsiderada. ");
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
package ProjetoTinderEvolutionRest.acervo;

import ProjetoTinderEvolutionRest.dominio.*;
import ProjetoTinderEvolutionRest.gerenciador.*;

import java.util.ArrayList;
import java.util.List;

public class UsuarioAcervo {
    private static int contador = 1;
    public static final List<Usuario> usuarios = new ArrayList<>();
    private MusicaGerenciador gerenciadorMusica = new MusicaGerenciador();
    private FilmeGerenciador gerenciadorFilme = new FilmeGerenciador();
    private SerieGerenciador gerenciadorSerie = new SerieGerenciador();
    private JogoGerenciador gerenciadorJogo = new JogoGerenciador();
    private EsporteGerenciador gerenciadorEsporte = new EsporteGerenciador();
    private CuriosidadeGerenciador gerenciadorCuriosidade = new CuriosidadeGerenciador();

    public Usuario salvar(Usuario usuario) {
        usuario.setId(contador++);
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listar() {
       return usuarios;
    }

    public Usuario pesquisar(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Usuario usuarioParaDeletar = pesquisar(id);
        if (usuarioParaDeletar != null) {
            return usuarios.remove(usuarioParaDeletar);
        }
        return false;
    }

    public Usuario editar(final Usuario usuarioParaEditar, final Usuario usuarioAtualizado) {
        usuarioParaEditar.setNome(usuarioAtualizado.getNome());
        usuarioParaEditar.setEmail(usuarioAtualizado.getEmail());
        usuarioParaEditar.setTelefone(usuarioAtualizado.getTelefone());
        usuarioParaEditar.setDataDeNascimento(usuarioAtualizado.getDataDeNascimento());
        usuarioParaEditar.setBio(usuarioAtualizado.getBio());
        usuarioParaEditar.setLatitude(usuarioAtualizado.getLatitude());
        usuarioParaEditar.setLongitude(usuarioAtualizado.getLongitude());
        return usuarioParaEditar;
    }

    public Usuario curtirMusica(int idMusica, int idUsuario) {
        System.out.println("idMusica: "+idMusica);
        System.out.println("idUsuario: "+idUsuario);
        Usuario usuarioCurtirMusica = pesquisar(idUsuario);
        System.out.println("usuarioCurtirMusica: "+usuarioCurtirMusica);
        Musica musicaCurtida = gerenciadorMusica.pesquisar(idMusica);
        System.out.println("musicaCurtida: "+musicaCurtida);
        usuarioCurtirMusica.salvarMusica(musicaCurtida);
        System.out.println("usuarioCurtirMusica: "+usuarioCurtirMusica);
        return usuarioCurtirMusica;
    }

    public Usuario descurtirMusica(int idMusica, int idUsuario) {
        Usuario usuarioDesCurtirMusica = pesquisar(idUsuario);
        Musica musicaDesCurtida = gerenciadorMusica.pesquisar(idMusica);
        usuarioDesCurtirMusica.removerMusica(musicaDesCurtida);
        return usuarioDesCurtirMusica;
    }

    public Usuario curtirFilme(int idFilme, int idUsuario) {
        System.out.println("Usuario Acervo -- CurtirFilme");
        System.out.println("idFilme: "+idFilme);
        System.out.println("idUsuario: "+idUsuario);
        Usuario usuarioCurtirFilme = pesquisar(idUsuario);
        System.out.println("usuarioCurtirFilme: "+usuarioCurtirFilme);
        Filme filmeCurtido = gerenciadorFilme.pesquisar(idFilme);
        System.out.println("filmeCurtido: "+filmeCurtido);
        usuarioCurtirFilme.salvarFilme(filmeCurtido);
        return usuarioCurtirFilme;
    }

    public Usuario descurtirFilme(int idFilme, int idUsuario) {
        Usuario usuarioDesCurtirFilme = pesquisar(idUsuario);
        Filme filmeDesCurtido = gerenciadorFilme.pesquisar(idFilme);
        usuarioDesCurtirFilme.removerFilme(filmeDesCurtido);
        return usuarioDesCurtirFilme;
    }

    public Usuario likeUsuario(int idusuarioLiked, int idUsuarioCurtindo) {
//        System.out.println("idusuarioLiked = "+idusuarioLiked);
//        System.out.println("idUsuarioCurtindo = "+idUsuarioCurtindo);
        Usuario usuarioLikingUsuario = pesquisar(idUsuarioCurtindo);
//        System.out.println("usuarioLikingUsuario: "+usuarioLikingUsuario);
        Usuario usuarioLiked = pesquisar(idusuarioLiked);
//        System.out.println("usuarioLiked: "+usuarioLiked);
        usuarioLikingUsuario.salvarUsuario(usuarioLiked);
        return usuarioLiked;
    }

    public Usuario dislikeUsuario(int idusuarioDisliked, int idUsuarioDescurtindo) {
        System.out.println("idusuarioDisliked: "+idusuarioDisliked);
        Usuario usuarioDeslikingUsuario = pesquisar(idUsuarioDescurtindo);
        Usuario usuarioDisliked = pesquisar(idusuarioDisliked);
        usuarioDeslikingUsuario.removerUsuario(usuarioDisliked);
        return usuarioDisliked;
    }

    public Usuario curtirSerie(int idSerie, int idUsuario) {
        Usuario usuarioCurtirSerie = pesquisar(idUsuario);
        Serie serieCurtida = gerenciadorSerie.pesquisar(idSerie);
        usuarioCurtirSerie.salvarSerie(serieCurtida);
        return usuarioCurtirSerie;
    }

    public Usuario descurtirSerie(int idSerie, int idUsuario) {
        Usuario usuarioDesCurtirSerie = pesquisar(idUsuario);
        Serie serieDesCurtida = gerenciadorSerie.pesquisar(idSerie);
        usuarioDesCurtirSerie.removerSerie(serieDesCurtida);
        return usuarioDesCurtirSerie;
    }

    public Usuario curtirJogo(int idJogo, int idUsuario) {
        Usuario usuarioCurtirJogo = pesquisar(idUsuario);
        Jogo jogoCurtida = gerenciadorJogo.pesquisar(idJogo);
        usuarioCurtirJogo.salvarJogo(jogoCurtida);
        return usuarioCurtirJogo;
    }

    public Usuario descurtirJogo(int idJogo, int idUsuario) {
        Usuario usuarioDesCurtirJogo = pesquisar(idUsuario);
        Jogo jogoDesCurtida = gerenciadorJogo.pesquisar(idJogo);
        usuarioDesCurtirJogo.removerJogo(jogoDesCurtida);
        return usuarioDesCurtirJogo;
    }

    public Usuario curtirEsporte(int idEsporte, int idUsuario) {
        Usuario usuarioCurtirEsporte = pesquisar(idUsuario);
        Esporte esporteCurtida = gerenciadorEsporte.pesquisar(idEsporte);
        usuarioCurtirEsporte.salvarEsporte(esporteCurtida);
        return usuarioCurtirEsporte;
    }

    public Usuario descurtirEsporte(int idEsporte, int idUsuario) {
        Usuario usuarioDesCurtirEsporte = pesquisar(idUsuario);
        Esporte esporteDesCurtida = gerenciadorEsporte.pesquisar(idEsporte);
        usuarioDesCurtirEsporte.removerEsporte(esporteDesCurtida);
        return usuarioDesCurtirEsporte;
    }

    public Usuario curtirCuriosidade(int idCuriosidade, int idUsuario) {
        Usuario usuarioCurtirCuriosidade = pesquisar(idUsuario);
        Curiosidade curiosidadeCurtida = gerenciadorCuriosidade.pesquisar(idCuriosidade);
        usuarioCurtirCuriosidade.salvarCuriosidade(curiosidadeCurtida);
        return usuarioCurtirCuriosidade;
    }

    public Usuario descurtirCuriosidade(int idCuriosidade, int idUsuario) {
        Usuario usuarioDesCurtirCuriosidade = pesquisar(idUsuario);
        Curiosidade curiosidadeDesCurtida = gerenciadorCuriosidade.pesquisar(idCuriosidade);
        usuarioDesCurtirCuriosidade.removerCuriosidade(curiosidadeDesCurtida);
        return usuarioDesCurtirCuriosidade;
    }


}


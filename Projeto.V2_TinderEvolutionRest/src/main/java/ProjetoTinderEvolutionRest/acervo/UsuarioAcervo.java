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
    private Usuario gerenciadorUsuario = new Usuario();

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

    //Usuarios
    public Usuario likeUsuario(int idusuarioLiked, int idUsuarioCurtindo) {
        Usuario usuarioLikingUsuario = pesquisar(idUsuarioCurtindo);
        Usuario usuarioLiked = pesquisar(idusuarioLiked);
        usuarioLikingUsuario.salvarUsuarioLiked(usuarioLiked);
        salvarMatches(idusuarioLiked, idUsuarioCurtindo);
        return usuarioLiked;
    }

    public Usuario desfazerlikeUsuario(int idusuarioDisliked, int idUsuarioDescurtindo) {
        System.out.println("idusuarioDisliked: "+idusuarioDisliked);
        Usuario usuarioDeslikingUsuario = pesquisar(idUsuarioDescurtindo);
        Usuario usuarioDisliked = pesquisar(idusuarioDisliked);
        usuarioDeslikingUsuario.removerUsuarioLiked(usuarioDisliked);
        removerMatches(idusuarioDisliked,idUsuarioDescurtindo);
        return usuarioDisliked;
    }

    public List<Usuario> listarUsuariosLiked(int id){
        Usuario usuariosLiked = pesquisar(id);
        return usuariosLiked.listarUsuariosLiked(id,usuariosLiked.getNome());
    }

    public Usuario dislikeUsuario(int idusuarioDisliked, int idUsuarioLiking) {
        Usuario usuarioLikingUsuario = pesquisar(idUsuarioLiking);
        Usuario usuarioDisliked = pesquisar(idusuarioDisliked);
        usuarioLikingUsuario.salvarUsuarioDisliked(usuarioDisliked);
        return usuarioDisliked;
    }

    public Usuario desfazerDislikeUsuario(int idusuarioDisliked, int idUsuarioDescurtindo) {
        System.out.println("idusuarioDisliked: "+idusuarioDisliked);
        Usuario usuarioDeslikingUsuario = pesquisar(idUsuarioDescurtindo);
        Usuario usuarioDisliked = pesquisar(idusuarioDisliked);
        usuarioDeslikingUsuario.removerUsuarioDisliked(usuarioDisliked);
        return usuarioDisliked;
    }

    public List<Usuario> listarUsuariosDisliked(int id){
        Usuario usuariosDisliked = pesquisar(id);
        return usuariosDisliked.listarUsuariosDisliked(id,usuariosDisliked.getNome());
    }

    //Mathes
    public List<Usuario> listarMatches(int idUsuario){
        Usuario usuario = pesquisar(idUsuario);
        return usuario.listarMatch(usuario);
    }

    public void salvarMatches(int idusuarioLiked, int idUsuarioQueCurtiu) {
        Usuario usuarioLiked = pesquisar(idusuarioLiked);
        Usuario usuarioQueCurtiu = pesquisar(idUsuarioQueCurtiu);
        for (int i = 0; i < usuarioLiked.getUsuariosLiked().size(); i++) {
            if(usuarioLiked.getUsuariosLiked().get(i).getId()==idUsuarioQueCurtiu){
                System.out.println("Criou um match entre "+usuarioLiked.getNome()+" e "+usuarioQueCurtiu.getNome()+".");
                usuarioLiked.salvarMatch(usuarioQueCurtiu);
                usuarioQueCurtiu.salvarMatch(usuarioLiked);
            }
        }
    }

    public void removerMatches(int idusuarioDisliked, int idUsuarioQueDescurtiu) {
        Usuario usuarioDisliked = pesquisar(idusuarioDisliked);
        Usuario usuarioQueDescurtiu = pesquisar(idUsuarioQueDescurtiu);
        for (int i = 0; i < usuarioDisliked.getUsuariosLiked().size(); i++) {
            if(usuarioDisliked.getUsuariosLiked().get(i).getId()==idUsuarioQueDescurtiu){
                System.out.println("Removeu um match entre "+usuarioDisliked.getNome()+" e "+usuarioQueDescurtiu.getNome()+".");
                usuarioDisliked.removerMatch(usuarioQueDescurtiu);
                usuarioQueDescurtiu.removerMatch(usuarioDisliked);
            }
        }
    }


    //Musica
    public Usuario curtirMusica(int idMusica, int idUsuario) {
        Usuario usuarioCurtirMusica = pesquisar(idUsuario);
        Musica musicaCurtida = gerenciadorMusica.pesquisar(idMusica);
        usuarioCurtirMusica.salvarMusica(musicaCurtida);
        return usuarioCurtirMusica;
    }

    public Usuario descurtirMusica(int idMusica, int idUsuario) {
        Usuario usuarioDesCurtirMusica = pesquisar(idUsuario);
        Musica musicaDesCurtida = gerenciadorMusica.pesquisar(idMusica);
        usuarioDesCurtirMusica.removerMusica(musicaDesCurtida);
        return usuarioDesCurtirMusica;
    }

    public Usuario listarMusicasCurtidas(int idUsuario){
        return gerenciadorUsuario.listarMusicasCurtidas(idUsuario);
    }

    //Filme
    public Usuario curtirFilme(int idFilme, int idUsuario) {
        Usuario usuarioCurtirFilme = pesquisar(idUsuario);
        Filme filmeCurtido = gerenciadorFilme.pesquisar(idFilme);
        usuarioCurtirFilme.salvarFilme(filmeCurtido);
        return usuarioCurtirFilme;
    }

    public Usuario descurtirFilme(int idFilme, int idUsuario) {
        Usuario usuarioDesCurtirFilme = pesquisar(idUsuario);
        Filme filmeDesCurtido = gerenciadorFilme.pesquisar(idFilme);
        usuarioDesCurtirFilme.removerFilme(filmeDesCurtido);
        return usuarioDesCurtirFilme;
    }

    //Serie
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

    //Jogo
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

    //Esporte
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

    //Curiosidade
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


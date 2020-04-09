package ProjetoTinderEvolutionRest.acervo;

import ProjetoTinderEvolutionRest.dominio.Filme;
import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.FilmeGerenciador;
import ProjetoTinderEvolutionRest.gerenciador.MusicaGerenciador;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;

import java.util.ArrayList;
import java.util.List;

public class UsuarioAcervo {
    private static int contador = 1;
    public static final List<Usuario> usuarios = new ArrayList<>();
//    private UsuarioAcervo gerenciadorUsuarioAcervo = new UsuarioAcervo();/////////////////
    private MusicaGerenciador gerenciadorMusica = new MusicaGerenciador();
    private FilmeGerenciador gerenciadorFilme = new FilmeGerenciador();

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
        Usuario usuarioCurtirMusica = pesquisar(idUsuario);
        Musica musicaCurtida = gerenciadorMusica.pesquisar(idMusica);
        usuarioCurtirMusica.salvarMusica(musicaCurtida);
        System.out.println(usuarioCurtirMusica);
        return usuarioCurtirMusica;
    }

    public Usuario curtirFilme(int idFilme, int idUsuario) {
        Usuario usuarioCurtirFilme = pesquisar(idUsuario);
        Filme filmeCurtida = gerenciadorFilme.pesquisar(idFilme);
        usuarioCurtirFilme.salvarFilme(filmeCurtida);
        System.out.println(usuarioCurtirFilme);
        return usuarioCurtirFilme;
    }

//    public Usuario curtirUsuario(int idUsuario, int idUsuario) {
//        Usuario usuarioCurtirMusica = pesquisar(idUsuario);
//        Musica musicaCurtida = gerenciadorMusica.pesquisar(idMusica);
//        usuarioCurtirMusica.salvarMusica(musicaCurtida);
//        return usuarioCurtirMusica;
//    }


}


package gerenciador;

import Acervo.MusicaAcervo;
import Acervo.UsuarioAcervo;
import dominio.Musica;
import dominio.Usuario;

import java.time.LocalDate;
import java.util.List;

public class UsuarioGerenciador {

    private UsuarioAcervo acervo = new UsuarioAcervo();

    public Usuario salvar(Usuario usuario){
        System.out.println("vai rodar salvar usuario em Gerenciador");
        List<Usuario> usuarios = acervo.listar();
        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                System.out.println("E-mail já existente. O usuário não foi cadastrado. ");
                return usuarioExistente;
            }       }
        //if (usuario.getDataDeNascimento().isAfter(LocalDate.now())) {
        if (usuario.getDataDeNascimento().plusYears(18).isAfter(LocalDate.now())){
        System.out.println("Você tem menos de 18 anos. Seu usuário não foi cadastrado.");
            return null;        }
        return acervo.salvar(usuario);
    }

    public List<Usuario> listar() {
        return acervo.listar();
    }

    public Usuario pesquisar(int id) {
        if (id > 0) {
            return acervo.pesquisar(id);
        }
        return null;
    }

    public boolean deletar(int id) {
        if (id > 0) {
            return acervo.deletar(id);
        }
        return false;
    }

    public Usuario editar(int id, Usuario usuarioAtualizado) {

        Usuario usuarioParaEditar = pesquisar(id);

        if (usuarioParaEditar == null) {
            return null;
        } else {
            return acervo.editar(usuarioParaEditar, usuarioAtualizado);
        }
    }

}
//### Usuário
//- O e-mail não pode repetir
//- O usuário deve ter mais de 18 anos de idade
//- Todos os campos são obrigatórios

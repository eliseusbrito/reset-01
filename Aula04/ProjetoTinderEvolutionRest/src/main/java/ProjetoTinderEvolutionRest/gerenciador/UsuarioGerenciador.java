package ProjetoTinderEvolutionRest.gerenciador;

import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Usuario;

import java.time.LocalDate;
import java.util.List;

public class UsuarioGerenciador {

    private UsuarioAcervo acervo = new UsuarioAcervo();

    public Usuario salvar(Usuario usuario){
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
//        if (usuario.getNome().equals(null)||usuario.getEmail().equals(null)||usuario.getTelefone().equals(null)||usuario.getDataDeNascimento().equals(null)||usuario.getBio().equals(null)||usuario.getLatitude().equals(null)||usuario.getLatitude().equals(null)){
//            System.out.println("Algum campo não foi prenchido. O usuário não foi cadastrado.");
//            return null;        }
        if (usuario.getNome().equals("")||usuario.getEmail().equals("")||usuario.getTelefone().equals("")||usuario.getDataDeNascimento().equals("")||usuario.getBio().equals("")||usuario.getLatitude().equals("")||usuario.getLatitude().equals("")){
            System.out.println("Algum campo não foi prenchido. O usuário não foi cadastrado.");
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


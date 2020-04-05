package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.Usuario;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;

import java.util.List;

public class UsuarioMenu {

  private UsuarioGerenciador gerenciador;

  public UsuarioMenu() {
        this.gerenciador = new UsuarioGerenciador();
    }

    public void opcoes(){
        char opcao=' ';
        while (opcao != 'X') {
            opcao = MeuScannerCustomizado.nextChar("Digite a opção\n [C] - Cadastrar \n [L] - Listar\n [P] - Pesquisar\n [D] - Deletar\n [E] - Editar\n [X] - Sair\n > ");
            switch (opcao) {
                case 'C':
                    cadastrar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    pesquisar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'E':
                    editar();
                    break;
            }}
    }

  public Usuario cadastrar(){
            System.out.println("Cadastrar Usuário");
            InputUsuario inputUsuario = new InputUsuario();
            Usuario usuario = inputUsuario.entradaUsuario();
            return gerenciador.salvar(usuario);
        }

  public List<Usuario> listar(){
        System.out.println("\nListagem de Usuários...");
        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);       }
        return usuarios;
    }

  public void pesquisar(){
        int id = MeuScannerCustomizado.nextInt("\nPesquisa o Usuário...\n Qual o Id do Usuário? \n >");
        Usuario usuario = gerenciador.pesquisar(id);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println(usuario);
        }    }

  public void deletar() {
        System.out.println("\nExclusão do Usuário...");
        System.out.println("Qual usuário deseja deletar?");
        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }
        int id = MeuScannerCustomizado.nextInt(" >");
        if (gerenciador.deletar(id)) {
            System.out.println("Usuário deletado.");
        } else {
            System.out.println("Usuário não encontrado.");
        }     }

  public Usuario editar() {
        System.out.println("\nEdição de usuário...");
        System.out.println("Qual usuário deseja editar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }
        int id = MeuScannerCustomizado.nextInt(" >");

        System.out.println("Cadastrar Usuário");

        InputUsuario inputUsuario = new InputUsuario();
        Usuario atualizacao = inputUsuario.entradaUsuario();

        Usuario usuarioAtualizado = gerenciador.editar(id, atualizacao);

        if (usuarioAtualizado == null) {
            System.out.println("Usuário não encontrado");
        } else {
            System.out.println(usuarioAtualizado);
            }
        return usuarioAtualizado;
        }
}



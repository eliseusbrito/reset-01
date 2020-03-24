package console;

import dominio.Usuario;
import gerenciador.UsuarioGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UsuarioMenu {

  private UsuarioGerenciador gerenciador;

  public UsuarioMenu() {
        this.gerenciador = new UsuarioGerenciador();
    }

  public void opcoes(){

        char opcao=' ';
        while (opcao != 'X') {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a opção");
            System.out.println("[C] - Cadastrar \n[L] - Listar\n[P] - Pesquisar\n[D] - Deletar\n[E] - Editar\n[X] - Sair");
            opcao = sc.next().charAt(0);
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
                }
            }}

  public Usuario cadastrar(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Cadastrar Usuário");
            System.out.print("Digite o nome do Usuário> ");
            String nome = sc.next();
            System.out.print("Digite seu email> ");
            String email = sc.next();
            System.out.print("Digite o telefone> ");
            double telefone = sc.nextDouble();
            System.out.print("Digite o dia de Nascimento> ");
            int dia = sc.nextInt();
            System.out.print("Digite o mês de Nascimento> ");
            int mes = sc.nextInt();
            System.out.print("Digite o ano de Nascimento> ");
            int ano = sc.nextInt();
            System.out.println("Digite o CEP de onde você mora> ");
            String cep =sc.next();

            Usuario usuario = new Usuario(nome,email,telefone, LocalDate.of(ano, mes, dia),cep);
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa o Usuário...");
        System.out.println("Qual o Id do Usuário? ");
        System.out.print("> ");
        int id = scanner.nextInt();
        Usuario usuario = gerenciador.pesquisar(id);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println(usuario);
        }    }

  private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão do Usuário...");
        System.out.println("Qual usuário deseja deletar?");
        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }
        System.out.print("> ");
        int id = scanner.nextInt();
        if (gerenciador.deletar(id)) {
            System.out.println("Usuário deletado.");
        } else {
            System.out.println("Usuário não encontrado.");
        }     }

  public Usuario editar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEdição de usuário...");
        System.out.println("Qual usuário deseja editar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }
        System.out.print("> ");
        int id = sc.nextInt();
        System.out.print("Digite o nome do Usuário> ");
        String nome = sc.next();
        System.out.print("Digite seu email> ");
        String email = sc.next();
        System.out.print("Digite o telefone> ");
        double telefone = sc.nextDouble();
        System.out.print("Digite o dia de Nascimento> ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês de Nascimento> ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de Nascimento> ");
        int ano = sc.nextInt();
        System.out.println("Digite o CEP de onde você mora> ");
        String cep =sc.next();

        Usuario atualizacao = new Usuario(nome,email,telefone, LocalDate.of(ano, mes, dia),cep);

        Usuario usuarioAtualizado = gerenciador.editar(id, atualizacao);

        if (usuarioAtualizado == null) {
            System.out.println("Usuário não encontrado");
        } else {
            System.out.println(usuarioAtualizado);
            }
        return usuarioAtualizado;
        }
}



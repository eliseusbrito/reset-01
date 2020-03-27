package console;

import dominio.Jogo;
import gerenciador.JogoGerenciador;
import java.util.List;

public class JogoMenu {
    private JogoGerenciador gerenciador;

    public JogoMenu() {
        this.gerenciador = new JogoGerenciador();
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

    public Jogo cadastrar() {
        System.out.println("Cadastrar Jogo");
        InputJogo inputjogo = new InputJogo();
        Jogo jogo = inputjogo.entradaDados();
        return gerenciador.salvar(jogo);
    }

    public List<Jogo> listar() {
        System.out.println("\nListagem de Jogos...");
        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }
        return jogos;
    }


    public void pesquisar(){
        int id = MeuScannerCustomizado.nextInt("\nPesquisa de Jogos...\n Qual o código da jogo? \n >");
        Jogo jogo = gerenciador.pesquisar(id);
        if (jogo == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogo);
        }    }

    public void deletar() {
        System.out.println("\nExclusão de Jogo...");
        System.out.println("Qual jogo deseja deletar?");
        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }
        int id = MeuScannerCustomizado.nextInt("> ");
        if (gerenciador.deletar(id)) {
            System.out.println("Jogo deletado.");
        } else {
            System.out.println("Jogo não encontrado.");
        }     }

    public Jogo editar() {
        System.out.println("\nEdição de Jogo...");
        System.out.println("Qual jogo deseja editar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }
        int id = MeuScannerCustomizado.nextInt(" >");

        InputJogo inputJogo = new InputJogo();
        Jogo atualizacao = inputJogo.entradaDados();

        Jogo jogoAtualizado = gerenciador.editar(id, atualizacao);

        if (jogoAtualizado == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogoAtualizado);
        }

        return jogoAtualizado;
    }

}


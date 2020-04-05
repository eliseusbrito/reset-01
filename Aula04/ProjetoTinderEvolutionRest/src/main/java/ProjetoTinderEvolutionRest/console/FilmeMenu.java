package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.Filme;
import ProjetoTinderEvolutionRest.gerenciador.FilmeGerenciador;

import java.util.List;

public class FilmeMenu {

    private FilmeGerenciador gerenciador;

    public FilmeMenu() {
        this.gerenciador = new FilmeGerenciador();
    }

    public Filme cadastrar() {
        System.out.println("Cadastrar Filme");
        InputFilme inputFilme = new InputFilme();
        Filme filme = inputFilme.entradaDados();
        return gerenciador.salvar(filme);
    }

    public List<Filme> listar() {
        System.out.println("\nListagem de Filmes...");
        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        return filmes;
    }

    public void pesquisar() {
        int id = MeuScannerCustomizado.nextInt("\nPesquisa de Filmes...\n Qual o código do filme? \n >");
        Filme filme = gerenciador.pesquisar(id);
        if (filme == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filme);
        }
    }

    public void deletar() {
        System.out.println("\nExclusão de Filmes...");
        System.out.println("Qual filme deseja deletar?");
        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
        }
        int id = MeuScannerCustomizado.nextInt(" >");
        if (gerenciador.deletar(id)) {
            System.out.println("Filme deletado.");
        } else {
            System.out.println("Filme não encontrado.");
        }
    }

    public Filme editar() {
        System.out.println("\nEdição de Filme...");
        System.out.println("Qual filme deseja editar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
        }

        int id = MeuScannerCustomizado.nextInt(" >");

        InputFilme inputFilme = new InputFilme();
        Filme atualizacao = inputFilme.entradaDados();

        Filme filmeAtualizada = gerenciador.editar(id, atualizacao);

        if (filmeAtualizada == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filmeAtualizada);
        }

        return filmeAtualizada;

    }
}
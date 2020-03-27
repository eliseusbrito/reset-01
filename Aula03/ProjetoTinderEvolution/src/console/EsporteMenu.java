package console;

import dominio.Esporte;
import gerenciador.EsporteGerenciador;
import java.util.List;

public class EsporteMenu {
    private EsporteGerenciador gerenciador;

    public EsporteMenu() {
        this.gerenciador = new EsporteGerenciador();
    }

    public Esporte cadastrar(){
        String nome = MeuScannerCustomizado.nextLine("Cadastrar Esporte\n Digite o nome do Esporte> ");
        Esporte esporte = new Esporte(nome);
        return gerenciador.salvar(esporte);
    }

    public List<Esporte> listar(){
        System.out.println("\nListagem de Esporte...");
        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println(esporte);       }
        return esportes;    }

    public void pesquisar(){
        int id = MeuScannerCustomizado.nextInt("\nPesquisa de Esporte...\n Qual o código do esporte? \n > ");
        Esporte esporte = gerenciador.pesquisar(id);
        if (esporte == null) {
            System.out.println("Esporte não encontrado.");
        } else {
            System.out.println(esporte);
        }    }

    public void deletar() {
        System.out.println("\nExclusão de Esporte...");
        System.out.println("Qual esporte deseja deletar?");
        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[" + esporte.getId() + "] - " + esporte.getNome());
        }
        System.out.print("> ");
        int id = MeuScannerCustomizado.nextInt("> ");
        if (gerenciador.deletar(id)) {
            System.out.println("Esporte deletado.");
        } else {
            System.out.println("Esporte não encontrado.");
        }     }

    public Esporte editar() {
        System.out.println("\nEdição de Esporte...");
        System.out.println("Qual esporte deseja editar?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[" + esporte.getId() + "] - " + esporte.getNome());
        }

        int id = MeuScannerCustomizado.nextInt("> ");

        String nome = MeuScannerCustomizado.nextLine("Digite o nome da Esporte> ");

        Esporte atualizacao = new Esporte(nome);

        Esporte esporteAtualizada = gerenciador.editar(id, atualizacao);

        if (esporteAtualizada == null) {
            System.out.println("Esporte não encontrado.");
        } else {
            System.out.println(esporteAtualizada);
        }

        return esporteAtualizada;
    }

}


package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.Serie;
import ProjetoTinderEvolutionRest.gerenciador.SerieGerenciador;

import java.util.List;

public class SerieMenu {
    private SerieGerenciador gerenciador;

    public SerieMenu() {
        this.gerenciador = new SerieGerenciador();
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

    public Serie cadastrar(){
        System.out.println("Cadastrar Série");
        InputSerie inputSerie = new InputSerie();
        Serie serie = inputSerie.entradaDados();
        return gerenciador.salvar(serie);
    }

    public List<Serie> listar(){
        System.out.println("\nListagem de Série...");
        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println(serie);       }
        return series;    }

    public void pesquisar(){
        int id = MeuScannerCustomizado.nextInt("\nPesquisa de Série...\n Qual o código da série? \n >");
        Serie serie = gerenciador.pesquisar(id);
        if (serie == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serie);
        }    }

    public void deletar() {
        System.out.println("\nExclusão de Série...");
        System.out.println("Qual série deseja deletar?");
        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }
        int id = MeuScannerCustomizado.nextInt(" >");
        if (gerenciador.deletar(id)) {
            System.out.println("Série deletada.");
        } else {
            System.out.println("Série não encontrada.");
        }     }

    public Serie editar() {
        System.out.println("\nEdição de Série...");
        System.out.println("Qual série deseja editar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        int id = MeuScannerCustomizado.nextInt(" >");
        InputSerie inputSerie = new InputSerie();
        Serie atualizacao = inputSerie.entradaDados();

        Serie serieAtualizada = gerenciador.editar(id, atualizacao);

        if (serieAtualizada == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serieAtualizada);
        }

        return serieAtualizada;
    }
}

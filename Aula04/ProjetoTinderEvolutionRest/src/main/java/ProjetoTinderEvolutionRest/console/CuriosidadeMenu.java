package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.Curiosidade;
import ProjetoTinderEvolutionRest.gerenciador.CuriosidadeGerenciador;
import java.util.List;

public class CuriosidadeMenu {

    private CuriosidadeGerenciador gerenciador;

    static char opcaon2;

    public CuriosidadeMenu() {
        this.gerenciador = new CuriosidadeGerenciador();
    }

    public Curiosidade cadastrar(){
        System.out.println("Cadastrar Curiosidade");
        InputCuriosidade inputCuriosidade = new InputCuriosidade();
        Curiosidade curiosidade = inputCuriosidade.entradaDados();
        return gerenciador.salvar(curiosidade);
    }

    public List<Curiosidade> listar(){
        System.out.println("\nListagem de Curiosidade...");
        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);       }
        return curiosidades;    }

    public void pesquisar(){
        int id = MeuScannerCustomizado.nextInt("\nPesquisa de Curiosidade...\n Qual o código da curiosidade? \n >");
        Curiosidade curiosidade = gerenciador.pesquisar(id);
        if (curiosidade == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidade);
        }    }

    public void deletar() {
        System.out.println("\nExclusão de Curiosidade...");
        System.out.println("Qual curiosidade deseja deletar?");
        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }
        int id = MeuScannerCustomizado.nextInt(" >");
        if (gerenciador.deletar(id)) {
            System.out.println("Curiosidade deletada.");
        } else {
            System.out.println("Curiosidade não encontrada.");
        }     }

    public Curiosidade editar() {
        System.out.println("\nEdição de Curiosidade...");
        System.out.println("Qual curiosidade deseja editar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        int id = MeuScannerCustomizado.nextInt(" >");

        InputCuriosidade inputCuriosidade = new InputCuriosidade();
        Curiosidade atualizacao = inputCuriosidade.entradaDados();

        Curiosidade curiosidadeAtualizada = gerenciador.editar(id, atualizacao);

        if (curiosidadeAtualizada == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidadeAtualizada);
        }

        return curiosidadeAtualizada;
    }

}

package console;

import dominio.Musica;
import gerenciador.MusicaGerenciador;
import java.util.List;

public class MusicaMenu {

    private MusicaGerenciador gerenciador;

    public MusicaMenu() {
        this.gerenciador = new MusicaGerenciador();
    }


/*
    public void opcoes(){
        Opcoes opcoes = new Opcoes();
        opcoes.listarOpcoes('M');
    }
*/


    public Musica cadastrar(){
          InputMusica inputMusica = new InputMusica();
          Musica abacate = inputMusica.entradaPrincipal();
          return gerenciador.salvar(abacate);
        }

    public List<Musica> listar(){
       System.out.println("\nListagem de Música...");
       List<Musica> musicas = gerenciador.listar();
       for (Musica musica : musicas) {
           System.out.println(musica);       }
       return musicas;    }

    public void pesquisar(){
        int id = MeuScannerCustomizado.nextInt("\nPesquisa de Música...\n \"Qual o código da música?\n >");
        Musica musica = gerenciador.pesquisar(id);
        if (musica == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musica);
        }    }

    public void deletar() {
        System.out.println("\nExclusão de Música...");
        System.out.println("Qual música deseja deletar?");
        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println("[" + musica.getId() + "] - " + musica.getNome());
        }
        int id = MeuScannerCustomizado.nextInt(" >");
        if (gerenciador.deletar(id)) {
            System.out.println("Música deletada.");
        } else {
            System.out.println("Música não encontrada.");
        }     }

    public Musica editar() {
        System.out.println("\nEdição de Música...");
        System.out.println("Qual música deseja editar?");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println("[" + musica.getId() + "] - " + musica.getNome());
        }

        int id = MeuScannerCustomizado.nextInt(" >");

        InputMusica inputMusica = new InputMusica();
        Musica atualizacao = inputMusica.entradaPrincipal();

        Musica musicaAtualizada = gerenciador.editar(id, atualizacao);

        if (musicaAtualizada == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musicaAtualizada);
        }
        return musicaAtualizada;
    }


}




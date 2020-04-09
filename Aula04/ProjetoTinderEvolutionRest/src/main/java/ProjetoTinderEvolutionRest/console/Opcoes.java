package ProjetoTinderEvolutionRest.console;

public class Opcoes {

    public void listarOpcoes(char opcaon2){
        MusicaMenu musicaMenu = new MusicaMenu();
        CuriosidadeMenu curiosidadeMenu = new CuriosidadeMenu();
        EsporteMenu esporteMenu = new EsporteMenu();
        FilmeMenu filmeMenu = new FilmeMenu();
        JogoMenu jogoMenu = new JogoMenu();
        SerieMenu serieMenu = new SerieMenu();
        UsuarioMenu usuarioMenu = new UsuarioMenu();

        char opcao=' ';
        while (opcao != 'X') {
            opcao = MeuScannerCustomizado.nextChar("Digite a opção\n [C] - Cadastrar \n [L] - Listar\n [P] - Pesquisar\n [D] - Deletar\n [E] - Editar\n [X] - Sair\n > ");
            switch (opcao) {
                case 'C':
                    if(opcaon2=='M'){musicaMenu.cadastrar();}
                    if(opcaon2=='I'){curiosidadeMenu.cadastrar();}
                    if(opcaon2=='E'){esporteMenu.cadastrar();}
                    if(opcaon2=='F'){filmeMenu.cadastrar();}
                    if(opcaon2=='J'){jogoMenu.cadastrar();}
                    if(opcaon2=='S'){serieMenu.cadastrar();}
                    if(opcaon2=='U'){usuarioMenu.cadastrar();}
                    break;
                case 'L':
                    if(opcaon2=='M'){musicaMenu.listar();}
                    if(opcaon2=='I'){curiosidadeMenu.listar();}
                    if(opcaon2=='E'){esporteMenu.listar();}
                    if(opcaon2=='F'){filmeMenu.listar();}
                    if(opcaon2=='J'){jogoMenu.listar();}
                    if(opcaon2=='S'){serieMenu.listar();}
                    if(opcaon2=='U'){usuarioMenu.listar();}
                    break;
                case 'P':
                    if(opcaon2=='M'){musicaMenu.pesquisar();}
                    if(opcaon2=='I'){curiosidadeMenu.pesquisar();}
                    if(opcaon2=='E'){esporteMenu.pesquisar();}
                    if(opcaon2=='F'){filmeMenu.pesquisar();}
                    if(opcaon2=='J'){jogoMenu.pesquisar();}
                    if(opcaon2=='S'){serieMenu.pesquisar();}
                    if(opcaon2=='U'){usuarioMenu.pesquisar();}
                    break;
                case 'D':
                    if(opcaon2=='M'){musicaMenu.deletar();}
                    if(opcaon2=='I'){curiosidadeMenu.deletar();}
                    if(opcaon2=='E'){esporteMenu.deletar();}
                    if(opcaon2=='F'){filmeMenu.deletar();}
                    if(opcaon2=='J'){jogoMenu.deletar();}
                    if(opcaon2=='S'){serieMenu.deletar();}
                    if(opcaon2=='U'){usuarioMenu.deletar();}
                    break;
                case 'E':
                    if(opcaon2=='M'){musicaMenu.editar();}
                    if(opcaon2=='I'){curiosidadeMenu.editar();};
                    if(opcaon2=='E'){esporteMenu.editar();}
                    if(opcaon2=='F'){filmeMenu.editar();}
                    if(opcaon2=='J'){jogoMenu.editar();}
                    if(opcaon2=='S'){serieMenu.editar();}
                    if(opcaon2=='U'){usuarioMenu.editar();}
                    break;
            }
        }
    }
}

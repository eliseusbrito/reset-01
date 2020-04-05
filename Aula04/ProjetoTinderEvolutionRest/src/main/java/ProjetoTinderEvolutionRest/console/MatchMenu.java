package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.dominio.Match;
import ProjetoTinderEvolutionRest.gerenciador.MatchGerenciador;
import ProjetoTinderEvolutionRest.acervo.MatchAcervo;

import java.util.ArrayList;
import java.util.List;

import static ProjetoTinderEvolutionRest.acervo.MatchAcervo.avalUsuarios;
import static ProjetoTinderEvolutionRest.acervo.UsuarioAcervo.usuarios;

public class MatchMenu {

    private MatchGerenciador gerenciador = new MatchGerenciador();
    private UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
    boolean avalUsuario;
    List<String> listaTeste =  new ArrayList<>();

    public void entradaDados(){
    char opcao=' ';
    while (opcao != 'X') {
        opcao = MeuScannerCustomizado.nextChar("Digite a opção\n [A] - Avaliar com Like ou Dislike\n [M] - Listar Matches\n [U] - Usuario Comum\n [X] - Sair\n > ");
        switch (opcao) {
            case 'A':
                salvar();
                break;
            case 'M':
                matches();
                break;
            case 'U':
               //usuariosComuns();
                matchesTodos();
                break;
            case 'X':
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }}

    public Match salvar() {
            UsuarioMenu usuarioMenu = new UsuarioMenu();
            usuarioMenu.listar();

            int usuarioD = MeuScannerCustomizado.nextInt("Qual é seu usuário : \n  > ");
            char opcaoLD=MeuScannerCustomizado.nextChar("Você gostaria de dar [L] Like ou [D] Dislike?");

            int usuarioR = MeuScannerCustomizado.nextInt("para quem? \n  > ");


            if(opcaoLD=='L'){avalUsuario = true;}
            if(opcaoLD=='D'){avalUsuario = false;}
            Match match = new Match(usuarioD, usuarioR, avalUsuario);
            System.out.println(match);
            System.out.println("criou objeto curtidaUsuario");
            return gerenciador.salvar(match);

        }

    public void matches() {
        System.out.println("Lista Usuários");
        for (int l = 0; l < usuarios.size(); l++) {
            System.out.println(usuarios.get(l));
        }
        int idUsuEsc = MeuScannerCustomizado.nextInt("Digite qual usuario vc quer saber se tem matches: \n > ");
        for (String x : listaTeste) {
            System.out.println(x);

            //        System.out.println("Listagem de Matches do usuário "+usuarios.get(idUsuEsc-1).getNome()+" :");
//        int a = avalUsuarios.get(idUsuEsc-1).getIdUsuarioD();
//        String aa = Integer.toString(a);
//        int b = avalUsuarios.get(idUsuEsc-1).getIdUsuarioR();
//        String bb = Integer.toString(b);
//        String cc = aa + bb;
//        int c = Integer.parseInt(cc);
//        System.out.println("c = "+c);
//        for (int y = 0; y < avalUsuarios.size(); y++) {
//            System.out.println("y = "+y);
//            int d = avalUsuarios.get(y).getIdUsuarioR();
//            String dd = Integer.toString(d);
//            int e = avalUsuarios.get(y).getIdUsuarioD();
//            String ee = Integer.toString(e);
//            String ff = dd + ee;
//            int f = Integer.parseInt(ff);
//            if (c == f) {
//                if (avalUsuarios.get(idUsuEsc).isAvalUsuario() == true) {
//                    if (avalUsuarios.get(y).isAvalUsuario() == true) {
//                        System.out.print("Match entre " + usuarios.get(avalUsuarios.get(idUsuEsc).getIdUsuarioD() - 1).getNome());
//                        System.out.println(" e " + usuarios.get(avalUsuarios.get(y).getIdUsuarioD() - 1).getNome());
//                    }}}}
        }

//    public void usuariosComuns(){
//
//
   }

        public void matchesTodos(){
            System.out.println("Lista de Todos Matches");
            for (int i = 0; i < avalUsuarios.size(); i++) {
                //System.out.println(avalUsuarios.get(i));
                int a = avalUsuarios.get(i).getIdUsuarioD();
                String aa = Integer.toString(a);
                int b = avalUsuarios.get(i).getIdUsuarioR();
                String bb = Integer.toString(b);
                String cc = aa + bb;
                int c = Integer.parseInt(cc);
                for (int y = 0; y < avalUsuarios.size(); y++) {
                    //System.out.println("y = "+y);
                    int d = avalUsuarios.get(y).getIdUsuarioR();
                    String dd = Integer.toString(d);
                    int e = avalUsuarios.get(y).getIdUsuarioD();
                    String ee = Integer.toString(e);
                    String ff = dd + ee;
                    int f = Integer.parseInt(ff);
                    if (c == f) {
                        if (avalUsuarios.get(i).isAvalUsuario() == true) {
                            if (avalUsuarios.get(y).isAvalUsuario() == true) {

                                listaTeste.add(usuarios.get(avalUsuarios.get(i).getIdUsuarioD() - 1).getNome() + "&" + usuarios.get(avalUsuarios.get(y).getIdUsuarioD() - 1).getNome());
                                System.out.print("Match entre " + usuarios.get(avalUsuarios.get(i).getIdUsuarioD() - 1).getNome());
                                System.out.println(" e " + usuarios.get(avalUsuarios.get(y).getIdUsuarioD() - 1).getNome());
                            }
                        }
                    }
                }
            }
            for (String x : listaTeste) {
                System.out.println(x);
            }


        }


    }


//### Match
//        - Permitir que um usuário dê "like" em outro usuário
//        - Permitir que um usuário dê "dislike" em outro usuário
//        - Quando dois usuários derem "like" entre si, deverá ser criado um match
//        - Listar os matches de um determinado usuário (usuários que deram match entre si)
//        - Obter o usuário com mais características em comum que já não tenha um match ou dislike
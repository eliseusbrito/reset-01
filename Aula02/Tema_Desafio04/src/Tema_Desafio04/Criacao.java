package Tema_Desafio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static Tema_Desafio04.Application.tipoimpr;

public class Criacao {
    int qf;//quantidade de Fé
    int qm;//quantidade de Mana
    int n=0;
    static int opcaoMenu = 0;
    private List<Guerreiro>listaGuerreiros;//6.ii -Não deve ser possível alterar o nome, ataque e defesa dos personagens
    private List<Barbaro>listaBarbaros;
    private List<Druida>listaDruidas;
    private List<Mago>listaMagos;
    private List<Clerigo>listaClerigos;
    private List<Feiticeiro>listaFeiticeiros;
    Arma machado = new Arma("Machado", 10);
    Arma bolaDeFogo = new Arma("Bola de fogo", 5);
    Magia raio = new Magia("Raio", 10, 5);
    Magia fire = new Magia("Fire", 10, 10);
    PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual", 10, 5);
    PoderDivino cajado = new PoderDivino("Cajado", 10, 7);

    public List<Guerreiro> getListaGuerreiros() {
        return listaGuerreiros;
    }

    public List<Barbaro> getListaBarbaros() {
        return listaBarbaros;
    }

    public List<Druida> getListaDruidas() {
        return listaDruidas;
    }

    public List<Mago> getListaMagos() {
        return listaMagos;
    }

    public List<Clerigo> getListaClerigos() {
        return listaClerigos;
    }

    public List<Feiticeiro> getListaFeiticeiros() {
        return listaFeiticeiros;
    }

    public void Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------------------------------\n\t\t\tSIMULADOR DE COMBATE RPG\n\n\t\t\t\t\t\t Tema02_ Desafio04: Eliseu Brito - Programa RESET CWI\n------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Digite 1 para listar personagens já criados");
        System.out.println("Digite 2 para criar novos personagens");
        System.out.println("Digite 3 para equipar Armas ");
        System.out.println("Digite 4 para atacar");
        System.out.println("Digite 5 para configurar relatorio");
        System.out.println();
        opcaoMenu = sc.nextInt();
        switch (opcaoMenu) {
            case 1:
                listarPersonagens();
                Menu();
                break;
            case 2:
                criarPersonagem();
                Menu();
                break;
            case 3:
                equiparArmas();
                Menu();
                break;
            case 4:  //"Digite 4 para atacar
                break;
            case 5://"Digite 5 para configurar relatorio"
                definirRelario();
                break;
            default:
                System.out.println("rodou default");
        }
    }

    public void criarListas(){
        listaGuerreiros = new ArrayList<>();
        listaBarbaros = new ArrayList<>();
        listaDruidas = new ArrayList<>();
        listaMagos = new ArrayList<>();
        listaClerigos = new ArrayList<>();
        listaFeiticeiros = new ArrayList<>();
    }

    public void criarPersonagem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos personagens deseja criar? ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //System.out.println(i);
            System.out.println("Digite o tipo de personagem: \nG - GUERREIRO, B - BARBARO, D - DRUIDA,\nC - CLERIGO, M - MAGO ou F - FEITICEIRO;");
            char tp = sc.next().charAt(0);
            System.out.print("Digite o nome do personagem: ");
            String no = sc.next();
            System.out.print("Digite quantas vidas ele terá: ");
            int v = sc.nextInt();
            System.out.print("Digite o poder de ataque: ");
            double a = sc.nextDouble();
            System.out.print("Digite a defesa: ");
            double d = sc.nextDouble();
            if(tp=='D'){System.out.print("Digite qual a quantidade de fé: ");
                qf = sc.nextInt();}
            if(tp=='C'){System.out.print("Digite qual a quantidade de fé: ");
                qf = sc.nextInt();}
            if(tp=='F'){System.out.print("Digite qual a quantidade de mana: ");
                qm = sc.nextInt();}
            if(tp=='M'){System.out.print("Digite qual a quantidade de mana: ");
                qm = sc.nextInt();}

            if (tp == 'G' || tp == 'B') {
                System.out.print("Digite qual a arma que ele utilizará ");
                System.out.println("Digite 1-Machado  2-Bola de Fogo");
                int opcaoArma = sc.nextInt();

                String guerreiro = "Guerreiro" + n;
                if (tp == 'G' && opcaoArma == 1) {
                    listaGuerreiros.add(new Guerreiro(no, v, a, d, machado));
                }
                if (tp == 'G' && opcaoArma == 2) {
                    listaGuerreiros.add(new Guerreiro(no, v, a, d, bolaDeFogo)); }

                String barbaro = "Barbaro" + n;
                if (tp == 'B' && opcaoArma == 1) {
                    listaBarbaros.add(new Barbaro(no, v, a, d, machado));  }
                if (tp == 'B' && opcaoArma == 2) {
                    listaBarbaros.add(new Barbaro(no, v, a, d, bolaDeFogo));  }}

            String druida = "Druida"+n;
            if (tp == 'D') {
                listaDruidas.add(new Druida(no, v, a, d,qf));
                System.out.println("Druidas estão equipados com Arma Espiritual");}
            String clerigo = "Clerigo"+n;
            if (tp == 'C') {
                listaClerigos.add(new Clerigo(no, v, a, d,qf));
                System.out.println("Clerigos estão equipados com Cajado");}
            String mago = "Mago"+n;
            if (tp == 'M') {
                listaMagos.add(new Mago (no, v, a, d,qm));
                System.out.println("Magos estão equipados com Raio");}
            String feiticeiros = "Feiticeiro"+n;
            if (tp == 'F') {
                listaFeiticeiros.add(new Feiticeiro (no, v, a, d,qm));
                System.out.println("Feiticeiros estão equipados com Fire");}
            }
        impGuerreiros();
        impBarbaros();
        impDruidas();
        impMagos();
        impFeiticeiros();
        impClerigos();
    }

    public void impGuerreiros(){
        if(listaGuerreiros.size()>0){
            System.out.println("Guerreiros:");
            for (Guerreiro guerreiro : listaGuerreiros) {
                System.out.println("    Nome:" + guerreiro.nome + " Vida:" + guerreiro.vida+" Ataque:" + guerreiro.ataque + " Defesa:" + guerreiro.defesa + "  Arma:"+ guerreiro.arma.getNome());
            }}}
    public void impGuerreirosVivos(){
        if(listaGuerreiros.size()>0){
            System.out.println("Guerreiros Vivos:");
            for (int i = 0; i < listaGuerreiros.size(); i++) {
                if(listaGuerreiros.get(i).getVida()>0){
                    System.out.print("  "+(i+1)+" -  "+listaGuerreiros.get(i).getNome()+"     \n");}else{
                    System.out.print("  Todos mortos\n");}}}}


    public void impBarbaros(){
        if(listaBarbaros.size()>0){
            System.out.println("Barbaros:");
            for (Barbaro barbaro : listaBarbaros) {
                System.out.println("    Nome:" + barbaro.nome + " Vida:" + barbaro.vida+" Ataque:" + barbaro.ataque + " Defesa:" + barbaro.defesa+ "  Arma:"+ barbaro.arma.getNome());
            }}}

    public void impBarbarosVivos(){
        if(listaBarbaros.size()>0){
            System.out.println("Barbaros Vivos:");
            for (int i = 0; i < listaBarbaros.size(); i++) {
                if(listaBarbaros.get(i).getVida()>0){
                    System.out.print("  "+(i+1)+" -  "+listaBarbaros.get(i).getNome()+"     \n");}else{
                    System.out.print("  Todos mortos\n");}}}}

    public void impDruidas(){
        if(listaDruidas.size()>0){
            System.out.println("Druidas:");
            for (Druida druida : listaDruidas) {
                System.out.println("    Nome:" + druida.nome + " Vida:" + druida.vida+" Ataque:" + druida.ataque + " Defesa:" + druida.defesa+ " Fé:"+druida.fe);
            }}}
    public void impDruidasVivos(){
        if(listaDruidas.size()>0){
            System.out.println("Druidas Vivos:");
            for (int i = 0; i < listaDruidas.size(); i++) {
                if(listaDruidas.get(i).getVida()>0){
                    System.out.print("  "+(i+1)+" -  "+listaDruidas.get(i).getNome()+"     \n");}else{
                    System.out.print("  Todos mortos\n");}}}}


    public void impMagos(){
        if(listaMagos.size()>0){
            System.out.println("Magos:");
            for (Mago mago : listaMagos) {
                System.out.println("    Nome:" + mago.nome + " Vida:" + mago.vida+" Ataque:" + mago.ataque + " Defesa:" + mago.defesa+ " Mana:"+mago.mana);
            }}}

    public void impMagosVivos(){
        if(listaMagos.size()>0){
            System.out.println("Magos Vivos:");
            for (int i = 0; i < listaMagos.size(); i++) {
                if(listaMagos.get(i).getVida()>0){
                    System.out.print("  "+(i+1)+" -  "+listaMagos.get(i).getNome()+"     \n");}else{
                    System.out.print("  Todos mortos\n");}}}}

    public void impFeiticeiros(){
        if(listaFeiticeiros.size()>0){
            System.out.println("Feiticeiros:");
            for (Feiticeiro feiticeiro : listaFeiticeiros) {
                System.out.println("    Nome:" + feiticeiro.nome + " Vida:" + feiticeiro.vida+" Ataque:" + feiticeiro.ataque + " Defesa:" + feiticeiro.defesa+" Mana:"+feiticeiro.mana);
            }}}

    public void impFeiticeirosVivos(){
        if(listaFeiticeiros.size()>0){
            System.out.println("Feiticeiros Vivos:");
            for (int i = 0; i < listaFeiticeiros.size(); i++) {
                if(listaFeiticeiros.get(i).getVida()>0){
                    System.out.print("  "+(i+1)+" -  "+listaFeiticeiros.get(i).getNome()+"     \n");}else{
                    System.out.print("  Todos mortos\n");}}}}


    public void impClerigos(){
        if(listaClerigos.size()>0){
            System.out.println("Clerigos:");
            for (Clerigo clerigo : listaClerigos) {
                System.out.println("    Nome:" + clerigo.nome + " Vida:" + clerigo.vida+" Ataque:" + clerigo.ataque + " Defesa:" + clerigo.defesa+ " Fé:"+clerigo.fe);
            }}}

    public void impClerigosVivos(){
        if(listaClerigos.size()>0){
            System.out.println("Clerigos Vivos:");
            for (int i = 0; i < listaClerigos.size(); i++) {
                if(listaClerigos.get(i).getVida()>0){
                    System.out.print("  "+(i+1)+" -  "+listaClerigos.get(i).getNome()+"     \n");}else{
                    System.out.print("  Todos mortos\n");}}}}



    public void criarRapido(){

        listaGuerreiros.add(new Guerreiro("Ramza", 100, 5, 5, machado));
        listaBarbaros.add(new Barbaro("Ragnar", 100, 6, 5, bolaDeFogo));
        listaMagos.add(new Mago("Niele", 100, 7, 5, 50, raio));
        listaFeiticeiros.add(new Feiticeiro("Sorcerer", 100, 8, 5, 50, fire));
        listaDruidas.add(new Druida("Beatrice", 100, 9, 5, 50,armaEspiritual));
        listaClerigos.add(new Clerigo("Goldmoon", 100, 9, 5, 50,armaEspiritual));
    }

    public void listarPersonagens(){
        impGuerreiros();
        impBarbaros();
        impDruidas();
        impMagos();
        impFeiticeiros();
        impClerigos();
    }
    public void listarPersonagensVivos(){
        impGuerreirosVivos();
        impBarbarosVivos();
        impDruidasVivos();
        impMagosVivos();
        impFeiticeirosVivos();
        impClerigosVivos();
    }


    public void equiparArmas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Você pode equipar seu Homem de Armas");
        impGuerreiros();
        impBarbaros();
        System.out.println("Escolha G - GUERREIRO ou B - BARBARO");
        char tp = sc.next().charAt(0);
        System.out.println("Digite o nome do personagem a equipar");
        String nomeEscolhidoEquipar = sc.next();
        System.out.print("Digite qual a arma que ele utilizará ");
        System.out.println("Digite 1-Machado  2-Bola de Fogo");
        int opcaoArma = sc.nextInt();
        if (tp=='G' && opcaoArma==1){
            for(Guerreiro guerreiro : listaGuerreiros){
                if(guerreiro.getNome().equals(nomeEscolhidoEquipar)){
                    guerreiro.setArma(machado);}}
            impGuerreiros();
        }
        if (tp=='G' && opcaoArma==2){
            for(Guerreiro guerreiro : listaGuerreiros){
                if(guerreiro.getNome().equals(nomeEscolhidoEquipar)){
                    guerreiro.setArma(bolaDeFogo);}}
            impGuerreiros();
        }
        if (tp=='B' && opcaoArma==1){
            for(Barbaro barbaro : listaBarbaros){
                if(barbaro.getNome().equals(nomeEscolhidoEquipar)){
                    barbaro.setArma(machado);}}
            impBarbaros();
        }
        if (tp=='B' && opcaoArma==2){
            for(Barbaro barbaro : listaBarbaros){
                if(barbaro.getNome().equals(nomeEscolhidoEquipar)){
                    barbaro.setArma(bolaDeFogo);}}
            impBarbaros();
        }
    }

    public void definirRelario(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 1 para relatório padrão e 2 para detalhado: ");
        tipoimpr = sc.nextInt();

        }
}












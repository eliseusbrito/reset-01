package Tema_Desafio02;
import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.text.StyleContext;
import java.util.Scanner;

import static Tema_Desafio02.HomemDeArma.equiparArmas;

public class Application {

    static Criacao ca = new Criacao();//ca --> criacao app
    //static public HomemDeArma homemDeArma = new HomemDeArma();
    static public int tipoimpr;//tipo de impressao
    public static void main(String[] args) {
        int r = 0;//numero da rodada
        int opcaoArma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------------------------------\n\t\t\tSIMULADOR DE COMBATE RPG\n\n\t\t\t\t\t\tCódigo Tema02_ Desafio02: Eliseu Brito - Programa RESET CWI\n------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Digite 1 para relatório padrão e 2 para detalhado: ");
        tipoimpr = sc.nextInt();
        ca.criarPersonagem();
        //Armas, Poderes e Magias
        Arma machado = new Arma("Machado", 10);
        Arma bolaDeFogo = new Arma("Bola de fogo", 5);
        Magia raio = new Magia("Raio", 10, 5);
        Magia fire = new Magia("Fire", 10, 10);
        PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual", 10, 5);
        PoderDivino cajado = new PoderDivino("Cajado", 10, 7);

        //Personagem guerreiro = new Guerreiro("Ramza", 3, 5, 5);

        equiparArmas(machado);

        //Ataques
        boolean continuar = true;
        char opcao;
        while (continuar) {
            r = r + 1;
            System.out.println("Rodada " + r);
            System.out.println("Escolha o ATACANTE: G - GUERREIRO, B - BARBARO, D - DRUIDA, C - CLERIGO, M - MAGO ou F - FEITICEIRO");
            String cpl = sc.next();//cpl = classe primeiro lutador
            System.out.println("Agora escolha o número do Personagem atacante: 1 - 2 - 3 ...");
            int ppl = sc.nextInt();//ppl = personagem primeiro lutador
            ppl = ppl - 1;

           /* if(cpl.equals("G") || cpl.equals("B")){
            System.out.println("Qual arma vc gostaria de usar para o HOMEM DE ARMAS");
            System.out.println("Digite 1-Machado  2-Bola de Fogo");
            opcaoArma = sc.nextInt();
            //if (opcaoArma == "1"){ }
            //if (opcaoArma == "2"){ artemp = bolaDeFogo;}

            //ca.impBarbaros();
            //ca.impGuerreiros();
            }*/

          /*  Homens de Armas poderão equipar uma arma em algum momento
            Eles não precisam mais especificar a arma ao atacar, e passam a usar a arma equipada
            Somente uma arma pode ser equipada por vez*/

            System.out.println("Escolha o ALVO: G - GUERREIRO, B - BARBARO, D - DRUIDA, C - CLERIGO, M - MAGO ou F - FEITICEIRO");
            String csl = sc.next();//csl = classe segundo lutador
            System.out.println("e por fim o número do Personagem Alvo: 1 - 2 - 3 ...");
            int psl = sc.nextInt();//ppl = personagem segundo lutador
            psl = psl - 1;
            String cc = cpl + csl;



            if (cc.equals("GB")) {
                ca.getListaGuerreiros().get(ppl).equiparArmas(machado);
                ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaBarbaros().get(psl));
            if (cc.equals("GD")) {
                ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaDruidas().get(psl));
            if (cc.equals("GC")) {
                ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaClerigos().get(psl));
            if (cc.equals("GM")) {
                ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaMagos().get(psl));
            if (cc.equals("GF")) {
                ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaFeiticeiros().get(psl));
            if (cc.equals("GG")) {
                ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaGuerreiros().get(psl));


            if (cc.equals("BG")) {
                ca.getListaBarbaros().get(ppl).atacarArmas(ca.getListaGuerreiros().get(psl));}
            if (cc.equals("BD")) {
                ca.getListaBarbaros().get(ppl).atacarArmas(ca.getListaDruidas().get(psl));}
            if (cc.equals("BC")) {
                ca.getListaBarbaros().get(ppl).atacarArmas(ca.getListaClerigos().get(psl));}
            if (cc.equals("BM")) {
                ca.getListaBarbaros().get(ppl).atacarArmas(ca.getListaMagos().get(psl));}
            if (cc.equals("BF")) {
                ca.getListaBarbaros().get(ppl).atacarArmas(ca.getListaFeiticeiros().get(psl));}
            if (cc.equals("BB")) {
                ca.getListaBarbaros().get(ppl).atacarArmas(ca.getListaBarbaros().get(psl));}

            if (cc.equals("DG")) {
                ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaGuerreiros().get(psl), armaEspiritual); }
            if (cc.equals("DB")) {
                ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaBarbaros().get(psl), armaEspiritual); }
            if (cc.equals("DC")) {
                ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaClerigos().get(psl), armaEspiritual); }
            if (cc.equals("DM")) {
                ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaMagos().get(psl), armaEspiritual); }
            if (cc.equals("DF")) {
                ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaFeiticeiros().get(psl), armaEspiritual); }
            if (cc.equals("DD")) {
                ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaDruidas().get(psl), armaEspiritual); }

            if (cc.equals("CG")) {
                ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaGuerreiros().get(psl), cajado); }
            if (cc.equals("CB")) {
                ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaBarbaros().get(psl), cajado); }
            if (cc.equals("CD")) {
                ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaDruidas().get(psl), cajado); }
            if (cc.equals("CM")) {
                ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaMagos().get(psl), cajado); }
            if (cc.equals("CF")) {
                ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaFeiticeiros().get(psl), cajado); }
            if (cc.equals("CC")) {
                ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaClerigos().get(psl), cajado); }

            if (cc.equals("MG")) {
                ca.getListaMagos().get(ppl).atacarMagias(ca.getListaGuerreiros().get(psl), raio); }
            if (cc.equals("MB")) {
                ca.getListaMagos().get(ppl).atacarMagias(ca.getListaBarbaros().get(psl), raio); }
            if (cc.equals("MD")) {
                ca.getListaMagos().get(ppl).atacarMagias(ca.getListaDruidas().get(psl), raio); }
            if (cc.equals("MC")) {
                ca.getListaMagos().get(ppl).atacarMagias(ca.getListaClerigos().get(psl), raio); }
            if (cc.equals("MF")) {
                ca.getListaMagos().get(ppl).atacarMagias(ca.getListaFeiticeiros().get(psl), raio); }
            if (cc.equals("MM")) {
                ca.getListaMagos().get(ppl).atacarMagias(ca.getListaMagos().get(psl), raio); }

            if (cc.equals("FG")) {
                ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaGuerreiros().get(psl), fire); }
            if (cc.equals("FB")) {
                ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaBarbaros().get(psl), fire); }
            if (cc.equals("FD")) {
                ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaDruidas().get(psl), fire); }
            if (cc.equals("FC")) {
                ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaClerigos().get(psl), fire); }
            if (cc.equals("FM")) {
                ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaMagos().get(psl), fire); }
            if (cc.equals("FF")) {
                ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaFeiticeiros().get(psl), fire); }

            System.out.println("Voce quer mais um ataque?  S - Sim   N - Não");
            opcao = sc.next().charAt(0);
            if (opcao == 'N') {
                continuar = false;
            }
        }
        System.out.println("");
        System.out.println("SITUAÇÃO FINAL COMBATE");
        for (Guerreiro guerreiro : ca.getListaGuerreiros()) {
            System.out.println("Personagem: " + guerreiro.nome + "   Vida: " + guerreiro.vida);}
        for (Barbaro barbaro : ca.getListaBarbaros()) {
            System.out.println("Personagem: " + barbaro.nome + "   Vida: " + barbaro.vida);        }
        for (Druida druida : ca.getListaDruidas()) {
            System.out.println("Personagem: " + druida.nome + "   Vida: " + druida.vida + "    Fé: " + druida.fe);        }
        for (Clerigo clerigo : ca.getListaClerigos()) {
            System.out.println("Personagem: " + clerigo.nome + "   Vida: " + clerigo.vida + "    Fé: " + clerigo.fe);        }
        for (Feiticeiro feiticeiro : ca.getListaFeiticeiros()) {
            System.out.println("Personagem: " + feiticeiro.nome + "   Vida: " + feiticeiro.vida + "    Mana: " + feiticeiro.mana);        }
        for (Mago mago : ca.getListaMagos()) {
            System.out.println("Personagem: " + mago.nome + "   Vida: " + mago.vida + "    Mana: " + mago.mana);        }
    }
            }
            }}}}}}

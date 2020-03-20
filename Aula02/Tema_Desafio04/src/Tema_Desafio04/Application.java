package Tema_Desafio04;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Tema_Desafio04.Criacao.opcaoMenu;

public class Application {
    static Criacao ca = new Criacao();//ca --> criacao app
    static public Impress imp = new Impress();
    static public int tipoimpr = 2;//tipo de impressao
    public static void main(String[] args) {
        int r = 0;//numero da rodada
        String cc;
        int psl;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        Evento evento = new Evento();
        LocalDateTime inicio = LocalDateTime.now();
        evento.agora();
        Impress.impre();//metodo(impre) que cria uma lista dentro da Classe Impress(este que fez parar de dar erro NULL
        ca.criarListas();
        ca.criarRapido();
        ca.Menu();//Roda MENU com opções do programa
        //Armas, Poderes e Magias
        Magia raio = new Magia("Raio", 10, 5);
        Magia fire = new Magia("Fire", 10, 10);
        Magia chuvaQuente = new Magia ("Chuva Quente", 50,20);
        PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual", 10, 5);
        PoderDivino cajado = new PoderDivino("Cajado", 10, 7);
        PoderDivino massaDeRelampagos = new PoderDivino("Massa de Relâmpagos",50,20);
        //Ataques
        boolean continuar = true;
        char opcao;
        while (continuar) {
            r = r + 1;
            System.out.println("Rodada " + r);
            System.out.println("Escolha o ATACANTE: G - GUERREIRO, B - BARBARO, D - DRUIDA, C - CLERIGO, M - MAGO ou F - FEITICEIRO");
            //ca.listarPersonagens();
            ca.listarPersonagensVivos();
            String cpl = sc.next();//cpl = classe primeiro lutador
            System.out.println("Agora escolha o número do Personagem atacante: 1 - 2 - 3 ...");
            int ppl = sc.nextInt();//ppl = personagem primeiro lutador
            ppl = ppl - 1;

            if (cpl.equals("G")||cpl.equals("B")){
                System.out.println("Escolha o ALVO: G - GUERREIRO, B - BARBARO, D - DRUIDA, C - CLERIGO, M - MAGO ou F - FEITICEIRO");
                ca.listarPersonagensVivos();
                String csl = sc.next();//csl = classe segundo lutador
                System.out.println("e por fim o número do Personagem Alvo: 1 - 2 - 3 ...");

                psl = sc.nextInt();//ppl = personagem segundo lutador

                psl = psl - 1;
                cc = cpl + csl;

                if (cc.equals("GB")) {
                    ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaBarbaros().get(psl));}
                if (cc.equals("GD")) {
                    ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaDruidas().get(psl));}
                if (cc.equals("GC")) {
                    ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaClerigos().get(psl));}
                if (cc.equals("GM")) {
                    ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaMagos().get(psl));}
                if (cc.equals("GF")) {
                    ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaFeiticeiros().get(psl));}
                if (cc.equals("GG")) {
                    ca.getListaGuerreiros().get(ppl).atacarArmas(ca.getListaGuerreiros().get(psl));}

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

            }

            if (cpl.equals("D")||cpl.equals("C")||cpl.equals("M")||cpl.equals("F")) {

                System.out.println("Qual Habilidade gostaria de usar? ");
                if (cpl.equals("D")||cpl.equals("C")){System.out.println("Sacerdotes Ataque Individual: 4-Arma Espiritual 5-Cajado");
                    System.out.println("Sacerdotes Ataque em Área: 6-Massa de Relampagos");}
                if (cpl.equals("M")||cpl.equals("F")){System.out.println("Arcanos Ataque Individual: 1-Raio 2- Fire");
                System.out.println("Arcanos Ataque em Área: 3-Chuva Quente");}
                int habilidadeEscolhida= sc.nextInt();

                if((habilidadeEscolhida==3||habilidadeEscolhida==6)) {
                    System.out.println("Quantos alvos gostaria de atacar? ");
                    int numeroAlvosIndicadoPeloUsuario = sc.nextInt();
                    List<String> listaDeAlvos;
                    listaDeAlvos = new ArrayList<>();

                    for (int i = 0; i < numeroAlvosIndicadoPeloUsuario; i++) {
                        System.out.println("Digite o nome do alvo que você vai atacar?");
                        ca.impDruidas();
                        ca.impClerigos();
                        ca.impMagos();
                        ca.impFeiticeiros();
                        String alvoEscolhidoPeloUsuario = sc.next();
                        listaDeAlvos.add(alvoEscolhidoPeloUsuario);
                        System.out.println("adicionado item na lista");
                    }
                    for (int i = 0; i < listaDeAlvos.size(); i++) {
                          System.out.println(listaDeAlvos.get(i));}

                    for (String x : listaDeAlvos) {
                    System.out.println(x); }


                //fulano.atacar(alvos, magiaEmArea);


/*
                ca.getListaDruidas().get(ppl).atacarPoderesDivinos(listaDeAlvos().getNome("Niele"),massaDeRelampagos);
                ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaGuerreiros().get(psl), armaEspiritual);
                ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaGuerreiros().get(psl), armaEspiritual);

                ca.getListaDruidas().get(0);
*/

                }

                if((habilidadeEscolhida==1||habilidadeEscolhida==2||habilidadeEscolhida==4||habilidadeEscolhida==5)) {
                System.out.println("Escolha o ALVO: G - GUERREIRO, B - BARBARO, D - DRUIDA, C - CLERIGO, M - MAGO ou F - FEITICEIRO");
                    ca.listarPersonagensVivos();
                    String csl = sc.next();//csl = classe segundo lutador
                    System.out.println("e por fim o número do Personagem Alvo: 1 - 2 - 3 ...");

                    psl = sc.nextInt();//ppl = personagem segundo lutador

                    psl = psl - 1;

                    cc = cpl + csl;

                if (cc.equals("DG")) {
                    ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaGuerreiros().get(psl), armaEspiritual);
                }
                if (cc.equals("DB")) {
                    ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaBarbaros().get(psl), armaEspiritual);
                }
                if (cc.equals("DC")) {
                    ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaClerigos().get(psl), armaEspiritual);
                }
                if (cc.equals("DM")) {
                    ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaMagos().get(psl), armaEspiritual);
                }
                if (cc.equals("DF")) {
                    ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaFeiticeiros().get(psl), armaEspiritual);
                }
                if (cc.equals("DD")) {
                    ca.getListaDruidas().get(ppl).atacarPoderesDivinos(ca.getListaDruidas().get(psl), armaEspiritual);
                }


                if (cc.equals("CG")) {
                    ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaGuerreiros().get(psl), cajado);
                }
                if (cc.equals("CB")) {
                    ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaBarbaros().get(psl), cajado);
                }
                if (cc.equals("CD")) {
                    ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaDruidas().get(psl), cajado);
                }
                if (cc.equals("CM")) {
                    ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaMagos().get(psl), cajado);
                }
                if (cc.equals("CF")) {
                    ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaFeiticeiros().get(psl), cajado);
                }
                if (cc.equals("CC")) {
                    ca.getListaClerigos().get(ppl).atacarPoderesDivinos(ca.getListaClerigos().get(psl), cajado);
                }

                if (cc.equals("MG")) {
                    ca.getListaMagos().get(ppl).atacarMagias(ca.getListaGuerreiros().get(psl), raio);
                }
                if (cc.equals("MB")) {
                    ca.getListaMagos().get(ppl).atacarMagias(ca.getListaBarbaros().get(psl), raio);
                }
                if (cc.equals("MD")) {
                    ca.getListaMagos().get(ppl).atacarMagias(ca.getListaDruidas().get(psl), raio);
                }
                if (cc.equals("MC")) {
                    ca.getListaMagos().get(ppl).atacarMagias(ca.getListaClerigos().get(psl), raio);
                }
                if (cc.equals("MF")) {
                    ca.getListaMagos().get(ppl).atacarMagias(ca.getListaFeiticeiros().get(psl), raio);
                }
                if (cc.equals("MM")) {
                    ca.getListaMagos().get(ppl).atacarMagias(ca.getListaMagos().get(psl), raio);
                }

                if (cc.equals("FG")) {
                    ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaGuerreiros().get(psl), fire);
                }
                if (cc.equals("FB")) {
                    ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaBarbaros().get(psl), fire);
                }
                if (cc.equals("FD")) {
                    ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaDruidas().get(psl), fire);
                }
                if (cc.equals("FC")) {
                    ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaClerigos().get(psl), fire);
                }
                if (cc.equals("FM")) {
                    ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaMagos().get(psl), fire);
                }
                if (cc.equals("FF")) {
                    ca.getListaFeiticeiros().get(ppl).atacarMagias(ca.getListaFeiticeiros().get(psl), fire);
                }
                }
            }

            System.out.println("Voce quer mais um ataque?  S - Sim   N - Não");
            opcao = sc.next().charAt(0);
            if (opcao == 'N') {
                continuar = false;
            }
        }

        System.out.println("COMBATE:");
        String inicioFormatada = inicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSS"));
        System.out.println("Início: "+inicioFormatada);
        imp.imprimeTodaLista();
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

        Duration tempoRestante = Duration.between(inicio,LocalDateTime.now());
        long ts = tempoRestante.toSeconds();
        long tms = tempoRestante.toMillis();
        System.out.println("Duração total do combate: " + ts+"s "+tms+"ms");

         }}

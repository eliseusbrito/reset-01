package Tema_Desafio04;

import java.util.ArrayList;
import java.util.List;

public class Impress {

    private static List<String>listaImpress;

    public Impress() {
    }

    public Impress(List<String> listaImpress) {
        this.listaImpress = listaImpress;
    }

    public List<String> getListaImpress() {
        return listaImpress;
    }

    public static void impre(){
        listaImpress = new ArrayList<>();
    }

    public void imprimeTodaLista(){
        for (int i = 0; i < listaImpress.size(); i++) {
            System.out.println(listaImpress.get(i));
        }

    }
}

    /*for (String String : listaImpress) {
            System.out.println(imp.getListaImpress());
        }*/
        //Estas linhas imprimim a lista inteira com todos os itens mas lado a lado
      //  [[18/03/2020 19:56:30.144] Gre atacou bar com Machado causando 47,00 de dano, [18/03/2020 19:56:42.385] bar atacou Gre com Bola de fogo causando 10,00 de dano]

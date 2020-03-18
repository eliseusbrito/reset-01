package Tema_Desafio01;

import java.util.ArrayList;
import java.util.List;

import static Tema_Desafio01.Application.imp;

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
        System.out.println("rodou metodo impre");
        listaImpress = new ArrayList<>();
        imp.getListaImpress().add("texto dentro da classe onde foi criado a lista");

        for (String String : listaImpress) {
            System.out.println(imp.getListaImpress());
        }


    }
}

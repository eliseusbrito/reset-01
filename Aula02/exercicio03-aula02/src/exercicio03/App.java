package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


        Produto produto1 = new Produto("Sabonete",Segmento.HIGIENE,2.25,2);
        Produto produto2 = new Produto("Arroz",Segmento.ALIMENTACAO,5,2);
        Produto produto3 = new Produto("Desinfetante",Segmento.LIMPEZA,3,2);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);


        Produto.imp();

        for (Produto produto : produtos){
            System.out.println("["+Produto.segmento+"] - "+nome+"("+quantidade+") - "+valor+" / "+quantidade*valor);
        }

    }
}

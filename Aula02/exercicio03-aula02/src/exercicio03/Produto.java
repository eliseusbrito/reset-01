package exercicio03;

public class Produto {

    String nome;
    Segmento segmento;
    double valor;
    int quantidade;

    public Produto(String nome, Segmento segmento, double valor, int quantidade) {
        this.nome = nome;
        this.segmento = segmento;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void imp(){

        for (Produto produto : produtos){
            System.out.println("["+Produto.segmento+"] - "+nome+"("+quantidade+") - "+valor+" / "+quantidade*valor);


        //System.out.println("["+segmento+"] - "+nome+"("+quantidade+") - "+valor+" / "+quantidade*valor);
    }
    }
}

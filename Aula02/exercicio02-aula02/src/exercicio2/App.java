package exercicio2;

public class App {

    public static void main(String[] args) {

    Livro livro1 = new Livro ("Senhor dos Aneis", "J.R.R Tolkien", Categoria.FANTASIA , Status.DISPONIVEL);
    Livro livro2 = new Livro ("A Mulher na Janela","A. J. Finn",Categoria.ROMANCE, Status.EM_USO);
    Livro livro3 = new Livro ("A paciente silenciosa","Alex Michaelides",Categoria.SUSPENSE,Status.EMPRESTADO);
    Livro livro4 = new Livro ("O Exorcista","William Peter Blatty",Categoria.TERROR,Status.DISPONIVEL);

    //System.out.println(livro1.toString());
        System.out.println(livro1.categoria+" - "+livro1.titulo+" "+livro1.autor+"): "+livro1.status);
        System.out.println(livro2.categoria+" - "+livro2.titulo+" "+livro2.autor+"): "+livro2.status);
        System.out.println(livro3.categoria+" - "+livro3.titulo+" "+livro3.autor+"): "+livro3.status);
        System.out.println(livro4.categoria+" - "+livro4.titulo+" "+livro4.autor+"): "+livro4.status);

    }

}

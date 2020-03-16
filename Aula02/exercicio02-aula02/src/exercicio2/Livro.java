package exercicio2;

public class Livro {
    String titulo;
    String autor;
    Categoria categoria;
    Status status;

    public Livro(String nome, String autor, Categoria categoria, Status status) {
        this.titulo = nome;
        this.autor = autor;
        this.categoria = categoria;
        this.status = status;
    }

    public

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria=" + categoria +
                ", status=" + status +
                '}';
    }
}

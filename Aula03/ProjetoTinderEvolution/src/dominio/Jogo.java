package dominio;

import java.time.LocalDate;

public class Jogo {

    private int id;
    private String nome;
    private String publisher;
    private LocalDate dataDeLancamento;
    private CategoriaJogo categoriaJogo;
    private PlataformaJogo plataformaJogo;

    public Jogo(String nome, String publisher, LocalDate dataDeLancamento, CategoriaJogo categoriaJogo, PlataformaJogo plataformaJogo) {
        this.nome = nome;
        this.publisher = publisher;
        this.dataDeLancamento = dataDeLancamento;
        this.categoriaJogo = categoriaJogo;
        this.plataformaJogo = plataformaJogo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public CategoriaJogo getCategoriaJogo() {
        return categoriaJogo;
    }

    public void setCategoriaJogo(CategoriaJogo categoriaJogo) {
        this.categoriaJogo = categoriaJogo;
    }

    public PlataformaJogo getPlataformaJogo() {
        return plataformaJogo;
    }

    public void setPlataformaJogo(PlataformaJogo plataformaJogo) {
        this.plataformaJogo = plataformaJogo;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", publisher='" + publisher + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", categoriaJogo=" + categoriaJogo +
                ", plataformaJogo=" + plataformaJogo +
                '}';
    }
}

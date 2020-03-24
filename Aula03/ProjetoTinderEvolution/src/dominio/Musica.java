package dominio;

import java.time.LocalDate;

public class Musica {
    private int Id;
    private String nome;
    private String artista;
    private String autor;
    private LocalDate dataDeLancamento;
    private EstiloMusical estiloMusical;

    public Musica(String nome, String artista,  String autor, LocalDate dataDeLancamento, EstiloMusical estiloMusical) {
        this.nome = nome;
        this.artista = artista;
        this.autor = autor;
        this.dataDeLancamento = dataDeLancamento;
        this.estiloMusical = estiloMusical;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public EstiloMusical getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(EstiloMusical estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", autor='" + autor + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", estiloMusical=" + estiloMusical +
                '}';
    }
}





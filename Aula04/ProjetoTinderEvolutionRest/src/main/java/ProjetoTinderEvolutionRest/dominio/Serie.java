package ProjetoTinderEvolutionRest.dominio;

import java.time.LocalDate;

public class Serie {

    private int id;
    private String nome;
    private String diretor;
    private LocalDate dataDeLancamento;
    private Integer numeroDeTemporadas;
    private Integer numeroDeEpisodios;
    private CategoriaSerie categoriaSerie;
    private String sinopse;

    public Serie(String nome, String diretor, LocalDate dataDeLancamento, Integer numeroDeTemporadas, Integer numeroDeEpisodios, CategoriaSerie categoriaSerie, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataDeLancamento = dataDeLancamento;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.numeroDeEpisodios = numeroDeEpisodios;
        this.categoriaSerie = categoriaSerie;
        this.sinopse = sinopse;
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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public Integer getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(Integer numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public Integer getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(Integer numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public CategoriaSerie getCategoriaSerie() {
        return categoriaSerie;
    }

    public void setCategoriaSerie(CategoriaSerie categoriaSerie) {
        this.categoriaSerie = categoriaSerie;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", numeroDeEpisodios=" + numeroDeEpisodios +
                ", categoriaSerie=" + categoriaSerie +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}

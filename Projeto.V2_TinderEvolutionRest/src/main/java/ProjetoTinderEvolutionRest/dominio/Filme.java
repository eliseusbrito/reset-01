package ProjetoTinderEvolutionRest.dominio;

import java.time.LocalDate;

public class Filme {
    private int id;
    private String nome;
    private String diretor;
    private LocalDate dataDeLancamento;
    private CategoriaFilme categoriaFilme;
    private String sinopse;

    public Filme(String nome, String diretor, LocalDate dataDeLancamento, CategoriaFilme categoriaFilme, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataDeLancamento = dataDeLancamento;
        this.categoriaFilme = categoriaFilme;
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

    public CategoriaFilme getCategoriaFilme() {
        return categoriaFilme;
    }

    public void setCategoriaFilme(CategoriaFilme categoriaFilme) {
        this.categoriaFilme = categoriaFilme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", categoriaFilme=" + categoriaFilme +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}



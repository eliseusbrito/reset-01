package br.com.cwi.aula04.rest;

import java.time.LocalDate;

public class Usuario {

    private int id;
    private String nome;
    private LocalDate aniversario;

    public Usuario(String nome, LocalDate aniversario) {
        this.nome = nome;
        this.aniversario = aniversario;
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

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", aniversario=" + aniversario +
                '}';
    }
}

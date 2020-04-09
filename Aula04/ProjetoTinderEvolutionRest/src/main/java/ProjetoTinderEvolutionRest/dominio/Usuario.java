package ProjetoTinderEvolutionRest.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;
    private String bio;
    private Double latitude;
    private Double longitude;
    private List<Musica> musicasCurtidas = new ArrayList<>();
    private List<Filme> filmesCurtidos = new ArrayList<>();
    private List<Serie> seriesCurtidas = new ArrayList<>();
    private List<Jogo> jogosCurtidos = new ArrayList<>();
    private List<Esporte> esportesCurtidos = new ArrayList<>();
    private List<Curiosidade> curiosidades = new ArrayList<>();
    private List<Usuario> usuariosCurtidos = new ArrayList<>();

    public Usuario(String nome, String email, String telefone, LocalDate dataDeNascimento, String bio, Double latitude, Double longitude) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Usuario(){

    }


    public int getId() {
        return id;
    }

    public List<Musica> getMusicasCurtidas() {
        return musicasCurtidas;
    }

    public void setMusicasCurtidas(List<Musica> musicasCurtidas) {
        this.musicasCurtidas = musicasCurtidas;
    }

    public List<Filme> getFilmesCurtidos() {
        return filmesCurtidos;
    }

    public void setFilmesCurtidos(List<Filme> filmesCurtidos) {
        this.filmesCurtidos = filmesCurtidos;
    }

    public List<Serie> getSeriesCurtidas() {
        return seriesCurtidas;
    }

    public void setSeriesCurtidas(List<Serie> seriesCurtidas) {
        this.seriesCurtidas = seriesCurtidas;
    }

    public List<Jogo> getJogosCurtidos() {
        return jogosCurtidos;
    }

    public void setJogosCurtidos(List<Jogo> jogosCurtidos) {
        this.jogosCurtidos = jogosCurtidos;
    }

    public List<Esporte> getEsportesCurtidos() {
        return esportesCurtidos;
    }

    public void setEsportesCurtidos(List<Esporte> esportesCurtidos) {
        this.esportesCurtidos = esportesCurtidos;
    }

    public List<Curiosidade> getCuriosidades() {
        return curiosidades;
    }

    public void setCuriosidades(List<Curiosidade> curiosidades) {
        this.curiosidades = curiosidades;
    }

    public List<Usuario> getUsuariosCurtidos() {
        return usuariosCurtidos;
    }

    public void setUsuariosCurtidos(List<Usuario> usuariosCurtidos) {
        this.usuariosCurtidos = usuariosCurtidos;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    // Adiciona músicas curtidas
    public void salvarMusica(Musica musica) {
        musicasCurtidas.add(musica);
    }

    // Adiciona filme curtidos
    public void salvarFilme(Filme filme) {
        filmesCurtidos.add(filme);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ",\n nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ",\n dataDeNascimento=" + dataDeNascimento +
                ", bio='" + bio + '\'' +
                ",\n latitude=" + latitude +
                ", longitude=" + longitude +
                ",\n musicasCurtidas=" + musicasCurtidas +
                ",\n filmesCurtidos=" + filmesCurtidos +
                ",\n seriesCurtidas=" + seriesCurtidas +
                ",\n jogosCurtidos=" + jogosCurtidos +
                ",\n esportesCurtidos=" + esportesCurtidos +
                ",\n curiosidades=" + curiosidades +
                ",\n usuariosCurtidos=" + usuariosCurtidos +
                '}';
    }
}

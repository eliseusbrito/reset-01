package ProjetoTinderEvolutionRest.dominio;

import ProjetoTinderEvolutionRest.acervo.UsuarioAcervo;
import ProjetoTinderEvolutionRest.gerenciador.UsuarioGerenciador;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static ProjetoTinderEvolutionRest.acervo.UsuarioAcervo.usuarios;

@Service
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;
    private String bio;
    private Double latitude;
    private Double longitude;
    private String foto;
    private List<Usuario> usuariosLiked = new ArrayList<>();
    private List<Usuario> usuariosDisliked = new ArrayList<>();
    private List<Musica> musicasCurtidas = new ArrayList<>();
    private List<Filme> filmesCurtidos = new ArrayList<>();
    private List<Serie> seriesCurtidas = new ArrayList<>();
    private List<Jogo> jogosCurtidos = new ArrayList<>();
    private List<Esporte> esportesCurtidos = new ArrayList<>();
    private List<Curiosidade> curiosidadesCurtidas = new ArrayList<>();
    private List<Usuario> matches = new ArrayList<>();

    public Usuario(String nome, String email, String telefone, LocalDate dataDeNascimento, String bio, Double latitude, Double longitude, String foto) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.foto = foto;
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
        return curiosidadesCurtidas;
    }

    public void setCuriosidades(List<Curiosidade> curiosidades) {
        this.curiosidadesCurtidas = curiosidades;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @JsonIgnore
    public List<Usuario> getUsuariosLiked() {
        return usuariosLiked;
    }

    public void setUsuariosLiked(List<Usuario> usuariosLiked) {
        this.usuariosLiked = usuariosLiked;
    }

    @JsonIgnore
    public List<Usuario> getUsuariosDisliked() {
        return usuariosDisliked;
    }

    public void setUsuariosDisliked(List<Usuario> usuariosDisliked) {
        this.usuariosDisliked = usuariosDisliked;
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

    @JsonIgnore
    public List<Usuario> getMatches() {
        return matches;
    }

    // Músicas
    public void salvarMusica(Musica musica) {
        musicasCurtidas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicasCurtidas.remove(musica);
    }

    public Usuario listarMusicasCurtidas(int idUsuario){
        System.out.println("Músicas curtidas pelo usuário "+nome+ " - id["+idUsuario+"]:");

        for (int i = 0; i < musicasCurtidas.size(); i++) {
            System.out.println(musicasCurtidas.get(i));}
        return null;
        }

    // Filmes
    public void salvarFilme(Filme filme) {
        filmesCurtidos.add(filme);
    }
    public void removerFilme(Filme filme) {
        filmesCurtidos.remove(filme);
    }
    public void listarFilmesCurtidos(int idUsuario, String nome){
        System.out.println("Filmes curtidos pelo usuário "+nome+ " - id["+idUsuario+"]:");
        for (int i = 0; i < filmesCurtidos.size(); i++) {
            System.out.println(filmesCurtidos.get(i));}
    }

    //Series
    public void salvarSerie(Serie serie) {
        seriesCurtidas.add(serie);
    }

    public void removerSerie(Serie serie) {
        seriesCurtidas.remove(serie);
    }

    public void listarSeriesCurtidas(int idUsuario, String nome){
        System.out.println("Séries curtidas pelo usuário "+nome+ " - id["+idUsuario+"]:");
        for (int i = 0; i < seriesCurtidas.size(); i++) {
            System.out.println(seriesCurtidas.get(i));}
    }

    //Jogos
    public void salvarJogo(Jogo jogo) {
        jogosCurtidos.add(jogo);
    }

    public void removerJogo(Jogo jogo) {
        jogosCurtidos.remove(jogo);
    }

    public void listarJogosCurtidos(int idUsuario, String nome){
        System.out.println("Jogos curtidos pelo usuário "+nome+ " - id["+idUsuario+"]:");
        for (int i = 0; i < jogosCurtidos.size(); i++) {
            System.out.println(jogosCurtidos.get(i));}
    }

    //Esporte
    public void salvarEsporte(Esporte esporte) {
        esportesCurtidos.add(esporte);
    }

    public void removerEsporte(Esporte esporte) {
        esportesCurtidos.remove(esporte);
    }

    public void listarEsportesCurtidos(int idUsuario, String nome){
        System.out.println("Esportes curtidos pelo usuário "+nome+ " - id["+idUsuario+"]:");
        for (int i = 0; i < esportesCurtidos.size(); i++) {
            System.out.println(esportesCurtidos.get(i));}
    }

    //Curiosidade
    public void salvarCuriosidade(Curiosidade curiosidade) {
        curiosidadesCurtidas.add(curiosidade);
    }

    public void removerCuriosidade(Curiosidade curiosidade) {
        curiosidadesCurtidas.remove(curiosidade);
    }

    public void listarCuriosidadesCurtidas(int idUsuario, String nome){
        System.out.println("Curiosidades curtidas pelo usuário "+nome+ " - id["+idUsuario+"]:");
        for (int i = 0; i < curiosidadesCurtidas.size(); i++) {
            System.out.println(curiosidadesCurtidas.get(i));}
    }

    //Usuarios
    public void salvarUsuarioLiked(Usuario usuario) {
        usuariosLiked.add(usuario);
    }

    public void removerUsuarioLiked(Usuario usuario) {
        usuariosLiked.remove(usuario);
    }

    public List<Usuario> listarUsuariosLiked(int idUsuario, String nome){
        System.out.println("Usuários que receberam likes do usuário "+nome+ " - id["+idUsuario+"]:");
        for (int i = 0; i < usuariosLiked.size(); i++) {
            System.out.println(usuariosLiked.get(i));
            }
        return usuariosLiked;
    }

    public void salvarUsuarioDisliked(Usuario usuario) {
        usuariosDisliked.add(usuario);
    }

    public void removerUsuarioDisliked(Usuario usuario) {
        usuariosDisliked.remove(usuario);
    }

    public List<Usuario> listarUsuariosDisliked(int idUsuario, String nome){
        System.out.println("Usuários que receberam Dislikes do usuário "+nome+ " - id["+idUsuario+"]:");
        for (int i = 0; i < usuariosDisliked.size(); i++) {
            System.out.println(usuariosDisliked.get(i));
        }
        return usuariosDisliked;
        }

    public List<Usuario> listarDislike(){
        for (int i = 0; i < usuariosDisliked.size(); i++) {
            System.out.println(usuariosDisliked.get(i));
        }
        return usuariosDisliked;
    }

    //Match
    public List<Usuario> listarMatch(Usuario usuario) {
        System.out.println("Listagem de Matches do usuário "+usuario.getNome()+" - id="+usuario.getId());
        for (int i = 0; i < matches.size(); i++) {
            System.out.println(matches.get(i));}
        return matches;
    }

    public List<Usuario> listarMatches() {
        for (int i = 0; i < matches.size(); i++) {
            System.out.println(matches.get(i));}
        return matches;
    }


    public void salvarMatch(Usuario usuario) {
        matches.add(usuario);
    }

    public void removerMatch(Usuario usuario) {
        matches.remove(usuario);
        System.out.println("removeu match de "+usuario.getNome());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", bio='" + bio + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", foto=" + foto +
                ", musicasCurtidas=" + musicasCurtidas +
                ", filmesCurtidos=" + filmesCurtidos +
                ", seriesCurtidas=" + seriesCurtidas +
                ", jogosCurtidos=" + jogosCurtidos +
                ", esportesCurtidos=" + esportesCurtidos +
                ", curiosidadesCurtidas=" + curiosidadesCurtidas +
                '}';
    }
}

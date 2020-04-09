package ProjetoTinderEvolutionRest.dominio;

public class LikeDislikeUsuario {

    private int id;
    private int idUsuarioAvaliador;//usuario deu like ou dislike
    private int idUsuarioAvaliado;//usuario recebeu like ou dislike
    private boolean avalUsuario;

    public LikeDislikeUsuario(int idUsuarioAvaliador, int idUsuarioAvaliado, boolean avalUsuario) {
        this.idUsuarioAvaliador = idUsuarioAvaliador;
        this.idUsuarioAvaliado = idUsuarioAvaliado;
        this.avalUsuario = avalUsuario;
    }

    public LikeDislikeUsuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getidUsuarioAvaliador() {
        return idUsuarioAvaliador;
    }

    public void setidUsuarioAvaliador(int idUsuarioAvaliador) {
        this.idUsuarioAvaliador = idUsuarioAvaliador;
    }

    public int getidUsuarioAvaliado() {
        return idUsuarioAvaliado;
    }

    public void setidUsuarioAvaliado(int idUsuarioAvaliado) {
        this.idUsuarioAvaliado = idUsuarioAvaliado;
    }

    public boolean isAvalUsuario() {
        return avalUsuario;
    }

    public void setAvalUsuario(boolean avalUsuario) {
        this.avalUsuario = avalUsuario;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", idUsuarioAvaliador=" + idUsuarioAvaliador +
                ", idUsuarioAvaliado=" + idUsuarioAvaliado +
                ", avalUsuario=" + avalUsuario +
                '}';
    }
}

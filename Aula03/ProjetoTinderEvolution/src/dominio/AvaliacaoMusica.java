package dominio;

public class AvaliacaoMusica {

    private int id;
    private int idUsuario;
    private int idMusica;
    private boolean avaliacaoMusica;

    public AvaliacaoMusica(int idUsuario, int idMusica, boolean avaliacaoMusica) {
        this.idUsuario = idUsuario;
        this.idMusica = idMusica;
        this.avaliacaoMusica = avaliacaoMusica;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public boolean isAvaliacaoMusica() {
        return avaliacaoMusica;
    }

    public void setAvaliacaoMusica(boolean avaliacaoMusica) {
        this.avaliacaoMusica = avaliacaoMusica;
    }

    @Override
    public String toString() {
        return "AvaliacaoMusica{" +
                "idUsuario=" + idUsuario +
                ", idMusica=" + idMusica +
                ", avaliacaoMusica=" + avaliacaoMusica +
                '}';
    }
}

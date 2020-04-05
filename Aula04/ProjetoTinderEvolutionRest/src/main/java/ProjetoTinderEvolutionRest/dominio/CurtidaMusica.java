package ProjetoTinderEvolutionRest.dominio;

public class CurtidaMusica {

    private int id;
    private int idUsuario;
    private int idMusica;
    private boolean avalMusica;

    public CurtidaMusica(int idUsuario, int idMusica, boolean avalMusica) {
        this.idUsuario = idUsuario;
        this.idMusica = idMusica;
        this.avalMusica = avalMusica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isAvalMusica() {
        return avalMusica;
    }

    public void setAvalMusica(boolean avalMusica) {
        this.avalMusica = avalMusica;
    }

    @Override
    public String toString() {
        return "AvaliacaoMusica{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idMusica=" + idMusica +
                ", avalMusica=" + avalMusica +
                '}';
    }
}

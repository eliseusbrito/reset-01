package ProjetoTinderEvolutionRest.dominio;

public class Match {

    private int id;
    private int idUsuarioD;
    private int idUsuarioR;
    private boolean avalUsuario;

    public Match( int idUsuarioD, int idUsuarioR, boolean avalUsuario) {
        this.idUsuarioD = idUsuarioD;
        this.idUsuarioR = idUsuarioR;
        this.avalUsuario = avalUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuarioD() {
        return idUsuarioD;
    }

    public void setIdUsuarioD(int idUsuarioD) {
        this.idUsuarioD = idUsuarioD;
    }

    public int getIdUsuarioR() {
        return idUsuarioR;
    }

    public void setIdUsuarioR(int idUsuarioR) {
        this.idUsuarioR = idUsuarioR;
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
                ", idUsuarioD=" + idUsuarioD +
                ", idUsuarioR=" + idUsuarioR +
                ", avalUsuario=" + avalUsuario +
                '}';
    }
}

package NEOAPI.Urbans.Homes.Modelos;

public class Propietarios {
    private int idPropietarios;
    private String nombreComp;
    private String correo;
    private String notel;

    public Propietarios() {}

    public Propietarios(int idPropietarios, String nombreComp, String correo, String notel) {
        this.idPropietarios = idPropietarios;
        this.nombreComp = nombreComp;
        this.correo = correo;
        this.notel = notel;
    }

    public Propietarios(String nombreComp, String correo, String notel) {
        this.nombreComp = nombreComp;
        this.correo = correo;
        this.notel = notel;
    }

    public int getIdPropietarios() {
        return idPropietarios;
    }

    public void setIdPropietarios(int idPropietarios) {
        this.idPropietarios = idPropietarios;
    }

    public String getNombreComp() {
        return nombreComp;
    }

    public void setNombreComp(String nombreComp) {
        this.nombreComp = nombreComp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNotel() {
        return notel;
    }

    public void setNotel(String notel) {
        this.notel = notel;
    }

    @Override
    public String toString() {
        return "Propietario [ID=" + idPropietarios + ", Nombre=" + nombreComp +
                ", Correo=" + correo + ", Tel=" + notel + "]";
    }
}
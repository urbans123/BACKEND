package NEOAPI.Urbans.Homes.Modelos;

public class Inquilinos {
    private int idInquilinos;
    private String nombreComple;
    private String correo;
    private String nrotel;

    public Inquilinos() {}

    public Inquilinos(int idInquilinos, String nombreComple, String correo, String nrotel) {
        this.idInquilinos = idInquilinos;
        this.nombreComple = nombreComple;
        this.correo = correo;
        this.nrotel = nrotel;
    }

    public Inquilinos(String nombreComple, String correo, String nrotel) {
        this.nombreComple = nombreComple;
        this.correo = correo;
        this.nrotel = nrotel;
    }

    public int getIdInquilinos() {
        return idInquilinos;
    }

    public void setIdInquilinos(int idInquilinos) {
        this.idInquilinos = idInquilinos;
    }

    public String getNombreComple() {
        return nombreComple;
    }

    public void setNombreComple(String nombreComple) {
        this.nombreComple = nombreComple;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNrotel() {
        return nrotel;
    }

    public void setNrotel(String nrotel) {
        this.nrotel = nrotel;
    }

    @Override
    public String toString() {
        return "Inquilino [ID=" + idInquilinos + ", Nombre=" + nombreComple +
                ", Correo=" + correo + ", Tel=" + nrotel + "]";
    }
}
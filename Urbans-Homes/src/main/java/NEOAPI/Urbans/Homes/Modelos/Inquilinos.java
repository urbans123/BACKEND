package NEOAPI.Urbans.Homes.Modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "inquilinos")
public class Inquilinos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInquilinos;

    @Column(name = "nombre_completo", nullable = false, length = 100)
    private String nombreComple;

    @Column(name = "correo", nullable = false, unique = true, length = 100)
    private String correo;

    @Column(name = "nro_telefono", length = 20)
    private String nrotel;

    public Inquilinos() {}

    public Inquilinos(String nombreComple, String correo, String nrotel) {
        this.nombreComple = nombreComple;
        this.correo = correo;
        this.nrotel = nrotel;
    }

    public Integer getIdInquilinos() { return idInquilinos; }
    public void setIdInquilinos(Integer idInquilinos) { this.idInquilinos = idInquilinos; }
    public String getNombreComple() { return nombreComple; }
    public void setNombreComple(String nombreComple) { this.nombreComple = nombreComple; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getNrotel() { return nrotel; }
    public void setNrotel(String nrotel) { this.nrotel = nrotel; }

    @Override
    public String toString() {
        return "Inquilino [ID=" + idInquilinos + ", Nombre=" + nombreComple +
                ", Correo=" + correo + ", Tel=" + nrotel + "]";
    }
}

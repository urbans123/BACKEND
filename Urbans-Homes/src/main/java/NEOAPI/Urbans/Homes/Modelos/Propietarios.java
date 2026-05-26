package NEOAPI.Urbans.Homes.Modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "propietarios")
public class Propietarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPropietarios;

    @Column(name = "nombre_completo", nullable = false, length = 100)
    private String nombreComp;

    @Column(name = "correo", nullable = false, unique = true, length = 100)
    private String correo;

    @Column(name = "nro_telefono", length = 20)
    private String notel;

    public Propietarios() {}

    public Propietarios(String nombreComp, String correo, String notel) {
        this.nombreComp = nombreComp;
        this.correo = correo;
        this.notel = notel;
    }

    public Integer getIdPropietarios() { return idPropietarios; }
    public void setIdPropietarios(Integer idPropietarios) { this.idPropietarios = idPropietarios; }
    public String getNombreComp() { return nombreComp; }
    public void setNombreComp(String nombreComp) { this.nombreComp = nombreComp; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getNotel() { return notel; }
    public void setNotel(String notel) { this.notel = notel; }

    @Override
    public String toString() {
        return "Propietario [ID=" + idPropietarios + ", Nombre=" + nombreComp +
                ", Correo=" + correo + ", Tel=" + notel + "]";
    }
}

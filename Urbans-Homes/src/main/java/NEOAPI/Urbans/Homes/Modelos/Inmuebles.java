package NEOAPI.Urbans.Homes.Modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "inmuebles")
public class Inmuebles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInmueble;

    @Column(name = "direccion", nullable = false, length = 150)
    private String direccion;

    @Column(name = "tipo_propiedad", nullable = false, length = 50)
    private String tipoDePropiedad;

    @Column(name = "nro_habitaciones", nullable = false)
    private Integer nroHabitacion;

    @Column(name = "nro_banios", nullable = false)
    private Integer nroBanios;

    @Column(name = "area_m2", nullable = false)
    private Double areaM2;

    @Column(name = "descripcion", length = 300)
    private String descripcion;

    @Column(name = "id_propietarios", nullable = false)
    private Integer idPropietarios;

    public Inmuebles() {}

    public Inmuebles(String direccion, String tipoDePropiedad, Integer nroHabitacion, Integer nroBanios,
                     Double areaM2, String descripcion, Integer idPropietarios) {
        this.direccion = direccion;
        this.tipoDePropiedad = tipoDePropiedad;
        this.nroHabitacion = nroHabitacion;
        this.nroBanios = nroBanios;
        this.areaM2 = areaM2;
        this.descripcion = descripcion;
        this.idPropietarios = idPropietarios;
    }

    public Integer getIdInmueble() { return idInmueble; }
    public void setIdInmueble(Integer idInmueble) { this.idInmueble = idInmueble; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTipoDePropiedad() { return tipoDePropiedad; }
    public void setTipoDePropiedad(String tipoDePropiedad) { this.tipoDePropiedad = tipoDePropiedad; }
    public Integer getNroHabitacion() { return nroHabitacion; }
    public void setNroHabitacion(Integer nroHabitacion) { this.nroHabitacion = nroHabitacion; }
    public Integer getNroBanios() { return nroBanios; }
    public void setNroBanios(Integer nroBanios) { this.nroBanios = nroBanios; }
    public Double getAreaM2() { return areaM2; }
    public void setAreaM2(Double areaM2) { this.areaM2 = areaM2; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Integer getIdPropietarios() { return idPropietarios; }
    public void setIdPropietarios(Integer idPropietarios) { this.idPropietarios = idPropietarios; }

    @Override
    public String toString() {
        return "Inmueble [ID=" + idInmueble + ", Dirección=" + direccion +
                ", Tipo=" + tipoDePropiedad + ", Habitaciones=" + nroHabitacion +
                ", Baños=" + nroBanios + ", Área=" + areaM2 + ", Propietario=" + idPropietarios + "]";
    }
}

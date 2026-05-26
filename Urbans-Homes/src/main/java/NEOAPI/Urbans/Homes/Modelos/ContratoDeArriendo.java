package NEOAPI.Urbans.Homes.Modelos;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "contratos_arriendo")
public class ContratoDeArriendo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContratoArriendo;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "valor_canon", nullable = false)
    private Double valorCanon;

    @Column(name = "id_inmueble", nullable = false)
    private Integer idInmueble;

    @Column(name = "id_inquilinos", nullable = false)
    private Integer idInquilinos;

    public ContratoDeArriendo() {}

    public ContratoDeArriendo(LocalDate fechaInicio, LocalDate fechaFin, Double valorCanon,
                              Integer idInmueble, Integer idInquilinos) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valorCanon = valorCanon;
        this.idInmueble = idInmueble;
        this.idInquilinos = idInquilinos;
    }

    public Integer getIdContratoArriendo() { return idContratoArriendo; }
    public void setIdContratoArriendo(Integer idContratoArriendo) { this.idContratoArriendo = idContratoArriendo; }
    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }
    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }
    public Double getValorCanon() { return valorCanon; }
    public void setValorCanon(Double valorCanon) { this.valorCanon = valorCanon; }
    public Integer getIdInmueble() { return idInmueble; }
    public void setIdInmueble(Integer idInmueble) { this.idInmueble = idInmueble; }
    public Integer getIdInquilinos() { return idInquilinos; }
    public void setIdInquilinos(Integer idInquilinos) { this.idInquilinos = idInquilinos; }

    @Override
    public String toString() {
        return "Contrato [ID=" + idContratoArriendo + ", Inicio=" + fechaInicio +
                ", Fin=" + fechaFin + ", Canon=" + valorCanon + "]";
    }
}

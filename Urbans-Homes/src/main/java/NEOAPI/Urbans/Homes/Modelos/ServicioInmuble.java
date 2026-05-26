package NEOAPI.Urbans.Homes.Modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "servicios_inmueble")
public class ServicioInmuble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServiInmuble;

    @Column(name = "id_servicio", nullable = false)
    private Integer idServicio;

    @Column(name = "id_inmueble", nullable = false)
    private Integer idContrato;

    public ServicioInmuble() {}

    public ServicioInmuble(Integer idServicio, Integer idContrato) {
        this.idServicio = idServicio;
        this.idContrato = idContrato;
    }

    public Integer getIdServiContrato() { return idServiInmuble; }
    public void setIdServiContrato(Integer idServiInmuble) { this.idServiInmuble = idServiInmuble; }
    public Integer getIdServicio() { return idServicio; }
    public void setIdServicio(Integer idServicio) { this.idServicio = idServicio; }
    public Integer getIdContrato() { return idContrato; }
    public void setIdContrato(Integer idContrato) { this.idContrato = idContrato; }

    @Override
    public String toString() {
        return "ServicioInmuble [ID=" + idServiInmuble +
                ", Servicio=" + idServicio +
                ", Inmueble=" + idContrato + "]";
    }
}

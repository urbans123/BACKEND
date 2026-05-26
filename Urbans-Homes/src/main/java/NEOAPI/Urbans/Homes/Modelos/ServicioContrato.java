package NEOAPI.Urbans.Homes.Modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "servicios_contrato")
public class ServicioContrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServiContrato;

    @Column(name = "id_servicio", nullable = false)
    private Integer idServicio;

    @Column(name = "id_contrato", nullable = false)
    private Integer idContrato;

    public ServicioContrato() {}

    public ServicioContrato(Integer idServicio, Integer idContrato) {
        this.idServicio = idServicio;
        this.idContrato = idContrato;
    }

    public Integer getIdServiContrato() { return idServiContrato; }
    public void setIdServiContrato(Integer idServiContrato) { this.idServiContrato = idServiContrato; }
    public Integer getIdServicio() { return idServicio; }
    public void setIdServicio(Integer idServicio) { this.idServicio = idServicio; }
    public Integer getIdContrato() { return idContrato; }
    public void setIdContrato(Integer idContrato) { this.idContrato = idContrato; }

    @Override
    public String toString() {
        return idServiContrato + " - Servicio:" + idServicio + " - Contrato:" + idContrato;
    }
}

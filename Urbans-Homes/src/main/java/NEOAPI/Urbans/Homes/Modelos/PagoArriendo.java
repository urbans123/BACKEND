package NEOAPI.Urbans.Homes.Modelos;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pagos_arriendo")
public class PagoArriendo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPagoArriendo;

    @Column(name = "id_contrato_arriendo", nullable = false)
    private Integer idContratoArriendo;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDate fechaPago;

    @Column(name = "mes_arriendo", nullable = false, length = 20)
    private String mesArriendo;

    @Column(name = "valor_pago", nullable = false)
    private Double valorPago;

    public PagoArriendo() {}

    public PagoArriendo(Integer idContratoArriendo, LocalDate fechaPago, String mesArriendo, Double valorPago) {
        this.idContratoArriendo = idContratoArriendo;
        this.fechaPago = fechaPago;
        this.mesArriendo = mesArriendo;
        this.valorPago = valorPago;
    }

    public Integer getIdPagoArriendo() { return idPagoArriendo; }
    public void setIdPagoArriendo(Integer idPagoArriendo) { this.idPagoArriendo = idPagoArriendo; }
    public Integer getIdContratoArriendo() { return idContratoArriendo; }
    public void setIdContratoArriendo(Integer idContratoArriendo) { this.idContratoArriendo = idContratoArriendo; }
    public LocalDate getFechaPago() { return fechaPago; }
    public void setFechaPago(LocalDate fechaPago) { this.fechaPago = fechaPago; }
    public String getMesArriendo() { return mesArriendo; }
    public void setMesArriendo(String mesArriendo) { this.mesArriendo = mesArriendo; }
    public Double getValorPago() { return valorPago; }
    public void setValorPago(Double valorPago) { this.valorPago = valorPago; }

    @Override
    public String toString() {
        return "PagoArriendo [ID=" + idPagoArriendo + ", Contrato=" + idContratoArriendo +
                ", Mes=" + mesArriendo + ", Valor=" + valorPago + "]";
    }
}

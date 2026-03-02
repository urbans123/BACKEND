package NEOAPI.Urbans.Homes.Modelos;

import java.time.LocalDate;

public class PagoArriendo {
    private int idPagoArriendo;
    private int idContratoArriendo;
    private LocalDate fechaPago;
    private String mesArriendo;
    private double valorPago;

    public PagoArriendo() {}

    public PagoArriendo(int idPagoArriendo, int idContratoArriendo, LocalDate fechaPago,
                        String mesArriendo, double valorPago) {
        this.idPagoArriendo = idPagoArriendo;
        this.idContratoArriendo = idContratoArriendo;
        this.fechaPago = fechaPago;
        this.mesArriendo = mesArriendo;
        this.valorPago = valorPago;
    }

    public PagoArriendo(int idContratoArriendo, LocalDate fechaPago, String mesArriendo, double valorPago) {
        this.idContratoArriendo = idContratoArriendo;
        this.fechaPago = fechaPago;
        this.mesArriendo = mesArriendo;
        this.valorPago = valorPago;
    }

    public int getIdPagoArriendo() {
        return idPagoArriendo;
    }

    public void setIdPagoArriendo(int idPagoArriendo) {
        this.idPagoArriendo = idPagoArriendo;
    }

    public int getIdContratoArriendo() {
        return idContratoArriendo;
    }

    public void setIdContratoArriendo(int idContratoArriendo) {
        this.idContratoArriendo = idContratoArriendo;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMesArriendo() {
        return mesArriendo;
    }

    public void setMesArriendo(String mesArriendo) {
        this.mesArriendo = mesArriendo;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "PagoArriendo [ID=" + idPagoArriendo + ", Contrato=" + idContratoArriendo +
                ", Mes=" + mesArriendo + ", Valor=" + valorPago + "]";
    }
}
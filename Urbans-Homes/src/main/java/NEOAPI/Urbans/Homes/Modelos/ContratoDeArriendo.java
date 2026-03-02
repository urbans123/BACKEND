package NEOAPI.Urbans.Homes.Modelos;

import java.time.LocalDate;

public class ContratoDeArriendo {
    private int idContratoArriendo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double valorCanon;
    private int idInmueble;
    private int idInquilinos;

    public ContratoDeArriendo() {}

    public ContratoDeArriendo(int idContratoArriendo, LocalDate fechaInicio, LocalDate fechaFin,
                              double valorCanon, int idInmueble, int idInquilinos) {
        this.idContratoArriendo = idContratoArriendo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valorCanon = valorCanon;
        this.idInmueble = idInmueble;
        this.idInquilinos = idInquilinos;
    }

    public ContratoDeArriendo(LocalDate fechaInicio, LocalDate fechaFin, double valorCanon,
                              int idInmueble, int idInquilinos) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valorCanon = valorCanon;
        this.idInmueble = idInmueble;
        this.idInquilinos = idInquilinos;
    }

    public int getIdContratoArriendo() {
        return idContratoArriendo;
    }

    public void setIdContratoArriendo(int idContratoArriendo) {
        this.idContratoArriendo = idContratoArriendo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getValorCanon() {
        return valorCanon;
    }

    public void setValorCanon(double valorCanon) {
        this.valorCanon = valorCanon;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public int getIdInquilinos() {
        return idInquilinos;
    }

    public void setIdInquilinos(int idInquilinos) {
        this.idInquilinos = idInquilinos;
    }

    @Override
    public String toString() {
        return "Contrato [ID=" + idContratoArriendo + ", Inicio=" + fechaInicio +
                ", Fin=" + fechaFin + ", Canon=" + valorCanon + "]";
    }
}
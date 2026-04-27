package NEOAPI.Urbans.Homes.Modelos;

public class ServicioInmuble {
    private int idServiContrato;
    private int idServicio;
    private int idContrato;

    public ServicioInmuble() {}

    public ServicioInmuble(int idServiContrato, int idServicio, int idContrato) {
        this.idServiContrato = idServiContrato;
        this.idServicio = idServicio;
        this.idContrato = idContrato;
    }

    public ServicioInmuble(int idServicio, int idContrato) {
        this.idServicio = idServicio;
        this.idContrato = idContrato;
    }

    public int getIdServiContrato() {
        return idServiContrato;
    }

    public void setIdServiContrato(int idServiContrato) {
        this.idServiContrato = idServiContrato;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    @Override
    public String toString() {
        return "ServicioInmuble [ID=" + idServiContrato +
                ", Servicio=" + idServicio +
                ", Contrato=" + idContrato + "]";
    }
}

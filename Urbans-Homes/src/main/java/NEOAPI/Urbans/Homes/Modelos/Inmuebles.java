package NEOAPI.Urbans.Homes.Modelos;

public class Inmuebles {
    private int idInmueble;
    private String direccion;
    private String tipoDePropiedad;
    private int nroHabitacion;
    private int nroBanios;
    private double areaM2;
    private String descripcion;
    private int idPropietarios;

    public Inmuebles() {}

    public Inmuebles(int idInmueble, String direccion, String tipoDePropiedad, int nroHabitacion, int nroBanios,
                     double areaM2, String descripcion, int idPropietarios) {
        this.idInmueble = idInmueble;
        this.direccion = direccion;
        this.tipoDePropiedad = tipoDePropiedad;
        this.nroHabitacion = nroHabitacion;
        this.nroBanios = nroBanios;
        this.areaM2 = areaM2;
        this.descripcion = descripcion;
        this.idPropietarios = idPropietarios;
    }

    public Inmuebles(String direccion, String tipoDePropiedad, int nroHabitacion, int nroBanios,
                     double areaM2, String descripcion, int idPropietarios) {
        this.direccion = direccion;
        this.tipoDePropiedad = tipoDePropiedad;
        this.nroHabitacion = nroHabitacion;
        this.nroBanios = nroBanios;
        this.areaM2 = areaM2;
        this.descripcion = descripcion;
        this.idPropietarios = idPropietarios;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoDePropiedad() {
        return tipoDePropiedad;
    }

    public void setTipoDePropiedad(String tipoDePropiedad) {
        this.tipoDePropiedad = tipoDePropiedad;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getNroBanios() {
        return nroBanios;
    }

    public void setNroBanios(int nroBanios) {
        this.nroBanios = nroBanios;
    }

    public double getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(double areaM2) {
        this.areaM2 = areaM2;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdPropietarios() {
        return idPropietarios;
    }

    public void setIdPropietarios(int idPropietarios) {
        this.idPropietarios = idPropietarios;
    }

    @Override
    public String toString() {
        return "Inmueble [ID=" + idInmueble + ", Dirección=" + direccion +
                ", Tipo=" + tipoDePropiedad + ", Habitaciones=" + nroHabitacion +
                ", Baños=" + nroBanios + ", Área=" + areaM2 + ", Propietario=" + idPropietarios + "]";
    }
}
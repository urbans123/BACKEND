package NEOAPI.Urbans.Homes.Modelos;

import NEOAPI.Urbans.Homes.Modelos.utils.TipoDocumento;
import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres_completos", nullable = false, length = 100)
    private String nombres;

    @Column(name = "tipo_documento", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    @Column(name = "documento", nullable = false, unique = true, length = 15)
    private String documento;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    public Usuario() {}

    public Usuario(String nombres, TipoDocumento tipoDocumento, String documento, Integer edad) {
        this.nombres = nombres;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.edad = edad;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public TipoDocumento getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(TipoDocumento tipoDocumento) { this.tipoDocumento = tipoDocumento; }
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }
    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    @Override
    public String toString() {
        return "Usuario [ID=" + id + ", Nombres=" + nombres +
                ", TipoDoc=" + tipoDocumento + ", Doc=" + documento + ", Edad=" + edad + "]";
    }
}

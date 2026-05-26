package NEOAPI.Urbans.Homes.configuracion;

import NEOAPI.Urbans.Homes.Modelos.*;
import NEOAPI.Urbans.Homes.Modelos.utils.TipoDocumento;
import NEOAPI.Urbans.Homes.repositorios.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class CargaDatos implements CommandLineRunner {

    private final IPropietariosRepositorio propietariosRepositorio;
    private final IInmueblesRepositorio inmueblesRepositorio;
    private final IInquilinosRepositorio inquilinosRepositorio;
    private final IContratoDeArrrendoRepositorio contratoRepositorio;
    private final IPagoArrrendoRepositorio pagoRepositorio;
    private final IUsuarioRepositorio usuarioRepositorio;

    public CargaDatos(IPropietariosRepositorio propietariosRepositorio,
                      IInmueblesRepositorio inmueblesRepositorio,
                      IInquilinosRepositorio inquilinosRepositorio,
                      IContratoDeArrrendoRepositorio contratoRepositorio,
                      IPagoArrrendoRepositorio pagoRepositorio,
                      IUsuarioRepositorio usuarioRepositorio) {
        this.propietariosRepositorio = propietariosRepositorio;
        this.inmueblesRepositorio = inmueblesRepositorio;
        this.inquilinosRepositorio = inquilinosRepositorio;
        this.contratoRepositorio = contratoRepositorio;
        this.pagoRepositorio = pagoRepositorio;
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public void run(String... argumentos) {

        // Usuarios
        usuarioRepositorio.saveAll(List.of(
            new Usuario("Admin Sistema", TipoDocumento.Cedula, "1000000001", 35),
            new Usuario("Laura Gómez", TipoDocumento.Cedula, "1000000002", 28)
        ));

        // Propietarios
        Propietarios p1 = propietariosRepositorio.save(
            new Propietarios("Carlos Méndez", "carlos@email.com", "3001234567"));
        Propietarios p2 = propietariosRepositorio.save(
            new Propietarios("Ana Ríos", "ana@email.com", "3109876543"));
        Propietarios p3 = propietariosRepositorio.save(
            new Propietarios("Jorge Vargas", "jorge@email.com", "3205551234"));

        // Inmuebles
        Inmuebles i1 = inmueblesRepositorio.save(
            new Inmuebles("Calle 10 # 5-20, Medellín", "Apartamento", 2, 1, 55.0,
                "Apto luminoso en el centro", p1.getIdPropietarios()));
        Inmuebles i2 = inmueblesRepositorio.save(
            new Inmuebles("Carrera 70 # 45-30, Medellín", "Casa", 4, 3, 120.0,
                "Casa amplia con jardín", p1.getIdPropietarios()));
        Inmuebles i3 = inmueblesRepositorio.save(
            new Inmuebles("Av. El Poblado # 15-10, Medellín", "Apartamento", 3, 2, 80.0,
                "Apto moderno en El Poblado", p2.getIdPropietarios()));
        Inmuebles i4 = inmueblesRepositorio.save(
            new Inmuebles("Calle 80 # 32-15, Medellín", "Local", 0, 1, 40.0,
                "Local comercial con vitrina", p3.getIdPropietarios()));

        // Inquilinos
        Inquilinos iq1 = inquilinosRepositorio.save(
            new Inquilinos("María Torres", "maria@email.com", "3151112233"));
        Inquilinos iq2 = inquilinosRepositorio.save(
            new Inquilinos("Pedro Salazar", "pedro@email.com", "3162223344"));
        Inquilinos iq3 = inquilinosRepositorio.save(
            new Inquilinos("Valentina Cruz", "valentina@email.com", "3173334455"));

        // Contratos de arriendo
        ContratoDeArriendo c1 = contratoRepositorio.save(
            new ContratoDeArriendo(LocalDate.of(2026, 1, 1), LocalDate.of(2026, 12, 31),
                1200000.0, i1.getIdInmueble(), iq1.getIdInquilinos()));
        ContratoDeArriendo c2 = contratoRepositorio.save(
            new ContratoDeArriendo(LocalDate.of(2026, 2, 1), LocalDate.of(2027, 1, 31),
                2500000.0, i3.getIdInmueble(), iq2.getIdInquilinos()));

        // Pagos de arriendo
        pagoRepositorio.saveAll(List.of(
            new PagoArriendo(c1.getIdContratoArriendo(), LocalDate.of(2026, 1, 5),  "Enero",   1200000.0),
            new PagoArriendo(c1.getIdContratoArriendo(), LocalDate.of(2026, 2, 4),  "Febrero", 1200000.0),
            new PagoArriendo(c1.getIdContratoArriendo(), LocalDate.of(2026, 3, 3),  "Marzo",   1200000.0),
            new PagoArriendo(c2.getIdContratoArriendo(), LocalDate.of(2026, 2, 5),  "Febrero", 2500000.0),
            new PagoArriendo(c2.getIdContratoArriendo(), LocalDate.of(2026, 3, 6),  "Marzo",   2500000.0)
        ));

        System.out.println("✅ Datos de prueba cargados correctamente - Urbans Homes");
    }
}

package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import NEOAPI.Urbans.Homes.Modelos.Inmuebles;
import NEOAPI.Urbans.Homes.repositorios.IInmueblesRepositorio;

@Service
public class InmueblesServicio {

    @Autowired
    private IInmueblesRepositorio repositorio;

    public Inmuebles guardar_inmueble(Inmuebles datosInmueble) {
        if (datosInmueble.getDireccion() == null || datosInmueble.getDireccion().isEmpty() || 
            datosInmueble.getDireccion().isBlank()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "La dirección del inmueble es obligatoria"
            );
        }

        if (datosInmueble.getTipoDePropiedad() == null || datosInmueble.getTipoDePropiedad().isEmpty() || 
            datosInmueble.getTipoDePropiedad().isBlank()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "El tipo de propiedad es obligatorio"
            );
        }

        return repositorio.save(datosInmueble);
    }

    public List<Inmuebles> listar_inmuebles() {
        return repositorio.findAll();
    }

    public Inmuebles modificar_inmueble(Integer id, Inmuebles datosInmueble) {
        Inmuebles inmuebleExistente = repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Inmueble no encontrado"));
        
        if (datosInmueble.getDireccion() != null && !datosInmueble.getDireccion().isBlank()) {
            inmuebleExistente.setDireccion(datosInmueble.getDireccion());
        }
        if (datosInmueble.getTipoDePropiedad() != null && !datosInmueble.getTipoDePropiedad().isBlank()) {
            inmuebleExistente.setTipoDePropiedad(datosInmueble.getTipoDePropiedad());
        }
        if (datosInmueble.getAreaM2() > 0) {
            inmuebleExistente.setAreaM2(datosInmueble.getAreaM2());
        }
        
        return repositorio.save(inmuebleExistente);
    }

    public String eliminar_inmueble(Integer id) {
        if (!repositorio.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Inmueble no encontrado");
        }
        repositorio.deleteById(id);
        return "Inmueble eliminado correctamente";
    }

    public Inmuebles buscar_inmueble_por_id(Integer id) {
        return repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Inmueble no encontrado"));
    }

}

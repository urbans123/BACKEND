package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import NEOAPI.Urbans.Homes.Modelos.Propietarios;
import NEOAPI.Urbans.Homes.repositorios.IPropietariosRepositorio;

@Service
public class PropietariosServicio {

    @Autowired
    private IPropietariosRepositorio repositorio;

    public Propietarios guardar_propietario(Propietarios datosPropietario) {
        if (datosPropietario.getNombreComp() == null || datosPropietario.getNombreComp().isEmpty() || 
            datosPropietario.getNombreComp().isBlank()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "El nombre del propietario es obligatorio"
            );
        }

        if (datosPropietario.getCorreo() == null || datosPropietario.getCorreo().isEmpty() || 
            datosPropietario.getCorreo().isBlank()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "El correo del propietario es obligatorio"
            );
        }

        return repositorio.save(datosPropietario);
    }

    public List<Propietarios> listar_propietarios() {
        return repositorio.findAll();
    }

    public Propietarios modificar_propietario(Integer id, Propietarios datosPropietario) {
        Propietarios propietarioExistente = repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Propietario no encontrado"));
        
        if (datosPropietario.getNombreComp() != null && !datosPropietario.getNombreComp().isBlank()) {
            propietarioExistente.setNombreComp(datosPropietario.getNombreComp());
        }
        if (datosPropietario.getCorreo() != null && !datosPropietario.getCorreo().isBlank()) {
            propietarioExistente.setCorreo(datosPropietario.getCorreo());
        }
        if (datosPropietario.getNotel() != null && !datosPropietario.getNotel().isBlank()) {
            propietarioExistente.setNotel(datosPropietario.getNotel());
        }
        
        return repositorio.save(propietarioExistente);
    }

    public String eliminar_propietario(Integer id) {
        if (!repositorio.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Propietario no encontrado");
        }
        repositorio.deleteById(id);
        return "Propietario eliminado correctamente";
    }

    public Propietarios buscar_propietario_por_id(Integer id) {
        return repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Propietario no encontrado"));
    }

}

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

}

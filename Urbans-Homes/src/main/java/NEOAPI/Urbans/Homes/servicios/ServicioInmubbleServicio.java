package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import NEOAPI.Urbans.Homes.Modelos.ServicioInmuble;
import NEOAPI.Urbans.Homes.repositorios.IServicioInmubbleRepositorio;

@Service
public class ServicioInmubbleServicio {

    @Autowired
    private IServicioInmubbleRepositorio repositorio;

    public ServicioInmuble guardar_servicio_inmueble(ServicioInmuble datosServicio) {
        return repositorio.save(datosServicio);
    }

    public List<ServicioInmuble> listar_servicios_inmueble() {
        return repositorio.findAll();
    }

    public ServicioInmuble modificar_servicio_inmueble(Integer id, ServicioInmuble datosServicio) {
        ServicioInmuble servicioExistente = repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Servicio no encontrado"));
        
        if (datosServicio.getIdServicio() > 0) {
            servicioExistente.setIdServicio(datosServicio.getIdServicio());
        }
        if (datosServicio.getIdContrato() > 0) {
            servicioExistente.setIdContrato(datosServicio.getIdContrato());
        }
        
        return repositorio.save(servicioExistente);
    }

    public String eliminar_servicio_inmueble(Integer id) {
        if (!repositorio.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Servicio no encontrado");
        }
        repositorio.deleteById(id);
        return "Servicio eliminado correctamente";
    }

    public ServicioInmuble buscar_servicio_inmueble_por_id(Integer id) {
        return repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Servicio no encontrado"));
    }

}

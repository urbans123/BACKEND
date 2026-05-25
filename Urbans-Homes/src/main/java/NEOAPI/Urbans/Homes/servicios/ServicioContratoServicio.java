package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import NEOAPI.Urbans.Homes.Modelos.ServicioContrato;
import NEOAPI.Urbans.Homes.repositorios.IServicioContratoRepositorio;

@Service
public class ServicioContratoServicio {

    @Autowired
    private IServicioContratoRepositorio repositorio;

    public ServicioContrato guardar_servicio_contrato(ServicioContrato datosServicio) {
        return repositorio.save(datosServicio);
    }

    public List<ServicioContrato> listar_servicios_contrato() {
        return repositorio.findAll();
    }

    public ServicioContrato modificar_servicio_contrato(Integer id, ServicioContrato datosServicio) {
        ServicioContrato servicioExistente = repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Servicio no encontrado"));
        
        if (datosServicio.getIdServicio() > 0) {
            servicioExistente.setIdServicio(datosServicio.getIdServicio());
        }
        if (datosServicio.getIdContrato() > 0) {
            servicioExistente.setIdContrato(datosServicio.getIdContrato());
        }
        
        return repositorio.save(servicioExistente);
    }

    public String eliminar_servicio_contrato(Integer id) {
        if (!repositorio.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Servicio no encontrado");
        }
        repositorio.deleteById(id);
        return "Servicio eliminado correctamente";
    }

    public ServicioContrato buscar_servicio_contrato_por_id(Integer id) {
        return repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Servicio no encontrado"));
    }

}

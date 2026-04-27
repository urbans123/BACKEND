package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}

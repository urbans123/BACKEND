package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}

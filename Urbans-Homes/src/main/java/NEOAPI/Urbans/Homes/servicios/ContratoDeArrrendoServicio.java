package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import NEOAPI.Urbans.Homes.Modelos.ContratoDeArriendo;
import NEOAPI.Urbans.Homes.repositorios.IContratoDeArrrendoRepositorio;

@Service
public class ContratoDeArrrendoServicio {

    @Autowired
    private IContratoDeArrrendoRepositorio repositorio;

    public ContratoDeArriendo guardar_contrato(ContratoDeArriendo datosContrato) {
        if (datosContrato.getValorCanon() <= 0) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "El valor del canon debe ser mayor a cero"
            );
        }

        if (datosContrato.getFechaInicio() == null) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "La fecha de inicio del contrato es obligatoria"
            );
        }

        return repositorio.save(datosContrato);
    }

    public List<ContratoDeArriendo> listar_contratos() {
        return repositorio.findAll();
    }

}

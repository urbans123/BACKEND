package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import NEOAPI.Urbans.Homes.Modelos.Inquilinos;
import NEOAPI.Urbans.Homes.repositorios.IInquilinosRepositorio;

@Service
public class InquilinosServicio {

    @Autowired
    private IInquilinosRepositorio repositorio;

    public Inquilinos guardar_inquilino(Inquilinos datosInquilino) {
        if (datosInquilino.getNombreComple() == null || datosInquilino.getNombreComple().isEmpty() || 
            datosInquilino.getNombreComple().isBlank()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "El nombre del inquilino es obligatorio"
            );
        }

        if (datosInquilino.getCorreo() == null || datosInquilino.getCorreo().isEmpty() || 
            datosInquilino.getCorreo().isBlank()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "El correo del inquilino es obligatorio"
            );
        }

        return repositorio.save(datosInquilino);
    }

    public List<Inquilinos> listar_inquilinos() {
        return repositorio.findAll();
    }

}

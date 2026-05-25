package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import NEOAPI.Urbans.Homes.Modelos.PagoArriendo;
import NEOAPI.Urbans.Homes.repositorios.IPagoArrrendoRepositorio;

@Service
public class PagoArrrendoServicio {

    @Autowired
    private IPagoArrrendoRepositorio repositorio;

    public PagoArriendo guardar_pago(PagoArriendo datosPago) {
        if (datosPago.getValorPago() <= 0) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "El valor del pago debe ser mayor a cero"
            );
        }

        if (datosPago.getFechaPago() == null) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "La fecha del pago es obligatoria"
            );
        }

        return repositorio.save(datosPago);
    }

    public List<PagoArriendo> listar_pagos() {
        return repositorio.findAll();
    }

    public PagoArriendo modificar_pago(Integer id, PagoArriendo datosPago) {
        PagoArriendo pagoExistente = repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pago no encontrado"));
        
        if (datosPago.getValorPago() > 0) {
            pagoExistente.setValorPago(datosPago.getValorPago());
        }
        if (datosPago.getFechaPago() != null) {
            pagoExistente.setFechaPago(datosPago.getFechaPago());
        }
        if (datosPago.getMesArriendo() != null && !datosPago.getMesArriendo().isBlank()) {
            pagoExistente.setMesArriendo(datosPago.getMesArriendo());
        }
        
        return repositorio.save(pagoExistente);
    }

    public String eliminar_pago(Integer id) {
        if (!repositorio.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pago no encontrado");
        }
        repositorio.deleteById(id);
        return "Pago eliminado correctamente";
    }

    public PagoArriendo buscar_pago_por_id(Integer id) {
        return repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pago no encontrado"));
    }

}

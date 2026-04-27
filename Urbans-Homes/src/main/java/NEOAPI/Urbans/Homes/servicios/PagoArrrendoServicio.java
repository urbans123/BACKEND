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

}

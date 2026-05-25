package NEOAPI.Urbans.Homes.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import NEOAPI.Urbans.Homes.Modelos.PagoArriendo;
import NEOAPI.Urbans.Homes.servicios.PagoArrrendoServicio;


@RestController
@RequestMapping("/api/v1/pagos")
public class ControladorPagoArriedo {

    @Autowired
    PagoArrrendoServicio servicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody PagoArriendo datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardar_pago(datos));
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.listar_pagos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@PathVariable Integer id, @RequestBody PagoArriendo datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.modificar_pago(id, datos));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminar_pago(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.buscar_pago_por_id(id));
    }
}

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

import NEOAPI.Urbans.Homes.Modelos.ServicioContrato;
import NEOAPI.Urbans.Homes.servicios.ServicioContratoServicio;


@RestController
@RequestMapping("/api/v1/servicios-contratos")
public class ControladorServicioContrato {

    @Autowired
    ServicioContratoServicio servicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody ServicioContrato datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardar_servicio_contrato(datos));
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.listar_servicios_contrato());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@PathVariable Integer id, @RequestBody ServicioContrato datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.modificar_servicio_contrato(id, datos));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminar_servicio_contrato(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.buscar_servicio_contrato_por_id(id));
    }
}

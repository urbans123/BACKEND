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

import NEOAPI.Urbans.Homes.Modelos.Inquilinos;
import NEOAPI.Urbans.Homes.servicios.InquilinosServicio;


@RestController
@RequestMapping("/api/v1/inquilinos")
public class ControladorInquilinos {

    @Autowired
    InquilinosServicio servicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Inquilinos datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardar_inquilino(datos));
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.listar_inquilinos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@PathVariable Integer id, @RequestBody Inquilinos datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.modificar_inquilino(id, datos));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminar_inquilino(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.buscar_inquilino_por_id(id));
    }
}

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

import NEOAPI.Urbans.Homes.Modelos.Propietarios;
import NEOAPI.Urbans.Homes.servicios.PropietariosServicio;


@RestController
@RequestMapping("/api/v1/propietarios")
public class ControladorPropietarios {

    @Autowired
    PropietariosServicio servicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Propietarios datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardar_propietario(datos));
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.listar_propietarios());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@PathVariable Integer id, @RequestBody Propietarios datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.modificar_propietario(id, datos));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminar_propietario(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.buscar_propietario_por_id(id));
    }
}

package NEOAPI.Urbans.Homes.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NEOAPI.Urbans.Homes.Modelos.Usuario;
import NEOAPI.Urbans.Homes.servicios.UsuarioServicio;


@RestController
@RequestMapping("/apineoapp/v1/usuarios")
public class ControladorUsuario {


    @Autowired
    UsuarioServicio servicio;

    //Por cada servicio programa un metodo
    //para recibir y enviar respuestas al cliente

    // Funcion controlador para el servicio de guardar usuario
    public ResponseEntity<?> ControladorGuardar(@RequestBody Usuario datos){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.guardar_usuario(datos)
        );
    }

    //Funcion controladora para el servicio del listar todos los usuarios
    public ResponseEntity<?> ControladorListar(){
     return ResponseEntity.status(HttpStatus.OK).body(
        servicio.listar_usuarios()
     );
     }

}

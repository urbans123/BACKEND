package NEOAPI.Urbans.Homes.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import NEOAPI.Urbans.Homes.Modelos.Usuario;
import NEOAPI.Urbans.Homes.repositorios.IUsuarioRepositorio;

@Service
public class UsuarioServicio {

    //Inyectando la dependencia al repositorio Usuario
    @Autowired
    private IUsuarioRepositorio repositorio;

    //Se programa una funcion por cada servicio que voy a ofrecer


    //funcion para guardar un usuario
    public Usuario guardar_usuario(Usuario datosUsuario){
        //validar los campos del modelo segun la LN

        //validar que el usuario me mande sus nombres
        if(datosUsuario.getNombres()==null || datosUsuario.getNombres().isEmpty() || datosUsuario.getNombres().isBlank()){
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Apreciado usuario, el nombre de usuario es obligatorio"
            );

        }

        //valdiar documento tenga al menos 6 caracteres
        if(datosUsuario.getDocumento().length()<6){
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Apreciado usuario, el documento debe tener mas de 6 caracteres"
            );

        }

        //Si paso todas las validaciones
        //intentare activar el guardado de los datos
        return repositorio.save(datosUsuario);

    }

    //funcion para listar todos los usuarios

    public List<Usuario> listar_usuarios(){
        return repositorio.findAll();
    }

    //funcion para modificar un usuario
    public Usuario modificar_usuario(Integer id, Usuario datosUsuario){
        Usuario usuarioExistente = repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
        
        if(datosUsuario.getNombres() != null && !datosUsuario.getNombres().isBlank()){
            usuarioExistente.setNombres(datosUsuario.getNombres());
        }
        if(datosUsuario.getDocumento() != null && datosUsuario.getDocumento().length() >= 6){
            usuarioExistente.setDocumento(datosUsuario.getDocumento());
        }
        if(datosUsuario.getEdad() != null){
            usuarioExistente.setEdad(datosUsuario.getEdad());
        }
        
        return repositorio.save(usuarioExistente);
    }

    //funcion para eliminar un usuario
    public String eliminar_usuario(Integer id){
        if(!repositorio.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado");
        }
        repositorio.deleteById(id);
        return "Usuario eliminado correctamente";
    }

    //funcion para buscar un usuario por id
    public Usuario buscar_usuario_por_id(Integer id){
        return repositorio.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
    }

}

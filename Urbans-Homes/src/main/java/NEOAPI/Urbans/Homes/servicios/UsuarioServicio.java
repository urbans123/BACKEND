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

    //funcion para eliminar un usuario

    //funcion para buscar un usuario por id

    //


}

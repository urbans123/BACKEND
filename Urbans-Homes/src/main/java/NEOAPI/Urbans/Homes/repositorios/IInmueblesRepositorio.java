package NEOAPI.Urbans.Homes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NEOAPI.Urbans.Homes.Modelos.Inmuebles;


@Repository
public interface IInmueblesRepositorio extends JpaRepository<Inmuebles, Integer> {

    List<Inmuebles> findByDireccion(String direccion);

    List<Inmuebles> findByTipoDePropiedad(String tipoDePropiedad);

    List<Inmuebles> findByIdPropietarios(int idPropietarios);

}

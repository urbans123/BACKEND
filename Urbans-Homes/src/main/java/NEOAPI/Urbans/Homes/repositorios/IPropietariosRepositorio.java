package NEOAPI.Urbans.Homes.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NEOAPI.Urbans.Homes.Modelos.Propietarios;


@Repository
public interface IPropietariosRepositorio extends JpaRepository<Propietarios, Integer> {

    List<Propietarios> findByNombreComp(String nombreComp);

    Optional<Propietarios> findByCorreo(String correo);

    Optional<Propietarios> findByNotel(String notel);

}

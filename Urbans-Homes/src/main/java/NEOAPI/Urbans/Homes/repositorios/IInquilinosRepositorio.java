package NEOAPI.Urbans.Homes.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NEOAPI.Urbans.Homes.Modelos.Inquilinos;


@Repository
public interface IInquilinosRepositorio extends JpaRepository<Inquilinos, Integer> {

    List<Inquilinos> findByNombreComple(String nombreComple);

    Optional<Inquilinos> findByCorreo(String correo);

    Optional<Inquilinos> findByNrotel(String nrotel);

}

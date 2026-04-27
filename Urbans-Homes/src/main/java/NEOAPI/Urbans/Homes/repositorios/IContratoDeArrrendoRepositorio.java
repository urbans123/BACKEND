package NEOAPI.Urbans.Homes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NEOAPI.Urbans.Homes.Modelos.ContratoDeArriendo;


@Repository
public interface IContratoDeArrrendoRepositorio extends JpaRepository<ContratoDeArriendo, Integer> {

    List<ContratoDeArriendo> findByIdInmueble(int idInmueble);

    List<ContratoDeArriendo> findByIdInquilinos(int idInquilinos);

}

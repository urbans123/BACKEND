package NEOAPI.Urbans.Homes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NEOAPI.Urbans.Homes.Modelos.PagoArriendo;


@Repository
public interface IPagoArrrendoRepositorio extends JpaRepository<PagoArriendo, Integer> {

    List<PagoArriendo> findByIdContratoArriendo(int idContratoArriendo);

    List<PagoArriendo> findByMesArriendo(String mesArriendo);

}

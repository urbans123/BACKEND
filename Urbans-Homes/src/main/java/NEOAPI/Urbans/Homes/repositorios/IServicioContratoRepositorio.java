package NEOAPI.Urbans.Homes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NEOAPI.Urbans.Homes.Modelos.ServicioContrato;


@Repository
public interface IServicioContratoRepositorio extends JpaRepository<ServicioContrato, Integer> {

    List<ServicioContrato> findByIdServicio(int idServicio);

    List<ServicioContrato> findByIdContrato(int idContrato);

}

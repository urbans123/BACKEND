package NEOAPI.Urbans.Homes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NEOAPI.Urbans.Homes.Modelos.ServicioInmuble;


@Repository
public interface IServicioInmubbleRepositorio extends JpaRepository<ServicioInmuble, Integer> {

    List<ServicioInmuble> findByIdServicio(int idServicio);

    List<ServicioInmuble> findByIdContrato(int idContrato);

}

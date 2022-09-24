package co.uniquindio.unicine.repositorio;

import co.uniquindio.unicine.entidades.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuponRepositorio extends JpaRepository<Cupon,String> {
}

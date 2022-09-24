package co.uniquindio.unicine.repositorio;

import co.uniquindio.unicine.entidades.Teatro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeatroRepositorio extends JpaRepository<Teatro,String> {
}

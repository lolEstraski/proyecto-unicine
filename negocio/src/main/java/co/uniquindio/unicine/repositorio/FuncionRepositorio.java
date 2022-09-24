package co.uniquindio.unicine.repositorio;

import co.uniquindio.unicine.entidades.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionRepositorio extends JpaRepository<Funcion, String> {
}

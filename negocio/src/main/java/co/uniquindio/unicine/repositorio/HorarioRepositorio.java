package co.uniquindio.unicine.repositorio;

import co.uniquindio.unicine.entidades.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepositorio extends JpaRepository<Horario,String> {
}

package co.uniquindio.unicine.repositorio;

import co.uniquindio.unicine.entidades.Silla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SillaRepositorio extends JpaRepository<Silla, String> {
}

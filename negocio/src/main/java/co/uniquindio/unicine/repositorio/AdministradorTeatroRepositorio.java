package co.uniquindio.unicine.repositorio;

import co.uniquindio.unicine.entidades.AdministradorTeatro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorTeatroRepositorio extends JpaRepository<AdministradorTeatro,String> {
}

package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.angelogomez.hospital.restapi.infrastructure.entity.PacienteEntity;

public interface IPacienteCrudRepository extends JpaRepository<PacienteEntity, String> {
}

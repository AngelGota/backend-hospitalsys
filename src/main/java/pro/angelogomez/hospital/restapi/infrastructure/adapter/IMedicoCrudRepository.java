package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.angelogomez.hospital.restapi.infrastructure.entity.MedicoEntity;

public interface IMedicoCrudRepository extends JpaRepository<MedicoEntity, String> {
}

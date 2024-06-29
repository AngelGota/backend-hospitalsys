package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.angelogomez.hospital.restapi.infrastructure.entity.CitaEntity;

public interface ICitaCrudRepository extends JpaRepository<CitaEntity, Integer>{
}

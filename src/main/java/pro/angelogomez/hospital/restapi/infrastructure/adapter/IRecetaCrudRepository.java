package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.angelogomez.hospital.restapi.infrastructure.entity.RecetaEntity;

public interface IRecetaCrudRepository extends JpaRepository<RecetaEntity, String> {
}

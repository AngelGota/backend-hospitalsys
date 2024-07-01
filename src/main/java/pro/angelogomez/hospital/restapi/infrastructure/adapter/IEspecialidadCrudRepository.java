package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.angelogomez.hospital.restapi.infrastructure.entity.EspecialidadEntity;

public interface IEspecialidadCrudRepository extends JpaRepository<EspecialidadEntity, String>{
}

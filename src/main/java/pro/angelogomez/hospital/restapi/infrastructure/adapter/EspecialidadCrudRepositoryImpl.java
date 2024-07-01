package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Especialidad;
import pro.angelogomez.hospital.restapi.domain.port.IEspecialidadRepository;
@Repository
@AllArgsConstructor
public class EspecialidadCrudRepositoryImpl implements IEspecialidadRepository {

    private final IEspecialidadCrudRepository iEspecialidadCrudRepository;

    @Override
    public Especialidad save(Especialidad especialidad) {
        return null;
    }

    @Override
    public Iterable<Especialidad> findAll() {
        return null;
    }

    @Override
    public Especialidad findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}

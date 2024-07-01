package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Especialidad;
import pro.angelogomez.hospital.restapi.domain.port.IEspecialidadRepository;
import pro.angelogomez.hospital.restapi.infrastructure.mapper.EspecialidadMapper;

@Repository
@AllArgsConstructor
public class EspecialidadCrudRepositoryImpl implements IEspecialidadRepository {

    private final IEspecialidadCrudRepository iEspecialidadCrudRepository;
    private final EspecialidadMapper especialidadMapper;

    @Override
    public Especialidad save(Especialidad especialidad) {
        return especialidadMapper.toEspecialidad(iEspecialidadCrudRepository.save(especialidadMapper.toEspecialidadEntity(especialidad)));
    }

    @Override
    public Iterable<Especialidad> findAll() {
        return especialidadMapper.toEspecialidades(iEspecialidadCrudRepository.findAll());
    }

    @Override
    public Especialidad findById(String id) {
        return especialidadMapper.toEspecialidad(iEspecialidadCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID Especialidad: " +id+ " not found")
        ));
    }

    @Override
    public void deleteById(String id) {
        iEspecialidadCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID Especialidad: " +id+ " not found")
        );
        iEspecialidadCrudRepository.deleteById(id);
    }
}

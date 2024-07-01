package pro.angelogomez.hospital.restapi.application;

import lombok.AllArgsConstructor;
import pro.angelogomez.hospital.restapi.domain.model.Especialidad;
import pro.angelogomez.hospital.restapi.domain.port.IEspecialidadRepository;

@AllArgsConstructor
public class EspecialidadService {

    private final IEspecialidadRepository iEspecialidadRepository;

    public Especialidad save(Especialidad especialidad) {
        return iEspecialidadRepository.save(especialidad);
    }

    public Iterable<Especialidad> findAll() {
        return iEspecialidadRepository.findAll();
    }

    public Especialidad findById(String id) {
        return iEspecialidadRepository.findById(id);
    }

    public void deleteById(String id) {
        iEspecialidadRepository.deleteById(id);
    }
}

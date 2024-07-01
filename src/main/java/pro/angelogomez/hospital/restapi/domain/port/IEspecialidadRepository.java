package pro.angelogomez.hospital.restapi.domain.port;

import pro.angelogomez.hospital.restapi.domain.model.Especialidad;

public interface IEspecialidadRepository {

    Especialidad save(Especialidad especialidad);
    Iterable<Especialidad> findAll();
    Especialidad findById(Integer id);
    void deleteById(Integer id);
}

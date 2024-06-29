package pro.angelogomez.hospital.restapi.domain.port;

import pro.angelogomez.hospital.restapi.domain.model.Cita;

public interface ICitaRepository {
    Cita save(Cita cita);
    Iterable<Cita> findAll();
    Cita findById(Integer id);
    void deleteById(Integer id);
}

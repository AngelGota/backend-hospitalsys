package pro.angelogomez.hospital.restapi.domain.port;

import pro.angelogomez.hospital.restapi.domain.model.Medicina;

public interface IMedicinaRepository {
    Medicina save(Medicina medicina);
    Iterable<Medicina> findAll();
    Medicina findById(Integer id);
    void deleteById(Integer id);
}

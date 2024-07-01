package pro.angelogomez.hospital.restapi.domain.port;

import pro.angelogomez.hospital.restapi.domain.model.Receta;

public interface IRecetaRepository {
    Receta save(Receta receta);
    Iterable<Receta> findAll();
    Receta findById(String id);
    void deleteById(String id);
}

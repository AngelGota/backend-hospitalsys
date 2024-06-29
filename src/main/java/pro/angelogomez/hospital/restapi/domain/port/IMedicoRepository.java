package pro.angelogomez.hospital.restapi.domain.port;

import pro.angelogomez.hospital.restapi.domain.model.Medico;

public interface IMedicoRepository {
    Medico save(Medico medico);
    Iterable<Medico> findAll();
    Medico findById(Integer id);
    void deleteById(Integer id);
}

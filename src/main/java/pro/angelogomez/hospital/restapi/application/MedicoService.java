package pro.angelogomez.hospital.restapi.application;

import lombok.AllArgsConstructor;
import pro.angelogomez.hospital.restapi.domain.model.Medico;
import pro.angelogomez.hospital.restapi.domain.port.IMedicoRepository;

@AllArgsConstructor
public class MedicoService {

    private final IMedicoRepository iMedicoRepository;

    public Medico save(Medico medico) {
        return iMedicoRepository.save(medico);
    }

    public Medico findById(String id) {
        return iMedicoRepository.findById(id);
    }

    public Iterable<Medico> findAll() {
        return iMedicoRepository.findAll();
    }

    public void deleteById(String id) {
        iMedicoRepository.deleteById(id);
    }
}

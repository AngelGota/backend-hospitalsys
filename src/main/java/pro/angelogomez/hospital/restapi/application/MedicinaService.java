package pro.angelogomez.hospital.restapi.application;

import lombok.AllArgsConstructor;
import pro.angelogomez.hospital.restapi.domain.model.Medicina;
import pro.angelogomez.hospital.restapi.domain.port.IMedicinaRepository;

@AllArgsConstructor
public class MedicinaService {

    private final IMedicinaRepository iMedicinaRepository;

    public Medicina save(Medicina medicina) {
        return iMedicinaRepository.save(medicina);
    }

    public Iterable<Medicina> findAll() {
        return iMedicinaRepository.findAll();
    }

    public Medicina findById(String id) {
        return iMedicinaRepository.findById(Integer.valueOf(id));
    }

    public void deleteById(String id) {
        iMedicinaRepository.deleteById(Integer.valueOf(id));
    }
}

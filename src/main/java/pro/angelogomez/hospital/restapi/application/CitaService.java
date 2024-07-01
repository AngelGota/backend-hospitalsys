package pro.angelogomez.hospital.restapi.application;

import lombok.AllArgsConstructor;
import pro.angelogomez.hospital.restapi.domain.model.Cita;
import pro.angelogomez.hospital.restapi.domain.port.ICitaRepository;

@AllArgsConstructor
public class CitaService {

    private final ICitaRepository iCitaRepository;

    public Cita save(Cita cita) {
        return iCitaRepository.save(cita);
    }

    public Cita findById(String id) {
        return iCitaRepository.findById(id);
    }

    public Iterable<Cita> findAll() {
        return iCitaRepository.findAll();
    }

    public void deleteById(String id) {
        iCitaRepository.deleteById(id);
    }
}

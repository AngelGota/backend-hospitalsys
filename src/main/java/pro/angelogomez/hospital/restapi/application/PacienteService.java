package pro.angelogomez.hospital.restapi.application;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pro.angelogomez.hospital.restapi.domain.model.Paciente;
import pro.angelogomez.hospital.restapi.domain.port.IPacienteRepository;

@AllArgsConstructor
@Service
public class PacienteService {

    private final IPacienteRepository iPacienteRepository;

    public Paciente save(Paciente paciente) {
        return iPacienteRepository.save(paciente);
    }

    public Paciente findById(String id) {
        return iPacienteRepository.findById(Integer.valueOf(id));
    }

    public Iterable<Paciente> findAll() {
        return iPacienteRepository.findAll();
    }

    public void deleteById(String id) {
        iPacienteRepository.deleteById(Integer.valueOf(id));
    }
}

package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Paciente;
import pro.angelogomez.hospital.restapi.domain.port.IPacienteRepository;

@Repository
@AllArgsConstructor
public class PacienteCrudRepositoryImpl implements IPacienteRepository {

    private final IPacienteCrudRepository iPacienteCrudRepository;

    @Override
    public Paciente save(Paciente paciente) {
        return null;
    }

    @Override
    public Iterable<Paciente> findAll() {
        return null;
    }

    @Override
    public Paciente findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

}

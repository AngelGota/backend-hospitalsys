package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Paciente;
import pro.angelogomez.hospital.restapi.domain.port.IPacienteRepository;
import pro.angelogomez.hospital.restapi.infrastructure.mapper.PacienteMapper;

@Repository
@AllArgsConstructor
public class PacienteCrudRepositoryImpl implements IPacienteRepository {

    private final IPacienteCrudRepository iPacienteCrudRepository;
    private final PacienteMapper pacienteMapper;

    @Override
    public Paciente save(Paciente paciente) {
        return pacienteMapper.toPaciente(iPacienteCrudRepository.save(pacienteMapper.toPacienteEntity(paciente)));
    }

    @Override
    public Iterable<Paciente> findAll() {
        return pacienteMapper.toPacientes(iPacienteCrudRepository.findAll());
    }

    @Override
    public Paciente findById(Integer id) {
        return pacienteMapper.toPaciente(iPacienteCrudRepository.findById(String.valueOf(id)).orElseThrow(
                () -> new RuntimeException("ID Paciente: " +id+ " not found")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iPacienteCrudRepository.findById(String.valueOf(id)).orElseThrow(
                () -> new RuntimeException("ID Paciente: " +id+ " not found")
        );
        iPacienteCrudRepository.deleteById(String.valueOf(id));
    }

}

package pro.angelogomez.hospital.restapi.domain.port;

import pro.angelogomez.hospital.restapi.domain.model.Paciente;

public interface IPacienteRepository {
    Paciente save(Paciente paciente);
    Iterable<Paciente> findAll();
    Paciente findById(String id);
    void deleteById(String id);
}

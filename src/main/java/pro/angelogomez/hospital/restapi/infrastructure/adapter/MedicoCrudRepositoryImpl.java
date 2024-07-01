package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Medico;
import pro.angelogomez.hospital.restapi.domain.port.IMedicoRepository;
import pro.angelogomez.hospital.restapi.infrastructure.mapper.MedicoMapper;

@Repository
@AllArgsConstructor
public class MedicoCrudRepositoryImpl implements IMedicoRepository {

    private final IMedicoCrudRepository iMedicoCrudRepository;
    private final MedicoMapper medicoMapper;

    @Override
    public Medico save(Medico medico) {
        return medicoMapper.toMedico(iMedicoCrudRepository.save(medicoMapper.toMedicoEntity(medico)));
    }

    @Override
    public Iterable<Medico> findAll() {
        return medicoMapper.toMedicos(iMedicoCrudRepository.findAll());
    }

    @Override
    public Medico findById(String id) {
        return medicoMapper.toMedico(iMedicoCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID Medico: " +id+ " not found")
        ));
    }

    @Override
    public void deleteById(String id) {
        iMedicoCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID Medico: " +id+ " not found")
        );
        iMedicoCrudRepository.deleteById(id);
    }
}

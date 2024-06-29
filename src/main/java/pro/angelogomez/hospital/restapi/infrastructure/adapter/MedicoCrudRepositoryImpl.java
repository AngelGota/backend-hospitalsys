package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Medico;
import pro.angelogomez.hospital.restapi.domain.port.IMedicoRepository;

@Repository
@AllArgsConstructor
public class MedicoCrudRepositoryImpl implements IMedicoRepository {

    private final IMedicoCrudRepository iMedicoCrudRepository;

    @Override
    public Medico save(Medico medico) {
        return null;
    }

    @Override
    public Iterable<Medico> findAll() {
        return null;
    }

    @Override
    public Medico findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}

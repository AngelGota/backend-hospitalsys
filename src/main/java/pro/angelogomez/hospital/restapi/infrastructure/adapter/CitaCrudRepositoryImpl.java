package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Cita;
import pro.angelogomez.hospital.restapi.domain.port.ICitaRepository;

@Repository
@AllArgsConstructor
public class CitaCrudRepositoryImpl implements ICitaRepository {

    private final ICitaCrudRepository iCitaCrudRepository;

    @Override
    public Cita save(Cita cita) {
        return null;
    }

    @Override
    public Iterable<Cita> findAll() {
        return null;
    }

    @Override
    public Cita findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}

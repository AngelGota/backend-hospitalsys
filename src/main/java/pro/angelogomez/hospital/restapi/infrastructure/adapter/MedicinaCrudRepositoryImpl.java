package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Medicina;
import pro.angelogomez.hospital.restapi.domain.port.IMedicinaRepository;

@Repository
@AllArgsConstructor
public class MedicinaCrudRepositoryImpl implements IMedicinaRepository {

    private final IMedicinaCrudRepository iMedicinaCrudRepository;

    @Override
    public Medicina save(Medicina medicina) {
        return null;
    }

    @Override
    public Iterable<Medicina> findAll() {
        return null;
    }

    @Override
    public Medicina findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}

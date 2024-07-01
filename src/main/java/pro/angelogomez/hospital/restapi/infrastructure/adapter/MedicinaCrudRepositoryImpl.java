package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Medicina;
import pro.angelogomez.hospital.restapi.domain.port.IMedicinaRepository;
import pro.angelogomez.hospital.restapi.infrastructure.mapper.MedicinaMapper;

@Repository
@AllArgsConstructor
public class MedicinaCrudRepositoryImpl implements IMedicinaRepository {

    private final IMedicinaCrudRepository iMedicinaCrudRepository;
    private final MedicinaMapper medicinaMapper;

    @Override
    public Medicina save(Medicina medicina) {
        return medicinaMapper.toMedicina(iMedicinaCrudRepository.save(medicinaMapper.toMedicinaEntity(medicina)));
    }

    @Override
    public Iterable<Medicina> findAll() {
        return medicinaMapper.toMedicinas(iMedicinaCrudRepository.findAll());
    }

    @Override
    public Medicina findById(Integer id) {
        return medicinaMapper.toMedicina(iMedicinaCrudRepository.findById(String.valueOf(id)).orElseThrow(
                () -> new RuntimeException("ID Medicina: " +id+ " not found")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iMedicinaCrudRepository.findById(String.valueOf(id)).orElseThrow(
                () -> new RuntimeException("ID Medicina: " +id+ " not found")
        );
        iMedicinaCrudRepository.deleteById(String.valueOf(id));
    }
}

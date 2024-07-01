package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Cita;
import pro.angelogomez.hospital.restapi.domain.port.ICitaRepository;
import pro.angelogomez.hospital.restapi.infrastructure.mapper.CitaMapper;

@Repository
@AllArgsConstructor
public class CitaCrudRepositoryImpl implements ICitaRepository {

    private final ICitaCrudRepository iCitaCrudRepository;
    private final CitaMapper citaMapper;

    @Override
    public Cita save(Cita cita) {
        return citaMapper.toCita(iCitaCrudRepository.save(citaMapper.toCitaEntity(cita)));
    }

    @Override
    public Iterable<Cita> findAll() {
        return citaMapper.toCitas(iCitaCrudRepository.findAll());
    }

    @Override
    public Cita findById(String id) {
        return citaMapper.toCita(iCitaCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID Cita: " +id+ " not found")
        ));
    }

    @Override
    public void deleteById(String id) {
        iCitaCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID Cita: " +id+ " not found")
        );
        iCitaCrudRepository.deleteById(id);
    }
}

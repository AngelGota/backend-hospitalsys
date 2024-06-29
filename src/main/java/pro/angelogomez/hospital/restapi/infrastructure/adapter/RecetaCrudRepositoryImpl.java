package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Receta;
import pro.angelogomez.hospital.restapi.domain.port.IRecetaRepository;

@Repository
@AllArgsConstructor
public class RecetaCrudRepositoryImpl implements IRecetaRepository {

    private final IRecetaCrudRepository iRecetaCrudRepository;
    @Override
    public Receta save(Receta receta) {
        return null;
    }

    @Override
    public Iterable<Receta> findAll() {
        return null;
    }

    @Override
    public Receta findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}

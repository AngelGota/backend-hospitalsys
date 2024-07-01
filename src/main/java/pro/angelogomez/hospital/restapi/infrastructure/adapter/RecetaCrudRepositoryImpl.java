package pro.angelogomez.hospital.restapi.infrastructure.adapter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pro.angelogomez.hospital.restapi.domain.model.Receta;
import pro.angelogomez.hospital.restapi.domain.port.IRecetaRepository;
import pro.angelogomez.hospital.restapi.infrastructure.mapper.RecetaMapper;

@Repository
@AllArgsConstructor
public class RecetaCrudRepositoryImpl implements IRecetaRepository {

    private final IRecetaCrudRepository iRecetaCrudRepository;
    private final RecetaMapper recetaMapper;
    @Override
    public Receta save(Receta receta) {
        return recetaMapper.toReceta(iRecetaCrudRepository.save(recetaMapper.toRecetaEntity(receta)));
    }

    @Override
    public Iterable<Receta> findAll() {
        return recetaMapper.toRecetas(iRecetaCrudRepository.findAll());
    }

    @Override
    public Receta findById(String id) {
        return recetaMapper.toReceta(iRecetaCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID Receta: " +id+ " not found")
        ));
    }

    @Override
    public void deleteById(String id) {
        iRecetaCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID Receta: " +id+ " not found")
        );
        iRecetaCrudRepository.deleteById(id);
    }
}

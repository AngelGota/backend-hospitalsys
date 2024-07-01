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
    public Receta findById(Integer id) {
        return recetaMapper.toReceta(iRecetaCrudRepository.findById(String.valueOf(id)).orElseThrow(
                () -> new RuntimeException("ID Receta: " +id+ " not found")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iRecetaCrudRepository.findById(String.valueOf(id)).orElseThrow(
                () -> new RuntimeException("ID Receta: " +id+ " not found")
        );
        iRecetaCrudRepository.deleteById(String.valueOf(id));
    }
}

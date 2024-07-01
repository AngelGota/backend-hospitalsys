package pro.angelogomez.hospital.restapi.application;

import lombok.AllArgsConstructor;
import pro.angelogomez.hospital.restapi.domain.model.Receta;
import pro.angelogomez.hospital.restapi.domain.port.IRecetaRepository;

@AllArgsConstructor
public class RecetaService {

    private final IRecetaRepository iRecetaRepository;

    public Receta save(Receta receta) {
        return iRecetaRepository.save(receta);
    }

    public Receta findById(String id) {
        return iRecetaRepository.findById(Integer.valueOf(id));
    }

    public Iterable<Receta> findAll() {
        return iRecetaRepository.findAll();
    }

    public void deleteById(String id) {
        iRecetaRepository.deleteById(Integer.valueOf(id));
    }
}

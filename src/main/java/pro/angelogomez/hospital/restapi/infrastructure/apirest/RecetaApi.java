package pro.angelogomez.hospital.restapi.infrastructure.apirest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.angelogomez.hospital.restapi.application.RecetaService;
import pro.angelogomez.hospital.restapi.domain.model.Receta;
import pro.angelogomez.hospital.restapi.infrastructure.handler.PayloadReceta;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recetas")
@AllArgsConstructor
@Tag(name = "Receta", description = "Receta API")
public class RecetaApi {

    private final RecetaService recetaService;

    @Operation(summary = "Listado de recetas", description = "Listado de todos los recetas", tags = { "Receta" })
    @GetMapping
    public ResponseEntity<?> findAll() {
        Iterable<Receta> getRecetas = recetaService.findAll();
        PayloadReceta response = null;
        try {
            if (((List<Receta>) getRecetas).isEmpty()) {
                response = new PayloadReceta("No hay recetas registradas", null);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response = new PayloadReceta("Recetas encontradas", getRecetas);
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            response = new PayloadReceta("Error al obtener las recetas", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

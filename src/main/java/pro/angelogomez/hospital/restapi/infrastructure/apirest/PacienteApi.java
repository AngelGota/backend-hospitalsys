package pro.angelogomez.hospital.restapi.infrastructure.apirest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.angelogomez.hospital.restapi.application.PacienteService;
import pro.angelogomez.hospital.restapi.domain.model.Paciente;
import pro.angelogomez.hospital.restapi.infrastructure.handler.PayloadPaciente;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pacientes") // http://localhost:2609/api/v1/pacientes
@AllArgsConstructor
@Tag(name = "Paciente", description = "Paciente API")
public class PacienteApi {

    private final PacienteService pacienteService;
    @Operation(summary = "Listado de pacientes", description = "Listado de todos los pacientes", tags = { "Paciente" })
    @GetMapping
    public ResponseEntity<?> findAll() {
        Iterable<Paciente> getPacientes = pacienteService.findAll();
        PayloadPaciente response = null;
        try {
            if (((List<Paciente>) getPacientes).isEmpty()) {
                response = new PayloadPaciente("No hay pacientes registrados", null);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response = new PayloadPaciente("Pacientes encontrados", getPacientes);
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            response = new PayloadPaciente("Error al obtener los pacientes", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @Operation(summary = "Buscar por ID", description = "Busqueda de pacientes por ID", tags = { "Paciente" })
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Paciente paciente = pacienteService.findById(id);
        PayloadPaciente response = null;
        try {
            if (paciente == null) {
                response = new PayloadPaciente("Paciente no encontrado", null);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response = new PayloadPaciente("Paciente encontrado", paciente);
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            response = new PayloadPaciente("Error al obtener el paciente", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Creacion de paciente", description = "Endpoint para creacion de paciente por ID.", tags = { "Paciente" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Paciente creado", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = PayloadPaciente.class)),
                    @Content(mediaType = "application/xml", schema = @Schema(implementation = PayloadPaciente.class))
            }),
            @ApiResponse(responseCode = "404", description = "Mensaje: Paciente no encontrado", content = @Content),
            @ApiResponse(responseCode = "500", description = "Mensaje: Error interno del servidor", content = @Content)
    })
    @PostMapping(value ="/register", consumes = { "application/json", "application/x-www-form-urlencoded" })
    public ResponseEntity<?> save(@RequestBody Paciente paciente) {
        Paciente newPaciente = pacienteService.save(paciente);
        PayloadPaciente response = null;
        try {
            if (newPaciente == null) {
                response = new PayloadPaciente("Error al registrar el paciente", null);
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            } else {
                response = new PayloadPaciente("Paciente registrado", newPaciente);
                return new ResponseEntity<>(newPaciente, HttpStatus.CREATED);
            }
        } catch (Exception e) {
            response = new PayloadPaciente("Error al registrar el paciente", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Actualizacion de paciente", description = "Endpoint para actualizar paciente por ID.", tags = { "Paciente" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Paciente actualizado", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = PayloadPaciente.class)),
                    @Content(mediaType = "application/xml", schema = @Schema(implementation = PayloadPaciente.class))
            }),
            @ApiResponse(responseCode = "404", description = "Mensaje: Paciente no encontrado", content = @Content),
            @ApiResponse(responseCode = "500", description = "Mensaje: Error interno del servidor", content = @Content)
    })
    @PutMapping(value = "/update/{id}", consumes = { "application/json", "application/x-www-form-urlencoded" })
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody Paciente paciente) {
        Paciente updatedPaciente = new Paciente();
        PayloadPaciente response = null;
        try {
            if (pacienteService.findById(id) != null) {
                updatedPaciente.setId(id);
                updatedPaciente = pacienteService.save(paciente);
                response = new PayloadPaciente("Paciente actualizado", updatedPaciente);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response = new PayloadPaciente("Paciente no encontrado", null);
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            response = new PayloadPaciente("Error al actualizar el paciente", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Eliminar usuario", description = "Eliminacion fisica de registro por id.", tags = { "Paciente" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Mensaje: Paciente eliminado", content = @Content),
            @ApiResponse(responseCode = "400", description = "Mensaje: Error del usuario", content = @Content),
            @ApiResponse(responseCode = "404", description = "Mensaje: Paciente no encontrado", content = @Content)
    })
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable String id) {
        PayloadPaciente response = null;
        try {
            if (pacienteService.findById(id) != null) {
                pacienteService.deleteById(id);
                response = new PayloadPaciente("Paciente eliminado", null);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response = new PayloadPaciente("Paciente no encontrado", null);
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            response = new PayloadPaciente("Error al eliminar el paciente", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

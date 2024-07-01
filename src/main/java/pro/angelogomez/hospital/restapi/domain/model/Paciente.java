package pro.angelogomez.hospital.restapi.domain.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
public class Paciente {
    @Schema(example = "onlyUseInUpdate", description = "")
    private String id;
    @Schema(example = "Angelo", description = "")
    private String nombre;
    @Schema(example = "Gomez", description = "")
    private String apellido;
    @Schema(example = "2003-09-26", description = "")
    private Date fechaNacimiento;
    @Schema(example = "MASCULINO", description = "")
    private String genero;
    @Schema(example = "Calle prueba 123", description = "")
    private String direccion;
    @Schema(example = "987654321", description = "")
    private String telefono;
    @Schema(example = "mailtest@domain.com", description = "")
    private String email;
}

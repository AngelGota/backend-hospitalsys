package pro.angelogomez.hospital.restapi.domain.model;

import lombok.Data;

@Data
public class Medico {
    private String id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private Especialidad especialidad;
    private String telefono;
    private String email;

}

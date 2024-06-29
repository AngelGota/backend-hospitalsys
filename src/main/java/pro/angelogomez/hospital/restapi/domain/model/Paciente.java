package pro.angelogomez.hospital.restapi.domain.model;

import lombok.Data;

import java.util.Date;

@Data
public class Paciente {
    private String id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String genero;
    private String direccion;
    private String telefono;
    private String email;
}

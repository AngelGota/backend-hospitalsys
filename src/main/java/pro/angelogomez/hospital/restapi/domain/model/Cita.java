package pro.angelogomez.hospital.restapi.domain.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class Cita {
    private String id;
    private Date fecha;
    private LocalDateTime hora;
    private Paciente paciente;
    private Medico medico;
    private Especialidad especialidad;
    private CitaEstado estado;
}

package pro.angelogomez.hospital.restapi.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import pro.angelogomez.hospital.restapi.domain.model.CitaEstado;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

@Entity
@Data
@Table(name = "citas")
public class CitaEntity {
    @Id
    private String id;
    private Date fecha;
    private LocalDateTime hora;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private PacienteEntity paciente;

    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private EspecialidadEntity especialidad;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private MedicoEntity medico;

    private CitaEstado estado;

    @PrePersist
    public void generarId() {
        Random random = new Random();
        int numeroAleatorio = 100 + random.nextInt(900000);
        this.id = "CIT" + numeroAleatorio;
    }
}

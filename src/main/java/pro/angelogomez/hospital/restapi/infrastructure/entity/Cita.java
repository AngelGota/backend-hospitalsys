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
public class Cita {
    @Id
    private String id;
    private Date fecha;
    private LocalDateTime hora;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico;

    private CitaEstado estado;

    @PrePersist
    public void generarId() {
        Random random = new Random();
        int numeroAleatorio = 100 + random.nextInt(900000);
        this.id = "CIT" + numeroAleatorio;
    }
}

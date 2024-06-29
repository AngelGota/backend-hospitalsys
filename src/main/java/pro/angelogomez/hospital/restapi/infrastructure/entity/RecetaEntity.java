package pro.angelogomez.hospital.restapi.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Random;

@Data
@Entity
@Table(name = "recetas")
public class RecetaEntity {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "id_cita")
    private CitaEntity cita;
    @ManyToOne
    @JoinColumn(name = "id_medicina")
    private MedicinaEntity medicina;
    private String dosis;
    private String instrucciones;

    @PrePersist
    public void generarId() {
        Random random = new Random();
        int numeroAleatorio = 100 + random.nextInt(900000);
        this.id = "REC" + numeroAleatorio;
    }
}

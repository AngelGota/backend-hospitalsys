package pro.angelogomez.hospital.restapi.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Random;

@Entity
@Data
@Table(name = "medicinas")
public class MedicinaEntity {
    @Id
    private String id;
    private String nombre;
    private String descripcion;

    @PrePersist
    public void generarId() {
        Random random = new Random();
        int numeroAleatorio = 100 + random.nextInt(900000);
        this.id = "MED" + numeroAleatorio;
    }
}

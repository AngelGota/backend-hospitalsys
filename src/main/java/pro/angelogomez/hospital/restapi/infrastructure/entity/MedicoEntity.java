package pro.angelogomez.hospital.restapi.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Random;

@Entity
@Data
@Table(name = "medicos")
public class MedicoEntity {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private EspecialidadEntity especialidad;
    private String telefono;
    private String email;

    @PrePersist
    public void generarId() {
        Random random = new Random();
        int numeroAleatorio = 100 + random.nextInt(900000);
        this.id = "MED" + numeroAleatorio;
    }
}
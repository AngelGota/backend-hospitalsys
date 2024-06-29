package pro.angelogomez.hospital.restapi.domain.model;

import lombok.Data;

@Data
public class Receta {
    private String id;
    private Cita cita;
    private Medicina medicina;
    private String dosis;
    private String instrucciones;
}

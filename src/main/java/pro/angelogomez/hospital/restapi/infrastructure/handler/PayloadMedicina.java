package pro.angelogomez.hospital.restapi.infrastructure.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import pro.angelogomez.hospital.restapi.domain.model.Paciente;

@Data
@AllArgsConstructor
public class PayloadMedicina {
    private String message;
    private int code;
    private Paciente paciente;
}

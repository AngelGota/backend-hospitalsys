package pro.angelogomez.hospital.restapi.infrastructure.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import pro.angelogomez.hospital.restapi.domain.model.Paciente;

@Data
@AllArgsConstructor
public class PayloadMedico {
    private String message;
    private Object object;
}

package pro.angelogomez.hospital.restapi.infrastructure.handler;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class PayloadPaciente {
    private String message;
    private Object object;
}

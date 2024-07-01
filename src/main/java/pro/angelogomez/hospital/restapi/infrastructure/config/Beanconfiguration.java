package pro.angelogomez.hospital.restapi.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.angelogomez.hospital.restapi.application.PacienteService;
import pro.angelogomez.hospital.restapi.domain.port.IPacienteRepository;

@Configuration
public class Beanconfiguration {

    @Bean
    public PacienteService pacienteService(IPacienteRepository iPacienteRepository) {
        return new PacienteService(iPacienteRepository);
    }
}

package pro.angelogomez.hospital.restapi.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.angelogomez.hospital.restapi.application.*;
import pro.angelogomez.hospital.restapi.domain.port.*;

@Configuration
public class Beanconfiguration {

    @Bean
    public PacienteService pacienteService(IPacienteRepository iPacienteRepository) {
        return new PacienteService(iPacienteRepository);
    }

    @Bean
    public RecetaService recetaService(IRecetaRepository iRecetaRepository) {
        return new RecetaService(iRecetaRepository);
    }

    @Bean
    public MedicoService medicoService(IMedicoRepository iMedicoRepository) {
        return new MedicoService(iMedicoRepository);
    }

    @Bean
    public MedicinaService medicinaService(IMedicinaRepository iMedicinaRepository) {
        return new MedicinaService(iMedicinaRepository);
    }

    @Bean
    public EspecialidadService especialidadService(IEspecialidadRepository iEspecialidadRepository) {
        return new EspecialidadService(iEspecialidadRepository);
    }

    @Bean
    public CitaService citaService(ICitaRepository iCitaRepository) {
        return new CitaService(iCitaRepository);
    }
}

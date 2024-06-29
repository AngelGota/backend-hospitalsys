package pro.angelogomez.hospital.restapi.infrastructure.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pro.angelogomez.hospital.restapi.domain.model.Cita;
import pro.angelogomez.hospital.restapi.infrastructure.entity.CitaEntity;

@Mapper(componentModel = "spring")
public interface CitaMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "fecha", target = "fecha"),
                    @Mapping(source = "hora", target = "hora"),
                    @Mapping(source = "paciente", target = "paciente"),
                    @Mapping(source = "medico", target = "medico"),
                    @Mapping(source = "especialidad", target = "especialidad"),
                    @Mapping(source = "estado", target = "estado")
            }
    )
    Cita toCita(CitaEntity citaEntity);
    Iterable<Cita> toCitas(Iterable<CitaEntity> citaEntities);
    @InheritInverseConfiguration
    CitaEntity toCitaEntity(Cita cita);
}

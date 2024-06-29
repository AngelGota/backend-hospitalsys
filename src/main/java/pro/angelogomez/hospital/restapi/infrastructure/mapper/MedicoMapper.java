package pro.angelogomez.hospital.restapi.infrastructure.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pro.angelogomez.hospital.restapi.domain.model.Medico;
import pro.angelogomez.hospital.restapi.infrastructure.entity.MedicoEntity;

@Mapper(componentModel = "spring")
public interface MedicoMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "nombre", target = "nombre"),
                    @Mapping(source = "apellido", target = "apellido"),
                    @Mapping(source = "fechaNacimiento", target = "fechaNacimiento"),
                    @Mapping(source = "especialidad", target = "especialidad"),
                    @Mapping(source = "telefono", target = "telefono"),
                    @Mapping(source = "email", target = "email")
            }
    )

    Medico toMedico(MedicoEntity medicoEntity);
    Iterable<Medico> toMedicos(Iterable<MedicoEntity> medicoEntities);
    @InheritInverseConfiguration
    MedicoEntity toMedicoEntity(Medico medico);
}

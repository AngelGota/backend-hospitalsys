package pro.angelogomez.hospital.restapi.infrastructure.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pro.angelogomez.hospital.restapi.domain.model.Paciente;
import pro.angelogomez.hospital.restapi.infrastructure.entity.PacienteEntity;

@Mapper(componentModel = "spring")
public interface PacienteMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "nombre", target = "nombre"),
                    @Mapping(source = "apellido", target = "apellido"),
                    @Mapping(source = "fechaNacimiento", target = "fechaNacimiento"),
                    @Mapping(source = "genero", target = "genero"),
                    @Mapping(source = "direccion", target = "direccion"),
                    @Mapping(source = "telefono", target = "telefono"),
                    @Mapping(source = "email", target = "email")
            }
    )
    Paciente toPaciente(PacienteEntity pacienteEntity);
    Iterable<Paciente> toPacientes(Iterable<PacienteEntity> pacienteEntities);
    @InheritInverseConfiguration
    PacienteEntity toPacienteEntity(Paciente paciente);
}

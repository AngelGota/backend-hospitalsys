package pro.angelogomez.hospital.restapi.infrastructure.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pro.angelogomez.hospital.restapi.domain.model.Especialidad;
import pro.angelogomez.hospital.restapi.infrastructure.entity.EspecialidadEntity;

@Mapper(componentModel = "spring")
public interface EspecialidadMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "descripcion", target = "descripcion")
            }
    )
    Especialidad toEspecialidad(EspecialidadEntity especialidadEntity);
    Iterable<Especialidad> toEspecialidades(Iterable<EspecialidadEntity> especialidadEntities);
    @InheritInverseConfiguration
    EspecialidadEntity toEspecialidadEntity(Especialidad especialidad);
}

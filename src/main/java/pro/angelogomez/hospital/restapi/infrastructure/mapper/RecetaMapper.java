package pro.angelogomez.hospital.restapi.infrastructure.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pro.angelogomez.hospital.restapi.domain.model.Receta;
import pro.angelogomez.hospital.restapi.infrastructure.entity.RecetaEntity;

@Mapper(componentModel = "spring")
public interface RecetaMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "cita", target = "cita"),
                    @Mapping(source = "medicina", target = "medicina"),
                    @Mapping(source = "dosis", target = "dosis"),
                    @Mapping(source = "instrucciones", target = "instrucciones")
            }
    )
    Receta toReceta(RecetaEntity recetaEntity);
    Iterable<Receta> toRecetas(Iterable<RecetaEntity> recetaEntities);
    @InheritInverseConfiguration
    RecetaEntity toRecetaEntity(Receta receta);
}

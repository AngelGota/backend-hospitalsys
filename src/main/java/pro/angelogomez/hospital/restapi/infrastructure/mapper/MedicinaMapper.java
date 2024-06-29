package pro.angelogomez.hospital.restapi.infrastructure.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pro.angelogomez.hospital.restapi.domain.model.Medicina;
import pro.angelogomez.hospital.restapi.infrastructure.entity.MedicinaEntity;

@Mapper(componentModel = "spring")
public interface MedicinaMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "nombre", target = "nombre"),
                    @Mapping(source = "descripcion", target = "descripcion")
            }
    )
    Medicina toMedicina(MedicinaEntity medicinaEntity);
    Iterable<Medicina> toMedicinas(Iterable<MedicinaEntity> medicinaEntities);
    @InheritInverseConfiguration
    MedicinaEntity toMedicinaEntity(Medicina medicina);

}

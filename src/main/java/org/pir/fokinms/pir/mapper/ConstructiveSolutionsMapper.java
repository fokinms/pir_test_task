package org.pir.fokinms.pir.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pir.fokinms.pir.dto.ConstructiveSolutionsDto;
import org.pir.fokinms.pir.entity.ConstructiveSolutions;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ConstructiveSolutionsMapper {
    ConstructiveSolutionsDto toDto(ConstructiveSolutions constructiveSolutions);
    ConstructiveSolutions toEntity(ConstructiveSolutionsDto constructiveSolutionsDto);
}

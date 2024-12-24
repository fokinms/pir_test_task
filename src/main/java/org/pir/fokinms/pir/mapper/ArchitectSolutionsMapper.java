package org.pir.fokinms.pir.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pir.fokinms.pir.dto.ArchitectSolutionsDto;
import org.pir.fokinms.pir.entity.ArchitectSolutions;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ArchitectSolutionsMapper {
    ArchitectSolutionsDto toDto(ArchitectSolutions architectSolutions);
    ArchitectSolutions toEntity(ArchitectSolutionsDto architectSolutionsDto);
}

package org.pir.fokinms.pir.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pir.fokinms.pir.dto.ProjectDto;
import org.pir.fokinms.pir.entity.project.Project;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjectMapper {

    ProjectDto toDto(Project project);
    Project toEntity(ProjectDto projectDto);
}
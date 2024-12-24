package org.pir.fokinms.pir.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.pir.fokinms.pir.entity.project.ProjectStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectDto {
    private long id;
    @NotBlank
    private String name;
    @NotBlank
    private String code;
    private ProjectStatus status;
    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;
    private ArchitectSolutionsDto architectSolutions;
    private ConstructiveSolutionsDto constructiveSolutions;
    private EngineerEquipments1Dto engineerEquipments1;
    private EngineerEquipments2Dto engineerEquipments2;
    private EngineerEquipments3Dto engineerEquipments3;
    private EngineerEquipments4Dto engineerEquipments4;
    private EngineerEquipments5Dto engineerEquipments5;
    private EngineerEquipments6Dto engineerEquipments6;
}
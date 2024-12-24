package org.pir.fokinms.pir.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pir.fokinms.pir.dto.EngineerEquipments2Dto;
import org.pir.fokinms.pir.entity.EngineerEquipments2;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EngineerEquipments2Mapper {
    EngineerEquipments2Dto toDto(EngineerEquipments2 engineerEquipments2);
    EngineerEquipments2 toEntity(EngineerEquipments2Dto engineerEquipments2Dto);
}
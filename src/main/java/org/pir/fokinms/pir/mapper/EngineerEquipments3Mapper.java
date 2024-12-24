package org.pir.fokinms.pir.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pir.fokinms.pir.dto.EngineerEquipments3Dto;
import org.pir.fokinms.pir.entity.EngineerEquipments3;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EngineerEquipments3Mapper {
    EngineerEquipments3Dto toDto(EngineerEquipments3 engineerEquipments3);
    EngineerEquipments3 toEntity(EngineerEquipments3Dto engineerEquipments3Dto);
}
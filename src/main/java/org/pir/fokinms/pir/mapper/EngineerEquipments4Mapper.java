package org.pir.fokinms.pir.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pir.fokinms.pir.dto.EngineerEquipments4Dto;
import org.pir.fokinms.pir.entity.EngineerEquipments4;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EngineerEquipments4Mapper {
    EngineerEquipments4Dto toDto(EngineerEquipments4 engineerEquipments4);
    EngineerEquipments4 toEntity(EngineerEquipments4Dto engineerEquipments4Dto);
}
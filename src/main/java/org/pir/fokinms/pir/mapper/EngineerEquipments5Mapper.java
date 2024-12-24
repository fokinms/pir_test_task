package org.pir.fokinms.pir.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pir.fokinms.pir.dto.EngineerEquipments5Dto;
import org.pir.fokinms.pir.entity.EngineerEquipments5;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EngineerEquipments5Mapper {
    EngineerEquipments5Dto toDto(EngineerEquipments5 engineerEquipments5);
    EngineerEquipments5 toEntity(EngineerEquipments5Dto engineerEquipments5Dto);
}
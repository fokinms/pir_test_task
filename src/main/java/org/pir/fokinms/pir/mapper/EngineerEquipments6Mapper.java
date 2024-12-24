package org.pir.fokinms.pir.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pir.fokinms.pir.dto.EngineerEquipments6Dto;
import org.pir.fokinms.pir.entity.EngineerEquipments6;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EngineerEquipments6Mapper {
    EngineerEquipments6Dto toDto(EngineerEquipments6 engineerEquipments6);
    EngineerEquipments6 toEntity(EngineerEquipments6Dto engineerEquipments6Dto);
}
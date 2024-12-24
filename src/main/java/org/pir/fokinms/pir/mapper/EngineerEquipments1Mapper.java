package org.pir.fokinms.pir.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pir.fokinms.pir.dto.EngineerEquipments1Dto;
import org.pir.fokinms.pir.entity.EngineerEquipments1;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EngineerEquipments1Mapper {
    EngineerEquipments1Dto toDto(EngineerEquipments1 engineerEquipments1);
    EngineerEquipments1 toEntity(EngineerEquipments1Dto engineerEquipments1Dto);
}

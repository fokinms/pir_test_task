package org.pir.fokinms.pir.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EngineerEquipments1Dto {
    private long id;
    private String code;
    private LocalDateTime createdAt;
}

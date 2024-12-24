package org.pir.fokinms.pir.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ConstructiveSolutionsDto {
    private long id;
    private String code;
    private LocalDateTime createdAt;
}
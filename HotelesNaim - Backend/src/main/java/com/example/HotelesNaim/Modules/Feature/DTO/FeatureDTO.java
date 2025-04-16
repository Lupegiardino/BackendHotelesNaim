package com.example.HotelesNaim.Modules.Feature.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class FeatureDTO {
    @Serial
    private static final long serialVersionUID = 1L;
    private UUID id;
    private String name;
    private String icon;
}

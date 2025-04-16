package com.example.HotelesNaim.Modules.Category.DTO;

import lombok.*;
import java.io.Serial;
import java.util.UUID;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CategoryDTO {
    @Serial
    private static final long serialVersionUID = 1L;

    private UUID id;
    private String name;
    private String description;
    private String image;
}

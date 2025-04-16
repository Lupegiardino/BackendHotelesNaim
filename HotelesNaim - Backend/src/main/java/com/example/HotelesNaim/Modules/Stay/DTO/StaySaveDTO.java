package com.example.HotelesNaim.Modules.Stay.DTO;

import com.example.HotelesNaim.Modules.Address.DTO.AddressDTO;
import com.example.HotelesNaim.Modules.Stay.StayPolicy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StaySaveDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private UUID id;
    private String name;
    private String description;
    private Set<String> images;
    private Double price;
    private AddressDTO address;
    private UUID category_id;
    private Set<UUID> features;
    private Set<StayPolicy> policies;

}

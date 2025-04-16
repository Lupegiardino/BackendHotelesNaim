package com.example.HotelesNaim.Modules.Address.DTO;
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

public class AddressDTO implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    private UUID id;
    private String street;
    private String city;
    private String country;}

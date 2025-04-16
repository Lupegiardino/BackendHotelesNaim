package com.example.HotelesNaim.Modules.User.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserUpdateNameDTO {
    private String firstname;
    private String lastname;
}

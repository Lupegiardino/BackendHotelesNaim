package com.example.HotelesNaim.Modules.User.DTO;

import com.example.HotelesNaim.Modules.User.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSaveDTO {
    private UUID id;
    private String firstname;
    private String lastname;
    private String email;
    private Role role;
    private String password;
}

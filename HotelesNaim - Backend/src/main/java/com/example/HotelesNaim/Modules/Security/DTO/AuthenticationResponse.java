package com.example.HotelesNaim.Modules.Security.DTO;

import com.example.HotelesNaim.Modules.User.DTO.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String token;
    private UserDTO user;
}

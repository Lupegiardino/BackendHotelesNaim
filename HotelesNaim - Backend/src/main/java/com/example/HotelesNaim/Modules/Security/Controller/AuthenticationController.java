package com.example.HotelesNaim.Modules.Security.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HotelesNaim.Modules.Security.DTO.AuthenticationRequest;
import com.example.HotelesNaim.Modules.Security.DTO.AuthenticationResponse;
import com.example.HotelesNaim.Modules.Security.DTO.RegisterRequest;
import com.example.HotelesNaim.Modules.Security.Service.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Auth", description = "Operaciones relacionadas con la autenticación.")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody AuthenticationRequest request) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authenticationService.login(request));
    }
}

package com.francentra.bank.auth_users.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank(message = "Email is required")
    @Email
    private String Email;

    @NotBlank(message = "Password is required")
    private String Password;
}

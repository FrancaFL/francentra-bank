package com.francentra.bank.auth_users.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegistrationRequest {

    @NotBlank(message = "FirstName is required")
    private String firstName;

    @NotBlank(message = "LastName is required")
    private String lastName;

    private String phoneNumber;

    @NotBlank(message = "Email is required")
    @Email
    private String email;

    private String roles;

    @NotBlank(message = "Password is required")
    private String password;

}

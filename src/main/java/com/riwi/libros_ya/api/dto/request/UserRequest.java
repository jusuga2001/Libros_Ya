package com.riwi.libros_ya.api.dto.request;

import com.riwi.libros_ya.util.enums.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "username is required")
    @Size(min = 5, max = 20)
    private String username;
    @NotBlank(message = "password is required")
    private String password;
    @Email
    @NotBlank(message = "email is required")
    private String email;
    @NotBlank(message = "full name is required")
    @Size(min = 3, max = 50)
    private String fullName;
    @NotBlank(message = "role is required")
    private Role role;
}

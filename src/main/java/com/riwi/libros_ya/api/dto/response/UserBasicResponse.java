package com.riwi.libros_ya.api.dto.response;

import com.riwi.libros_ya.util.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicResponse {
    private Long id;
    private String username;
    private String email;
    private String fullName;
    private Role role;
}

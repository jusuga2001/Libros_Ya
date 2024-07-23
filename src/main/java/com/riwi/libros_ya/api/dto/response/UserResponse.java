package com.riwi.libros_ya.api.dto.response;

import java.util.List;

import com.riwi.libros_ya.util.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String username;
    private String email;
    private String fullName;
    private Role role;
    private List<LoanWithBookResponse>loans;
    private List<ReservationWithBookResp>reservations;
}

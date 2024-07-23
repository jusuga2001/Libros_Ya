package com.riwi.libros_ya.api.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanWithUserResponse {
    private Long id;
    private LocalDate date;
    private LocalDate returnDate;
    private Boolean status;
    private UserBasicResponse user;

}

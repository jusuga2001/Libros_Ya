package com.riwi.libros_ya.api.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class LoanBasicResponse {
    private Long id;
    private LocalDate date;
    private LocalDate returnDate;
    private Boolean status;
}

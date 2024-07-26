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
public class ReservationBasicResponse {
    private Long id;
    private LocalDate reservationDate;
    private Boolean status;
}

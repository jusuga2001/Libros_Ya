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
public class ReservationWithBookResp {
    private Long id;
    private LocalDate reservationDate;
    private Boolean status;
    private BookBasicResponse book;    
}

package com.riwi.libros_ya.api.dto.response;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse extends BookBasicResponse{
    private LoanWithUserResponse loan;
    private List<ReservationWithUserResp> reservations;
}

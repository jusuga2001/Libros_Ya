package com.riwi.libros_ya.api.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    @NotBlank(message = "reservation date is required")
    private LocalDate reservationDate;
    @NotNull(message = "User id is required")
    private Long userId;
    @NotNull(message = "Book id is required")
    private Long bookId;
    @NotNull(message = "Status is required")
    private Boolean status;
}

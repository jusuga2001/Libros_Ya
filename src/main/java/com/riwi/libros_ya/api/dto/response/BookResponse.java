package com.riwi.libros_ya.api.dto.response;

import java.util.List;

import com.riwi.libros_ya.domain.entities.Reservation;
import com.riwi.libros_ya.util.enums.Genre;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private Genre genre;
    private String isbn;
    private LoanWithUserResponse loan;
    private List<Reservation> reservations;
}

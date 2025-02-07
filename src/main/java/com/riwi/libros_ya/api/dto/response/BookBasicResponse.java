package com.riwi.libros_ya.api.dto.response;

import com.riwi.libros_ya.util.enums.Genre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BookBasicResponse {
    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private Genre genre;
    private String isbn;
}

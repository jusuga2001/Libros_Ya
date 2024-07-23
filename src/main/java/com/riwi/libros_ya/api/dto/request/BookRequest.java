package com.riwi.libros_ya.api.dto.request;

import com.riwi.libros_ya.util.enums.Genre;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    @NotBlank(message = "title is required")
    @Size(min = 3, max = 100)
    private String title;
    @NotBlank(message = "author is required")
    @Size(min = 3, max = 100)
    private String author;
    @NotNull(message = "publication year is required")
    private int publicationYear;
    @NotNull(message = "genre is required")
    private Genre genre;
    @NotBlank(message = "isbn is required")
    private String isbn;
}

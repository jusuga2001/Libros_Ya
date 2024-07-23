package com.riwi.libros_ya.domain.entities;

import java.util.List;

import com.riwi.libros_ya.util.enums.Genre;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String title;
    @Column(length = 100, nullable = false)
    private String author;
    @Column(length = 4, nullable = false)
    private int publicationYear;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Column(nullable = false)
    private String isbn;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "bookId",
        cascade = CascadeType.ALL,
        orphanRemoval = false)
    private List<Loan> loans;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "bookId",
        cascade = CascadeType.ALL,
        orphanRemoval = false)
    private List<Reservation>reservations;
}

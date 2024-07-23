package com.riwi.libros_ya.domain.entities;

import java.util.List;

import com.riwi.libros_ya.util.enums.Role;

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

@Entity(name = "user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String username;
    @Column(length = 50, nullable = false)
    private String password;
    @Column(length = 50, nullable = false)
    private String email;
    @Column(length = 80, nullable = false)
    private String fullName;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "userId",
        cascade = CascadeType.ALL,
        orphanRemoval = false)
    private List<Loan>loans;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "userId",
        cascade = CascadeType.ALL,
        orphanRemoval = false)
    private List<Reservation>reservations;
}

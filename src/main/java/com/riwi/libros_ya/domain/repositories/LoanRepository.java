package com.riwi.libros_ya.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.libros_ya.domain.entities.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{
    
}

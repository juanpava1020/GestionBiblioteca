package com.riwi.demo.domain.repositories;

import com.riwi.demo.domain.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}

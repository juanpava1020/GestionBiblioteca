package com.riwi.demo.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "book")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String title;

    @Column(nullable = false,length = 100)
    private String author;

    @Column(nullable = false,length = 11)
    private Integer publicationYear;

    @Column(nullable = false,length = 50)
    private String genre;

    @Column(nullable = false,length = 20)
    private String isbn;

    @OneToMany(
            mappedBy = "bookId",
            cascade = CascadeType.ALL,
            orphanRemoval = false,
            fetch = FetchType.EAGER
    )
    private List<Loan> loans;

    @OneToMany(
            mappedBy = "bookId",
            cascade = CascadeType.ALL,
            orphanRemoval = false,
            fetch = FetchType.EAGER
    )
    private List<Reservation> reservations;
}

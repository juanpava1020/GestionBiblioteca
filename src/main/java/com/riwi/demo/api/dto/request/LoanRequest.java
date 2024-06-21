package com.riwi.demo.api.dto.request;

import com.riwi.demo.domain.entities.Book;
import com.riwi.demo.domain.entities.UserEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanRequest {
    @NotBlank(message = "the returnDate is required")
    private LocalDate returnDate;

    @NotBlank(message = "the status is required")
    private Boolean status;

    @NotNull(message = "the stauserIdtus is required")
    private UserEntity userId;

    @NotNull(message = "the bookId is required")
    private Book bookId;
}

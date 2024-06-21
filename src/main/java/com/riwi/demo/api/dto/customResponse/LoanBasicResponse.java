package com.riwi.demo.api.dto.customResponse;

import com.riwi.demo.domain.entities.Book;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanBasicResponse {
    private Long id;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private Boolean status;


}

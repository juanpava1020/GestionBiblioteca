package com.riwi.demo.api.dto.response;

import com.riwi.demo.api.dto.customResponse.BookBasicResponse;
import com.riwi.demo.api.dto.customResponse.UserBasicResponse;
import com.riwi.demo.domain.entities.Book;
import com.riwi.demo.domain.entities.UserEntity;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {
    private Long id;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private Boolean status;
    private UserBasicResponse userId;
    private BookBasicResponse bookId;
}

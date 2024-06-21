package com.riwi.demo.api.dto.response;

import com.riwi.demo.api.dto.customResponse.LoanBasicResponse;
import com.riwi.demo.api.dto.customResponse.ReservationBasicListUser;
import com.riwi.demo.domain.entities.Loan;
import com.riwi.demo.domain.entities.Reservation;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private Long id;
    private String title;
    private String author;
    private Integer publicationYear;
    private String genre;
    private String isbn;
    private List<LoanBasicResponse> loans;
    private List<ReservationBasicListUser> reservations;

}

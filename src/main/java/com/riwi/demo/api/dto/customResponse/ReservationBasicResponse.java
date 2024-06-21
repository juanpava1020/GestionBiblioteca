package com.riwi.demo.api.dto.customResponse;

import com.riwi.demo.domain.entities.Book;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationBasicResponse {
    private Long id;
    private LocalDate reservationDate;
    private boolean status;


}

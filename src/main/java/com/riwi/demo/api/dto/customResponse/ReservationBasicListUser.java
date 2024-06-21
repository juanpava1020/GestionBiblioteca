package com.riwi.demo.api.dto.customResponse;

import com.riwi.demo.domain.entities.UserEntity;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ReservationBasicListUser {
    private Long id;
    private LocalDate reservationDate;
    private boolean status;
    private UserEntity userId;
}

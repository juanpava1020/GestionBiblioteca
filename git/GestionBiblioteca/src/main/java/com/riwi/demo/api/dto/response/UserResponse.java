package com.riwi.demo.api.dto.response;

import com.riwi.demo.Enums.RoleUser;
import com.riwi.demo.api.dto.customResponse.LoanBasicResponse;
import com.riwi.demo.api.dto.customResponse.ReservationBasicResponse;
import com.riwi.demo.domain.entities.Book;
import com.riwi.demo.domain.entities.Loan;
import com.riwi.demo.domain.entities.Reservation;
import com.riwi.demo.domain.entities.UserEntity;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private RoleUser role;
    private List<LoanBasicResponse> loans;
    private List<ReservationBasicResponse> reservations;
}

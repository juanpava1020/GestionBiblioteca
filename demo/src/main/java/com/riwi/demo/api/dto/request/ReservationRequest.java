package com.riwi.demo.api.dto.request;

import com.riwi.demo.domain.entities.Book;
import com.riwi.demo.domain.entities.UserEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    @NotBlank(message = "the status is required")
    private boolean status;

    @NotNull(message = "the userId is required")
    private UserEntity userId;

    @NotNull(message = "the bookId is required")
    private Book bookId;
}

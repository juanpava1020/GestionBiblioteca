package com.riwi.demo.api.dto.response;

import com.riwi.demo.api.dto.customResponse.BookBasicResponse;
import com.riwi.demo.api.dto.customResponse.UserBasicResponse;
import com.riwi.demo.domain.entities.Book;
import com.riwi.demo.domain.entities.UserEntity;

import java.time.LocalDate;

public class ReservationResponse {
    private Long id;
    private LocalDate reservationDate;
    private boolean status;
    private UserBasicResponse userId;
    private BookBasicResponse bookId;

}

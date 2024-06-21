package com.riwi.demo.api.dto.customResponse;

import com.riwi.demo.domain.entities.Loan;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookBasicResponse {
    private Long id;
    private String title;
    private String author;
    private Integer publicationYear;
    private String genre;
    private String isbn;



}

package com.riwi.demo.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    @NotBlank(message = "the title is required")
    private String title;

    @NotBlank(message = "the author is required")
    private String author;

    @NotNull(message = "the publicationYear is required")
    private Integer publicationYear;

    @NotBlank(message = "the genre is required")
    private String genre;

    @NotBlank(message = "the isbn is required")
    private String isbn;
}

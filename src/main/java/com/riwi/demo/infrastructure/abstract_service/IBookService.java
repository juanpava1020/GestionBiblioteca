package com.riwi.demo.infrastructure.abstract_service;

import com.riwi.demo.api.dto.request.BookRequest;
import com.riwi.demo.api.dto.response.BookResponse;

public interface IBookService extends ServiceGeneric<BookRequest, BookResponse> {
}

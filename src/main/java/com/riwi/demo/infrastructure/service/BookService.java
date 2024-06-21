package com.riwi.demo.infrastructure.service;

import com.riwi.demo.api.dto.request.BookRequest;
import com.riwi.demo.api.dto.response.BookResponse;
import com.riwi.demo.infrastructure.abstract_service.IBookService;
import org.springframework.data.domain.Page;

public class BookService implements IBookService {
    @Override
    public BookResponse create(BookRequest request) {
        return null;
    }

    @Override
    public BookResponse get(Long id) {
        return null;
    }

    @Override
    public Page<BookResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public BookResponse update(Long id, BookRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

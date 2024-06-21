package com.riwi.demo.infrastructure.service;

import com.riwi.demo.api.dto.request.LoanRequest;
import com.riwi.demo.api.dto.response.LoanResponse;
import com.riwi.demo.infrastructure.abstract_service.ILoanService;
import org.springframework.data.domain.Page;

public class LoanService implements ILoanService {
    @Override
    public LoanResponse create(LoanRequest request) {
        return null;
    }

    @Override
    public LoanResponse get(Long id) {
        return null;
    }

    @Override
    public Page<LoanResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public LoanResponse update(Long id, LoanRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

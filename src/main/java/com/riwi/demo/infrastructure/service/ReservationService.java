package com.riwi.demo.infrastructure.service;

import com.riwi.demo.api.dto.request.ReservationRequest;
import com.riwi.demo.api.dto.response.ReservationResponse;
import com.riwi.demo.infrastructure.abstract_service.IReservationService;
import org.springframework.data.domain.Page;

public class ReservationService implements IReservationService {
    @Override
    public ReservationResponse create(ReservationRequest request) {
        return null;
    }

    @Override
    public ReservationResponse get(Long id) {
        return null;
    }

    @Override
    public Page<ReservationResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public ReservationResponse update(Long id, ReservationRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

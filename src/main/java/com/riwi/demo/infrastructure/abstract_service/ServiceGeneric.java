package com.riwi.demo.infrastructure.abstract_service;

import org.springframework.data.domain.Page;

public interface ServiceGeneric<RequestDTO, ResponseDTO> {

    ResponseDTO create(RequestDTO request);

    ResponseDTO get(Long id);

    Page<ResponseDTO> getAll(int page, int size);

    ResponseDTO update(Long id, RequestDTO request);

    void delete(Long id);
}

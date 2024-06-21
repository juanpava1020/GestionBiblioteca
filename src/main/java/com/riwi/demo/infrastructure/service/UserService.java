package com.riwi.demo.infrastructure.service;

import com.riwi.demo.api.dto.request.UserRequest;
import com.riwi.demo.api.dto.response.UserResponse;
import com.riwi.demo.infrastructure.abstract_service.IUserService;
import org.springframework.data.domain.Page;

public class UserService implements IUserService {
    @Override
    public UserResponse create(UserRequest request) {
        return null;
    }

    @Override
    public UserResponse get(Long id) {
        return null;
    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public UserResponse update(Long id, UserRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

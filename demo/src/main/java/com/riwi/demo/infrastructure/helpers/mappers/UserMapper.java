package com.riwi.demo.infrastructure.helpers.mappers;

import java.util.List;

import com.riwi.demo.api.dto.request.UserRequest;
import com.riwi.demo.api.dto.response.UserResponse;
import com.riwi.demo.domain.entities.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    @InheritInverseConfiguration
    UserResponse toResponse(UserEntity entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    UserEntity toEntity(UserRequest req);

    List<UserResponse> ReponseListToEntity(List<UserEntity> entity);

}
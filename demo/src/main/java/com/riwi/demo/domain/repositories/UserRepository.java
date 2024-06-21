package com.riwi.demo.domain.repositories;

import com.riwi.demo.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}

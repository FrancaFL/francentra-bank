package com.francentra.bank.auth_users.repo;

import com.francentra.bank.auth_users.entity.PasswordRestCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetCodeRepo extends JpaRepository<PasswordRestCode, Long> {

    Optional<PasswordRestCode> findByCode(String code);
    void deleteByUserId(Long userId);
}

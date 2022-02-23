package com.example.chat.repository;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:28.
 */

import com.example.chat.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

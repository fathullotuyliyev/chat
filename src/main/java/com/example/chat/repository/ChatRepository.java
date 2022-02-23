package com.example.chat.repository;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:29.
 */

import com.example.chat.model.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChatRepository extends JpaRepository<Chat, Long> {


}

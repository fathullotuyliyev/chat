package com.example.chat.repository;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:29.
 */

import com.example.chat.model.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MessageRepository extends JpaRepository<Message, String> {

    @Query(value = "select * from message m where m.chat_id=:id", nativeQuery = true)
    Page<Message> getMessagesById(Long id, Pageable pageable);
}

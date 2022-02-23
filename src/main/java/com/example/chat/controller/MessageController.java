package com.example.chat.controller;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:28.
 */

import com.example.chat.model.dto.MessageDto;
import com.example.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping
    public HttpEntity<?> createMessage(@RequestBody MessageDto messageDto) {
        return ResponseEntity.ok().body(messageService.createMessage(messageDto));

    }

    @GetMapping("/id={id}")
    public HttpEntity<?> getMessages(@PathVariable Long id, Pageable pageable) {
        return ResponseEntity.ok().body(messageService.getMessages(id, pageable));
    }
}

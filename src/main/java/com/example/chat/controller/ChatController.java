package com.example.chat.controller;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:28.
 */

import com.example.chat.model.dto.ChatDto;
import com.example.chat.model.dto.UserDto;
import com.example.chat.service.ChatService;
import com.example.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    ChatService chatService;

    @PostMapping
    public HttpEntity<?> createChat(@RequestBody ChatDto chatDto) {
        return ResponseEntity.ok().body(chatService.createChat(chatDto));


    }


}

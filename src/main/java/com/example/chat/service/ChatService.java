package com.example.chat.service;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:29.
 */

import com.example.chat.model.dto.ApiResponse;
import com.example.chat.model.dto.ChatDto;
import org.springframework.stereotype.Service;

@Service
public interface ChatService {
    ApiResponse createChat(ChatDto chatDto);



}

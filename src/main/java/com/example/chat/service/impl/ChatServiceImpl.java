package com.example.chat.service.impl;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:50.
 */

import com.example.chat.model.dto.ApiResponse;
import com.example.chat.model.dto.ChatDto;
import com.example.chat.model.entity.Chat;
import com.example.chat.model.entity.User;
import com.example.chat.repository.ChatRepository;
import com.example.chat.repository.UserRepository;
import com.example.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    ChatRepository chatRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public ApiResponse createChat(ChatDto chatDto) {
        Chat chat = new Chat();
        chat.setName(chatDto.getName());
        List<User> allById = userRepository.findAllById(chatDto.getUsersId());
        if (!allById.isEmpty()) {
            chat.setUsers(allById);
            chatRepository.save(chat);
            return new ApiResponse("success", true);
        } else {
            return new ApiResponse(" not found", false);
        }

    }


}

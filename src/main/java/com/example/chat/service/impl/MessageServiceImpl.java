package com.example.chat.service.impl;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:50.
 */

import com.example.chat.model.dto.ApiResponse;
import com.example.chat.model.dto.ApiResponseModel;
import com.example.chat.model.dto.MessageDto;
import com.example.chat.model.entity.Chat;
import com.example.chat.model.entity.Message;
import com.example.chat.model.entity.User;
import com.example.chat.repository.ChatRepository;
import com.example.chat.repository.MessageRepository;
import com.example.chat.repository.UserRepository;
import com.example.chat.service.MessageService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageRepository messageRepository;
    @Autowired
    ChatRepository chatRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public ApiResponse createMessage(MessageDto messageDto) {
        Message message = new Message();
        message.setText(messageDto.getText());
        Optional<Chat> byId1 = chatRepository.findById(messageDto.getChatId());
        if (byId1.isPresent()) {
            message.setChat(byId1.get());
            Optional<User> byId = userRepository.findById(messageDto.getAuthorId());
            if (byId.isPresent()) {
                message.setAuthor(byId.get());
                messageRepository.save(message);
                return new ApiResponse("success", true);
            } else {
                return new ApiResponse("second user not found", false);
            }
        } else {
            return new ApiResponse("first user not found", false);
        }

    }

    @Override
    public ApiResponseModel getMessages(Long id, Pageable pageable) {
        Page<Message> messagesById = messageRepository.getMessagesById(id, pageable);
        Page<ObjectNode> page = new PageImpl<>
                (messagesById.map(this::getResMessage).toList(), pageable, messagesById.getTotalElements());
        return new ApiResponseModel(true, page);
    }

    @Override
    public ObjectNode getResMessage(Message message) {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.putPOJO("id", message.getId());
        objectNode.putPOJO("text", message.getText());
        return objectNode;
    }
}
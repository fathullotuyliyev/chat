package com.example.chat.service;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:29.
 */

import com.example.chat.model.dto.ApiResponse;
import com.example.chat.model.dto.ApiResponseModel;
import com.example.chat.model.dto.MessageDto;
import com.example.chat.model.entity.Message;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    ApiResponse createMessage(MessageDto messageDto);

    ApiResponseModel getMessages(Long id, Pageable pageable);

    ObjectNode getResMessage(Message message);
}

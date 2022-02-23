package com.example.chat.model.dto;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 18/02/2022 10:54.
 */

import com.example.chat.model.entity.Chat;
import com.example.chat.model.entity.User;
import lombok.Data;

@Data
public class MessageDto {
    private String text;
    private Long chatId;
    private Long authorId;


}

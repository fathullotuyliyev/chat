package com.example.chat.model.dto;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 18:18.
 */

import lombok.Data;

import java.util.List;

@Data
public class ChatDto {
    private List<Long> usersId;
    private String name;

}

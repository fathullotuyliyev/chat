package com.example.chat.model.dto;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 18:00.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {
    private String message;
    private Boolean success;

}

package com.example.chat.model.dto;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 18/02/2022 18:02.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseModel {
    private String message;
    private boolean success;
    private Object object;

    public ApiResponseModel(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public ApiResponseModel(boolean success, Object object) {
        this.success = success;
        this.object = object;
    }
}

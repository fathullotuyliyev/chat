package com.example.chat.service;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:29.
 */

import com.example.chat.model.dto.ApiResponse;
import com.example.chat.model.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    ApiResponse createUser(UserDto userDto);
}

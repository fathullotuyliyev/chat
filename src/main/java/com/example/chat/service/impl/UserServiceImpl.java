package com.example.chat.service.impl;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:50.
 */

import com.example.chat.model.dto.ApiResponse;
import com.example.chat.model.dto.UserDto;
import com.example.chat.model.entity.User;
import com.example.chat.repository.UserRepository;
import com.example.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public ApiResponse createUser(UserDto userDto) {
        User user = new User();
        try {
            user.setUsername(userDto.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResponse("Only text", false);
        }
        userRepository.save(user);
        return new ApiResponse("Success", true);

    }
}

package com.example.chat.controller;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 17:28.
 */

import com.example.chat.model.dto.UserDto;
import com.example.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public HttpEntity<?> createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok().body(userService.createUser(userDto));

    }
}

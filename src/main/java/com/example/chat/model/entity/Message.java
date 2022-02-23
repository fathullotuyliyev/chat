package com.example.chat.model.entity;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 15:17.
 */

import com.example.chat.model.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Message extends AbsEntity {
    private String text;
    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;
}
package com.example.chat.model.entity;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 15:16.
 */

import com.example.chat.model.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Chat extends AbsEntity {

    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "chat_user", joinColumns = {@JoinColumn(name = "chat_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<User> users;

}

package com.example.chat.model.entity;/*
 *
 * project: chat
 * author: Fathullo To'yliyev on 17/02/2022 15:16.
 */

import com.example.chat.model.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbsEntity {

    private String username;


}

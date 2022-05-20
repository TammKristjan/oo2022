package com.kristjan.chatroom.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ChatroomMessage {
    @Id @GeneratedValue long ID;
    String userName;
    String userColor;
    String userMessage;
}

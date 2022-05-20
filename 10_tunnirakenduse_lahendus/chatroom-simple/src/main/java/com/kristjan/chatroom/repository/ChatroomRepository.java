package com.kristjan.chatroom.repository;

import com.kristjan.chatroom.model.ChatroomMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatroomRepository extends JpaRepository <ChatroomMessage, Long> {
}

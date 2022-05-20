package com.kristjan.chatroom.controller;

import com.kristjan.chatroom.model.ChatroomMessage;
import com.kristjan.chatroom.repository.ChatroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ChatroomController {

    @Autowired
    ChatroomRepository chatroom;

    //localhost:8080/send
    @PostMapping("send")
    public List<ChatroomMessage> sendMessage(@RequestBody ChatroomMessage message) {
        chatroom.save(message);
        return showMessages();
    }

    //localhost:8080/delete/id
    @DeleteMapping("delete/{id}")
    public List<ChatroomMessage> deleteMessage(@PathVariable long id) {
        chatroom.deleteById(id);
        return showAllMessages();
    }

    //localhost:8080/messages
    @GetMapping("messages")
    public List<ChatroomMessage> showMessages() {
        return showAllMessages().subList((int) Math.max(chatroom.count() - 20, 0), (int) chatroom.count());
    }

    @GetMapping("all_messages")
    public List<ChatroomMessage> showAllMessages() {
        return chatroom.findAll();
    }
}

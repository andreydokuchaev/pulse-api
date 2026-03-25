package io.github.andreydokuchaev.pulse.api;

import io.github.andreydokuchaev.pulse.api.dto.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.send")
    @SendTo("/topic/chat.public")
    public ChatMessage sendMessage(ChatMessage incomming) {
        return new ChatMessage(incomming.sender(), incomming.content());
    }
}

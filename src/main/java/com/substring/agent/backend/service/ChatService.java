package com.substring.agent.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {
    private final ChatClient chatClient;

    public String chat(String query) {
        //Use the chatClient to send the query and get a response
        return chatClient
                .prompt().user(query).call().content();
    }
}

package com.substring.agent.backend.config;

import com.substring.agent.backend.tools.OrderTools;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class AiConfig {

    private final OrderTools tools;

    @Bean
    public ChatClient chatClient(
            ChatClient.Builder builder
    ) {
        return builder
                .defaultSystem("""
                            You are a helpful assistant that helps users to get the status of their orders and cancel their orders.
                        """)
                .defaultTools(tools)
                .build();
    }

}

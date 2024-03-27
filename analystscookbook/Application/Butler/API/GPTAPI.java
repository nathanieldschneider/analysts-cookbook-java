package com.analystscookbook.Application.Butler.API;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.theokanning.openai.completion.chat.ChatCompletionChoice;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.completion.chat.ChatMessageRole;
import com.theokanning.openai.service.OpenAiService;

public class GPTAPI {

    String token = "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";
    OpenAiService service = new OpenAiService(token, Duration.ofSeconds(30));

    public void chat(String c){

        System.out.println("Streaming chat completion...");
        final List<ChatMessage> messages = new ArrayList<>();
        final ChatMessage systemMessage = new ChatMessage(ChatMessageRole.SYSTEM.value(), c);
        messages.add(systemMessage);
        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest
                .builder()
                .model("gpt-3.5-turbo")
                .messages(messages)
                .n(1)
                .build();
        List<ChatCompletionChoice> response = service.createChatCompletion(chatCompletionRequest).getChoices();

        System.out.println(response.get(0).getMessage().getContent());
    }
}

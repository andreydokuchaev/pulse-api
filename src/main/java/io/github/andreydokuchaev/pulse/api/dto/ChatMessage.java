package io.github.andreydokuchaev.pulse.api.dto;

import java.time.Instant;

public record ChatMessage(
        String sender,
        String content,
        Instant timestamp
) {
    public ChatMessage(String sender, String content) {
        this(sender, content, Instant.now());
    }
}

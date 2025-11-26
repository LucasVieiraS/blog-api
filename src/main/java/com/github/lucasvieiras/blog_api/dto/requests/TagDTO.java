package com.github.lucasvieiras.blog_api.dto.requests;

import java.util.UUID;

public record TagDTO(
        UUID id,
        String value
) {}



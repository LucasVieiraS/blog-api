package com.github.lucasvieiras.springboot_template.dto.requests;

import com.github.lucasvieiras.springboot_template.entities.Article;

import java.util.Set;
import java.util.UUID;

public record CategoryDTO(
        UUID id,
        String value
) {}

package com.github.lucasvieiras.springboot_template.dto;

import java.util.UUID;

public record CategoryDTO(
        UUID id,
        String value
) {}

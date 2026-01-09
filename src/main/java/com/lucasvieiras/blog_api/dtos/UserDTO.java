package com.lucasvieiras.blog_api.dtos;

import com.lucasvieiras.blog_api.enums.Role;

import java.time.LocalDateTime;
import java.util.UUID;

public record UserDTO(
        UUID id,
        String username,
        String email,
        Role role,
        LocalDateTime createdAt
) {}



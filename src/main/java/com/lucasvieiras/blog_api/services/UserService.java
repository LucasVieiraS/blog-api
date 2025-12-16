package com.lucasvieiras.blog_api.services;

import com.lucasvieiras.blog_api.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
    Optional<User> findUserById(UUID id);
    boolean existsById(UUID id);
}

package com.lucasvieiras.blog_api.services;

import com.lucasvieiras.blog_api.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
    Optional<User> findUserById(UUID id);
    boolean existsById(UUID id);
    Page<User> findAllUsers(Pageable pageable);
}

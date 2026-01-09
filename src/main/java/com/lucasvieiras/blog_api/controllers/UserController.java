package com.lucasvieiras.blog_api.controllers;

import com.lucasvieiras.blog_api.dtos.UserDTO;
import com.lucasvieiras.blog_api.dtos.factories.UserDTOFactory;
import com.lucasvieiras.blog_api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserDTOFactory userDTOFactory;

    @GetMapping
    public ResponseEntity<Page<UserDTO>> listUsers(Pageable pageable) {
        Page<UserDTO> page = userService.findAllUsers(pageable).map(userDTOFactory::create);
        return ResponseEntity.ok(page);
    }
}



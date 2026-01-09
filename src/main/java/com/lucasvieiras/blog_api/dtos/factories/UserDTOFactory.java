package com.lucasvieiras.blog_api.dtos.factories;

import com.lucasvieiras.blog_api.dtos.UserDTO;
import com.lucasvieiras.blog_api.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserDTOFactory {
    public UserDTO create(User user) {
        return new UserDTO(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getRole(),
                user.getCreatedAt()
        );
    }
}



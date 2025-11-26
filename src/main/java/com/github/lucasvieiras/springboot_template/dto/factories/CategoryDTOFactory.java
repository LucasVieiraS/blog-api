package com.github.lucasvieiras.springboot_template.dto.factories;

import com.github.lucasvieiras.springboot_template.dto.requests.CategoryDTO;
import com.github.lucasvieiras.springboot_template.entities.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryDTOFactory {
    public CategoryDTO create(Category category) {
        return new CategoryDTO(
                category.getId(),
                category.getValue()
        );
    }

    public List<CategoryDTO> create(List<Category> categories) {
        return categories.stream().map(this::create).toList();
    }
}

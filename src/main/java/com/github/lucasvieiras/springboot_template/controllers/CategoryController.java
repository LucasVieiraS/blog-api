package com.github.lucasvieiras.springboot_template.controllers;

import com.github.lucasvieiras.springboot_template.dto.factories.CategoryDTOFactory;
import com.github.lucasvieiras.springboot_template.dto.requests.CategoryDTO;
import com.github.lucasvieiras.springboot_template.dto.requests.category.CategoryRequest;
import com.github.lucasvieiras.springboot_template.entities.Category;
import com.github.lucasvieiras.springboot_template.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryDTOFactory categoryDTOFactory;

    @PostMapping("/create")
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryRequest request) {
        Category category = categoryService.createCategory(request);
        CategoryDTO response = categoryDTOFactory.create(category);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}

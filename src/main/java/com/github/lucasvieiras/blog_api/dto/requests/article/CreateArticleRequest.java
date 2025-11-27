package com.github.lucasvieiras.blog_api.dto.requests.article;

import com.github.lucasvieiras.blog_api.entities.Category;
import com.github.lucasvieiras.blog_api.entities.Tag;

import java.util.Set;

public record CreateArticleRequest(
        String title,
        String subtitle,
        Set<Tag> tags,
        Set<Category> categories,
        String contentMarkdown
) {


}

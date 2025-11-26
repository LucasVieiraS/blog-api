package com.github.lucasvieiras.blog_api.repositories;

import com.github.lucasvieiras.blog_api.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ArticleRepository extends JpaRepository<Article, UUID> {
    Optional<Article> findByTitle(String title);
}

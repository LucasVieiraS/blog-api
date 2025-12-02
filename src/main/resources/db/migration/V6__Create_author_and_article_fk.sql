ALTER TABLE articles
    ADD COLUMN author_id UUID NOT NULL;

ALTER TABLE articles
    ADD CONSTRAINT fk_articles_author
        FOREIGN KEY (author_id)
            REFERENCES users(id);
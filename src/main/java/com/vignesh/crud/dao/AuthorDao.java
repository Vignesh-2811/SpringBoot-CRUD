package com.vignesh.crud.dao;

import com.vignesh.crud.domain.Author;

import java.util.Optional;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long l);

}

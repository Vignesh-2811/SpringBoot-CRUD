package com.vignesh.crud.dao;

import com.vignesh.crud.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> find(String isbn);
}

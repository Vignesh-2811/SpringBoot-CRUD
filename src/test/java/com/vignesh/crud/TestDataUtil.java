package com.vignesh.crud;

import com.vignesh.crud.domain.Author;
import com.vignesh.crud.domain.Book;

public class TestDataUtil {
    private TestDataUtil(){
    }


    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Vignesh")
                .age(21)
                .build();
    }

    public static Book createTestBook() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The shadow in the attic")
                .authorId(1L)
                .build();
    }
}

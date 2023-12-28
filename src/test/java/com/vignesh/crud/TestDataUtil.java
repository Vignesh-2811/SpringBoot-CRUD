package com.vignesh.crud;

import com.vignesh.crud.domain.Author;

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
}

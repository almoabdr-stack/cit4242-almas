package com.example.moodleapi;

import java.util.List;

public class InMemoryBookSource implements BookSource {
    @Override
    public List<Book> load() {
        return List.of(
                new Book("Clean Code", "Robert C. Martin", 464, 40.0),
                new Book("Effective Java", "Joshua Bloch", 412, 45.0),
                new Book("Refactoring", "Martin Fowler", 448, 50.0)
        );
    }
}
package com.example.moodleapi;

import java.util.List;

public class CsvBookSource implements BookSource {
    private final String resource;

    public CsvBookSource(String resource) {
        this.resource = resource;
    }

    @Override
    public List<Book> load() {
        return List.of();
    }
}
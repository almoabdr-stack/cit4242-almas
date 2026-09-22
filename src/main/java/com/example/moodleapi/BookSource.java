package com.example.moodleapi;

import java.util.List;

public interface BookSource {
    List<Book> load();
}
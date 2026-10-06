package kz.kimep.moodle_api;

import java.util.List;

public class Catalogue {

    private final List<Book> books;

    public Catalogue(List<Book> books) {
        this.books = books != null ? books : List.of();
    }

    public List<String> titlesBy(String author) {
        if (author == null) {
            return List.of();
        }
        return books.stream()
                .filter(b -> author.equalsIgnoreCase(b.author()))
                .map(Book::title)
                .sorted()
                .toList();
    }
}
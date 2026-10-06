package kz.kimep.moodle_api;

public record Book(String title, String author, int pages, double price) {

    public boolean isLongRead() {
        return pages > 300;
    }
}
package com.example.moodleapi;

public record Book(String title, String author, int pages, double price) {

    // Kept because it contains a business judgment (not standard bookkeeping)
    public boolean isLongRead() {
        return pages > 300;
    }
}
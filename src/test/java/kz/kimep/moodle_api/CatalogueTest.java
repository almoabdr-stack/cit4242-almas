package kz.kimep.moodle_api;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CatalogueTest {

    @Test
    void titlesByShouldReturnEmptyListForUnknownAuthor() {
        // Arrange: Catalogue with sample books
        List<Book> books = List.of(
                new Book("Clean Code", "Robert C. Martin", 464, 40.0),
                new Book("Refactoring", "Martin Fowler", 448, 50.0)
        );
        Catalogue catalogue = new Catalogue(books);

        // Act: Query an author that does not exist
        List<String> result = catalogue.titlesBy("Unknown Author");

        // Assert: Prove it returns an empty list and NEVER null
        assertNotNull(result, "Result should not be null");
        assertTrue(result.isEmpty(), "Result should be an empty list for unknown author");
    }
}
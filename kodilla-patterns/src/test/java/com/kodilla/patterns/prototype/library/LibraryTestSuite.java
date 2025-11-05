package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Library");
        Book book1 = new Book("Book1", "Author1", LocalDate.of(1990, 1, 1));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2001, 2, 2));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(1992, 1, 3));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("shallowClonedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println("Exception: " + e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("deepClonedLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println("Exception: " + e);
        }

        shallowClonedLibrary.getBooks().remove(book2);

        //When
        int libraryBooksSize = library.getBooks().size();
        int shallowClonedLibraryBooksSize = shallowClonedLibrary.getBooks().size();
        int deepClonedLibraryBooksSize = deepClonedLibrary.getBooks().size();

        //Then
        assertEquals(2, libraryBooksSize);
        assertEquals(2, shallowClonedLibraryBooksSize);
        assertEquals(3, deepClonedLibraryBooksSize);
    }
}

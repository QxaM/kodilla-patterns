package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    private static Library library;

    @BeforeEach
    public void initLibrary() {
        library = new Library("Library 1");
        IntStream.range(1, 11)
                .forEach(n -> library.getBooks().add(new Book("Book " + n,
                        "Author " + n,
                        LocalDate.now().minusYears(n))));
    }

    @Test
    void testGetBooks() {
        //Given

        //When
        int librarySize = library.getBooks().size();

        //Then
        assertEquals(10, librarySize);

    }

    @Test
    void testShallowCopy() {
        //Given
        Library shallowCopiedLibrary = null;

        //When
        try {
            shallowCopiedLibrary = library.shallowCopy();
            shallowCopiedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Book bookToRemove = (Book) shallowCopiedLibrary.getBooks().toArray()[0];
        shallowCopiedLibrary.getBooks().remove(bookToRemove);

        //Then
        assertEquals(9, library.getBooks().size());
        assertEquals(9, shallowCopiedLibrary.getBooks().size());
    }

    @Test
    void testDeepCopy() {
        //Given
        Library deepCopiedLibrary = null;

        //When
        try {
            deepCopiedLibrary = library.deepCopy();
            deepCopiedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Book bookToRemove = (Book) deepCopiedLibrary.getBooks().toArray()[0];
        deepCopiedLibrary.getBooks().remove(bookToRemove);

        //Then
        assertEquals(10, library.getBooks().size());
        assertEquals(9, deepCopiedLibrary.getBooks().size());
    }
}

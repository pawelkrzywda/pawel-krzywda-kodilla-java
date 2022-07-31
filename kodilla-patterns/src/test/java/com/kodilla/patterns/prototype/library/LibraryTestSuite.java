package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite{

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("new Library");
        Book book1 = new Book("1984", "George Orwell", LocalDate.of(1949, 6, 8));
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", LocalDate.of(1937, 9, 21));
        Book book3 = new Book("Twenty Thousand Leagues Under the Seas", "Jules Verne", LocalDate.of(1870, 1, 1));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //shallow copy
        Library shallowCopyLibrary = null;
        try{
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Shallow copy library");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //deep copy
        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Deep copy library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        int size = library.getBooks().size();
        int sizeShallowCopy = shallowCopyLibrary.getBooks().size();
        int sizeDeepCopy = deepCopyLibrary.getBooks().size();

        //Then
        System.out.println(library);
        System.out.println(shallowCopyLibrary);
        System.out.println(deepCopyLibrary);
        assertEquals(3, size);
        assertEquals(3, sizeShallowCopy);
        assertEquals(3, sizeDeepCopy);
    }
}

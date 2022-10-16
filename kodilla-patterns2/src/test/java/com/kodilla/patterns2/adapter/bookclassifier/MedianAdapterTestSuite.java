package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book1 = new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943, "12345678");
        com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book2 = new Book("J.R.R. Tolkien", "The Hobbit", 1937, "25486548");
        com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book3 = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997, "35149565");
        com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book4 = new Book("Charles Dickens", "A Tale of Two Cities", 1859, "45213698");
        com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book5 = new Book("Dan Brown", "The Da Vinci Code", 2003, "56589856");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int result = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1943,result);
    }
}
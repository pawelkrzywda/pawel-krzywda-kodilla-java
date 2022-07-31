package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library>{
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Set<Book> getBooks(){
        return books;
    }

    public void setName(String name){
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            Book clonedBook = new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }

    @Override
    public String toString() {
        String s = "Books in Library: [" + name + "]:\n";
        for (Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }
}
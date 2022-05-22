package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.ForumUser;

public class Forum {

    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "First User", 'M', LocalDate.of(1990,01,01), 124));
        listOfUsers.add(new ForumUser(2, "Second User", 'F', LocalDate.of(1995,8,10), 0));
        listOfUsers.add(new ForumUser(3, "Third User", 'F', LocalDate.of(1980,11,01), 154));
        listOfUsers.add(new ForumUser(4, "Fourth User", 'M', LocalDate.of(1984,9,12), 0));
        listOfUsers.add(new ForumUser(5, "Fifth User", 'M', LocalDate.of(2001,5,24), 53));
        listOfUsers.add(new ForumUser(6, "Sixth User", 'F', LocalDate.of(1997,7,23), 0));
        listOfUsers.add(new ForumUser(7, "Seventh User", 'F', LocalDate.of(1996,4,30), 1));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(listOfUsers);
    }
}

package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Period period;
        Map<Integer, ForumUser> newList = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> (LocalDate.now().getYear() - user.getDateOfBirth().getYear() > 20))
                .filter(user -> user.getUserPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("# elements: " + newList.size());
        newList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
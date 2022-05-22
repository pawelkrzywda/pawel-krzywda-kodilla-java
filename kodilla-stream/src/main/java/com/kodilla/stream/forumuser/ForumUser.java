package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int userPostsQuantity;


    public ForumUser(int userId, String userName, char sex, LocalDate dateOfBirth, int userPostsQuantity) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.userPostsQuantity = userPostsQuantity;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public int getUserPostsQuantity() {
        return userPostsQuantity;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "user Id='" + userId + '\'' +
                " username='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", date of birth=" + dateOfBirth +
                ", quantity of posts='" + userPostsQuantity + '\'' +
                '}';
    }
}

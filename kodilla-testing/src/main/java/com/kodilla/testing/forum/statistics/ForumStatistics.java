package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsPerUserQuantity;
    private double averageCommentsPerUserQuantity;
    private double averageCommentsPerPostQuantity;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUserQuantity() {
        return averagePostsPerUserQuantity;
    }

    public double getAverageCommentsPerUserQuantity() {
        return averageCommentsPerUserQuantity;
    }

    public double getAverageCommentsPerPostQuantity() {
        return averageCommentsPerPostQuantity;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = (statistics.usersNames()).size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if(usersQuantity != 0){averagePostsPerUserQuantity = (double) postsQuantity / (double) usersQuantity;}
        if(usersQuantity != 0){averageCommentsPerUserQuantity = (double) commentsQuantity / (double) usersQuantity;}
        if(postsQuantity != 0){averageCommentsPerPostQuantity = (double) commentsQuantity / (double) postsQuantity;}
    }

    public String showStatistics(){
        return "Statistics";
    }
}

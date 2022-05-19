package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    private List<String> generateListOfUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            resultList.add("User" + n);
        }
        return resultList;
    }

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("Test started.");
    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("Test finished.");
    }

    @Test
    void testStatsWithZeroPosts(){
        // Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateListOfUsers(42);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(255);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // When
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUserQuantity();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUserQuantity();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPostQuantity();

        // Then
        Assertions.assertEquals(0, averagePostsPerUser);
        Assertions.assertEquals(255.0/42.0, averageCommentsPerUser);
        Assertions.assertEquals(0, averageCommentsPerPost);

    }

    @Test
    void testStatsWith1000Posts(){
        // Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateListOfUsers(42);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(255);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // When
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUserQuantity();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUserQuantity();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPostQuantity();

        // Then
        Assertions.assertEquals(1000.0/42.0, averagePostsPerUser);
        Assertions.assertEquals(255.0/42.0, averageCommentsPerUser);
        Assertions.assertEquals(0.255, averageCommentsPerPost);
    }

    @Test
    void testStatsWithZeroComments(){
        // Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateListOfUsers(42);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // When
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUserQuantity();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUserQuantity();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPostQuantity();

        // Then
        Assertions.assertEquals(1000.0/42.0, averagePostsPerUser);
        Assertions.assertEquals(0, averageCommentsPerUser);
        Assertions.assertEquals(0, averageCommentsPerPost);
    }

    @Test
    void testStatsWithFewerCommentsThanPosts(){
        // Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateListOfUsers(42);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(785);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // When
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUserQuantity();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUserQuantity();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPostQuantity();

        // Then
        Assertions.assertEquals(1000.0/42.0, averagePostsPerUser);
        Assertions.assertEquals(785.0/42.0, averageCommentsPerUser);
        Assertions.assertEquals(0.785, averageCommentsPerPost);
    }

    @Test
    void testStatsFewerPostsThanComments(){
        // Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateListOfUsers(42);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(212);
        when(statisticsMock.commentsCount()).thenReturn(785);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // When
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUserQuantity();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUserQuantity();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPostQuantity();

        // Then
        Assertions.assertEquals(212.0/42.0, averagePostsPerUser);
        Assertions.assertEquals(785.0/42.0, averageCommentsPerUser);
        Assertions.assertEquals(785.0/212.0, averageCommentsPerPost);
    }

    @Test
    void testStatsWithZeroUsers(){
        // Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateListOfUsers(0);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(212);
        when(statisticsMock.commentsCount()).thenReturn(785);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // When
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUserQuantity();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUserQuantity();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPostQuantity();

        // Then
        Assertions.assertEquals(0, averagePostsPerUser);
        Assertions.assertEquals(0, averageCommentsPerUser);
        Assertions.assertEquals(785.0/212.0, averageCommentsPerPost);
    }

    @Test
    void testStatsWith1000Users(){
        // Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> users = generateListOfUsers(1000);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(212);
        when(statisticsMock.commentsCount()).thenReturn(785);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // When
        double averagePostsPerUser = forumStatistics.getAveragePostsPerUserQuantity();
        double averageCommentsPerUser = forumStatistics.getAverageCommentsPerUserQuantity();
        double averageCommentsPerPost = forumStatistics.getAverageCommentsPerPostQuantity();

        // Then
        Assertions.assertEquals(0.212, averagePostsPerUser);
        Assertions.assertEquals(0.785, averageCommentsPerUser);
        Assertions.assertEquals(785.0/212.0, averageCommentsPerPost);
    }


}

package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @BeforeEach
    void setup() {
        statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
    }

    private List<String> createUsersList(int count) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            users.add("User" + i);
        }
        return users;
    }

    @Test
    void testWhenPostsCountIsZero() {
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(createUsersList(10));

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(0, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getAverageCommentsPerPost());
        assertEquals(5.0, forumStatistics.getAverageCommentsPerUser(), 0.01);
    }

    @Test
    void testWhenPostsCountIsThousand() {
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.usersNames()).thenReturn(createUsersList(100));

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(10.0, forumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(5.0, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    void testWhenCommentsCountIsZero() {
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(createUsersList(10));

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testWhenCommentsLessThanPosts() {
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(createUsersList(10));

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertTrue(forumStatistics.getAverageCommentsPerPost() < 1);
        assertTrue(forumStatistics.getAverageCommentsPerUser() < 10);
    }

    @Test
    void testWhenCommentsGreaterThanPosts() {
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(createUsersList(10));

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertTrue(forumStatistics.getAverageCommentsPerPost() > 1);
        assertTrue(forumStatistics.getAverageCommentsPerUser() > 10);
    }

    @Test
    void testWhenUsersCountIsZero() {
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(0, forumStatistics.getAveragePostsPerUser());
        assertEquals(0, forumStatistics.getAverageCommentsPerUser());
    }

    @Test
    void testWhenUsersCountIsHundred() {
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(createUsersList(100));

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(5.0, forumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(10.0, forumStatistics.getAverageCommentsPerUser(), 0.01);
    }
}
package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getAge() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() != 0)
                .collect(Collectors.toMap(forumUser -> forumUser.getIdNumber(), forumUser -> forumUser));

        System.out.println("# elements: " + resultMapOfForumUsers.size());
        resultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .forEach(System.out::println);
    }
}
package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Jan Kowalski", 'M', LocalDate.of(2002, 10, 6), 15));
        forumUserList.add(new ForumUser(2, "Anna Nowak", 'F',LocalDate.of(1975, 12, 3)  , 22));
        forumUserList.add(new ForumUser(3, "Marek Kowalski", 'M',LocalDate.of(1999, 1, 16) , 5));
        forumUserList.add(new ForumUser(4, "Adam Nowak", 'M',LocalDate.of(2004, 2, 14) , 0));
        forumUserList.add(new ForumUser(5, "Ola Zielona", 'F',LocalDate.of(2010, 7, 22) , 10));
        forumUserList.add(new ForumUser(6, "Tomek Tomek", 'M',LocalDate.of(1988, 10, 10) , 4));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}

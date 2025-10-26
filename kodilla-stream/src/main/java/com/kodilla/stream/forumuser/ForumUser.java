package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ForumUser {

    private final int idNumber;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int NumberOfPosts;

    public ForumUser(int idNumber, String username, char sex, LocalDate birthday, int numberOfPosts) {
        this.idNumber = idNumber;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        NumberOfPosts = numberOfPosts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getNumberOfPosts() {
        return NumberOfPosts;
    }

    public int getAge() {
        LocalDateTime now = LocalDateTime.now();
        int age = now.getYear() - birthday.getYear();

        if (now.getMonthValue() < birthday.getMonthValue() ||
                (now.getMonthValue() == birthday.getMonthValue() && now.getDayOfMonth() < birthday.getDayOfMonth())) {
            age = age - 1;
        }
        return age;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + idNumber +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", NumberOfPosts=" + NumberOfPosts +
                '}';
    }
}

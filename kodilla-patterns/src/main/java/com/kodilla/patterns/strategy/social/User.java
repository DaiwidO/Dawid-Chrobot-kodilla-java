package com.kodilla.patterns.strategy.social;

public class User {

    String name;
    SocialPublisher socialPublisher;

    User(String name) {
        this.name = name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getName() {
        return name;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String shareOnSocial() {
        return socialPublisher.share();
    }
}

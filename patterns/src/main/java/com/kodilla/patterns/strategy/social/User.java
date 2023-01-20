package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publishers.SocialPublisher;

public class User {

    private final String username;
    protected SocialPublisher socialMedium;

    public User(String username) {
        this.username = username;
    }

    public String sharePost() {
        return "Post shared on: " + socialMedium.share();
    }

    public String getUsername() {
        return username;
    }

    public void setSocialMedium(SocialPublisher socialMedium) {
        this.socialMedium = socialMedium;
    }
}

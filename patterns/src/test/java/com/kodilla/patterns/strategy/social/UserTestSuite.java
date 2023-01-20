package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        Millenials drogoLucas = new Millenials("Drogo Lucas");
        YGeneration dogficeci = new YGeneration("Dogficeci");
        ZGeneration zineal = new ZGeneration("Zineal");

        //When
        String drogoSocialmedia = drogoLucas.sharePost();
        System.out.println(drogoSocialmedia);
        String dogficiSocialmedia = dogficeci.sharePost();
        System.out.println(dogficiSocialmedia);
        String zinealSocialmedia = zineal.sharePost();
        System.out.println(zinealSocialmedia);

        //Then
        assertAll(() -> assertEquals("Post shared on: [Facebook]", drogoSocialmedia),
                () -> assertEquals("Post shared on: [Twitter]", dogficiSocialmedia),
                () -> assertEquals("Post shared on: [Snapchat]", zinealSocialmedia));
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        Millenials drogoLucas = new Millenials("Drogo Lucas");

        //When
        String drogoSocialmedia = drogoLucas.sharePost();
        System.out.println(drogoSocialmedia);
        drogoLucas.setSocialMedium(new TwitterPublisher());
        drogoSocialmedia = drogoLucas.sharePost();
        System.out.println(drogoSocialmedia);

        //Then
        assertEquals("Post shared on: [Twitter]", drogoSocialmedia);
    }
}

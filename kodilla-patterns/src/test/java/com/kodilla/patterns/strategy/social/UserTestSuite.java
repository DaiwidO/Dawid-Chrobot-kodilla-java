package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        Millenials millenials = new Millenials("Barbara");
        YGeneration yGeneration = new YGeneration("Zofia");
        ZGeneration zGeneration = new ZGeneration("Antek");

        //When
        String mResult = millenials.shareOnSocial();
        String yResult = yGeneration.shareOnSocial();
        String zResult = zGeneration.shareOnSocial();

        //Then
        assertEquals("Facebook publisher is sharing...", mResult);
        assertEquals("Twitter publisher is sharing...", yResult);
        assertEquals("Snapchat publisher is sharing...", zResult);

    }
    @Test
    void testIndividualSharingStrategy(){
        //Given
        Millenials millenials = new Millenials("Barbara");
        YGeneration yGeneration = new YGeneration("Zofia");
        ZGeneration zGeneration = new ZGeneration("Antek");
        FacebookPublisher facebookPublisher = new FacebookPublisher();

        //When
        millenials.setSocialPublisher(facebookPublisher);
        yGeneration.setSocialPublisher(facebookPublisher);
        zGeneration.setSocialPublisher(new TwitterPublisher());
        String mResult = millenials.shareOnSocial();
        String yResult = yGeneration.shareOnSocial();
        String zResult = zGeneration.shareOnSocial();

        //Then
        assertEquals("Facebook publisher is sharing...", mResult);
        assertEquals("Facebook publisher is sharing...", yResult);
        assertEquals("Twitter publisher is sharing...", zResult);
    }
}

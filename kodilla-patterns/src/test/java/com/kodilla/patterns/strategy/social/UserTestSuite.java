package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite{

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User millenial = new Millenials("Mike");
        User genY = new YGeneration("John");
        User genZ = new ZGeneration("Jessica");

        //When
        String millenialPost = millenial.sharePost();
        System.out.println("Mike(Millenials) posted on: " + millenialPost);
        String genYPost = genY.sharePost();
        System.out.println("John(GenY) posted on: " + genYPost);
        String genZPost = genZ.sharePost();
        System.out.println("Jessica(GenZ) posted on: " + genZPost);

        //Then
        assertEquals("Twitter", millenialPost);
        assertEquals("Facebook", genYPost);
        assertEquals("Snapchat", genZPost);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User millenial = new Millenials("Mike");

        //When
        String millenialPost = millenial.sharePost();
        System.out.println("Mike(Millenials) posted on: " + millenialPost);
        millenial.setSocialPublisher(new SnapchatPublisher());
        millenialPost = millenial.sharePost();
        System.out.println("Mike(Millenials) posted on: " + millenialPost);

        //Then
        assertEquals("Snapchat", millenialPost);
    }
}

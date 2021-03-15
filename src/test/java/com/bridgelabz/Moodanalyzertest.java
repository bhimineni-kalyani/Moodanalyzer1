package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Moodanalyzertest {
    private Assertions Assert;

    @Test
    public void givenMessageReturnSad() {
        String message = "I am in sad Mood";
        Moodanalyzer mood=new Moodanalyzer(message);
        String message1= mood.analyzeMood();
        Assertions.assertEquals("Sad",message1);
    }

    @Test
    public void giveMessageReturnHappy() {
        String message = "I am in any Mood";
        Moodanalyzer mood=new Moodanalyzer(message);
        String message1= mood.analyzeMood();
        Assert.assertEquals("Happy",message1);
    }
}
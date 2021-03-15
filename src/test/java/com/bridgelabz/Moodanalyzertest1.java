package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class Moodanalyzertest1 {
    Moodanalyzer mood;

    @Test
    public void testSadMood(){
        Moodanalyzer1 mood= new Moodanalyzer1("I am in Sad Mood");
        System.out.println(mood.analyzeMood());
    }

    @Test
    public void testHappyMood(){
        Moodanalyzer1 mood= new Moodanalyzer1("I am in Happy Mood");
        System.out.println(mood.analyzeMood());
    }
}
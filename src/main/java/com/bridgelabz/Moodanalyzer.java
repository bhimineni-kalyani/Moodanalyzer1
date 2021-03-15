package com.bridgelabz;

public class Moodanalyzer {
    private String message;

    public Moodanalyzer(String message) {
        this.message=message;
    }

    public String analyzeMood() {
        if(message.contains("sad")) {
            return "Sad";
        }
        else {
            return "Happy";
        }
    }
}
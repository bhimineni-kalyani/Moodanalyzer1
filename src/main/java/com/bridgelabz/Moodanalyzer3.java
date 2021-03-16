package com.bridgelabz;

public class Moodanalyzer3 {
    public String message;

    public Moodanalyzer3(String message) {
        this.message = message;
    }

    public String analyzeMood() throws MoodanalyzerException {
        try {
            if (message == (null)) {
                throw new MoodanalyzerException("Invalid");
            }
            return message.contains("sad") ? "SAD" : "HAPPY";
        }
        catch (MoodanalyzerException e) {
            return "Handle Exception";
        }
    }
}
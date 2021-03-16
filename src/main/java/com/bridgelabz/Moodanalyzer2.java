package com.bridgelabz;

public class Moodanalyzer2 {
    public String message;

    public void Moodanalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        try {
            if (message.contains("sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {
            System.out.println("Invalid");
        }
        return "Handle Exception";
    }
}
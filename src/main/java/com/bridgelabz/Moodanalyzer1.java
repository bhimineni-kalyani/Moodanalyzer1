package com.bridgelabz;

public class Moodanalyzer1 {

        public String message;
        public Moodanalyzer1(String message) {
            this.message = message;
        }

        public String analyzeMood() {
            if (message.contains("sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }
}
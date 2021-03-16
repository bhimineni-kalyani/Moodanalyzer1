package com.bridgelabz;

public class Moodanalyzertest3 {
    private String message;
    private Object MoodanalyzerException;

    public void MoodAnalyzer3() {
        this("I am in Sad Mood");
    }
    public void MoodAnalyzer3(String message) {
        this.message=message;
    }

    public String analyseMood() throws MoodanalyzerException {
        try {
            if (message.length() == 0)
            {
                throw new MoodanalyzerException(MoodanalyzerException.ExceptionType.ENTERED_EMPTY,"Enter empty or Null");
            }
            if (message.contains("sad")) {
                return "Sad";
            }
            else {
                return "Happy";
            }
        }
        catch (NullPointerException e){
            throw new MoodanalyzerException(MoodanalyzerException.ExceptionType.ENTERED_NULL,"Enter empty or Null");
        }
    }
}
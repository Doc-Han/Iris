package com.banana.iris.models;

public class tab1_list_model {
    private String username;
    private String timeStamp;
    private String advice;
    private int likes;
    private int comments;

    public tab1_list_model(String username, String timeStamp, String advice, int likes, int comments) {
        this.username = username;
        this.timeStamp = timeStamp;
        this.advice = advice;
        this.likes = likes;
        this.comments = comments;
    }

    public String getUsername() {
        return username;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getAdvice() {
        return advice;
    }

    public int getLikes() {
        return likes;
    }

    public int getComments() {
        return comments;
    }
}

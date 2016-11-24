package com.example.dell.notification;

/**
 * Created by Dell on 11/23/2016.
 */
public class Notification {
    private int image;
    private String message;
    private String time;

    public Notification(int image, String message, String time) {
        this.image = image;
        this.message = message;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

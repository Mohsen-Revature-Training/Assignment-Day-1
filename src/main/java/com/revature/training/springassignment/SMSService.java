package com.revature.training.springassignment;

public class SMSService implements MessageService {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void sendMessage() {
        System.out.println("SMS sent: " + message);
    }
}

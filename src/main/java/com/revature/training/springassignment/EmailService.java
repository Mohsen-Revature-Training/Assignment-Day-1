package com.revature.training.springassignment;

public class EmailService implements MessageService {
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
        System.out.println("Email sent: " + message);
    }
}

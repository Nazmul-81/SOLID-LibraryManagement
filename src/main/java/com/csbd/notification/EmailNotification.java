package com.csbd.notification;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Send Email: "+ message);
    }
}

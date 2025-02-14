package com.csbd.service;

import com.csbd.notification.Notification;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LibraryService {
    private final Notification notification;

    public void notifyUsers(String message){
        notification.sendNotification(message);
    }
}

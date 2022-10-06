package com.codeit.designpatterns.strategy;

public class ChatClient {

    public void send(String message, Encryption encryption) {
        encryption.encrypt();
        System.out.println("Sending the encrypted message...");
    }
}

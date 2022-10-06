package com.codeit.designpatterns.strategy;

public class Main {
    public static void main(String args[]) {
        ChatClient chatClient = new ChatClient();
        chatClient.send("Test Message", new DESEncryption());
        chatClient.send("Test Message", new AESEncryption());
    }
}

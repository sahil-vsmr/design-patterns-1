package com.codeit.designpatterns.strategy;

public class AESEncryption implements Encryption{

    @Override
    public void encrypt() {
        System.out.println("Using AES");
    }
}

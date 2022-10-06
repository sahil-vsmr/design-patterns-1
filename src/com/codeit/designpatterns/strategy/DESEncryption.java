package com.codeit.designpatterns.strategy;

public class DESEncryption implements Encryption{

    @Override
    public void encrypt() {
        System.out.println("Using DES");
    }
}

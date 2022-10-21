package com.codeit.designpatterns.template;

public class Main {
    public static void main(String args[]) {
        Window window = new OneWindow();
        window.close();
        window = new TwoWindow();
        window.close();
    }
}

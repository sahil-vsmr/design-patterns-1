package com.codeit.designpatterns.state;

public class Walking implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}

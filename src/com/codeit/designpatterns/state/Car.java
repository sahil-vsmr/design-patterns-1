package com.codeit.designpatterns.state;

public class Car implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}

package com.codeit.designpatterns.state;

public class Main {
    public static void main(String args[]) {
        DirectionService directionService = new DirectionService();
        directionService.setTravelMode(new Bicycle());
        directionService.getTravelMode().getETA();
        directionService.getTravelMode().getDirection();
        directionService.setTravelMode(new Car());
        directionService.getTravelMode().getETA();
        directionService.getTravelMode().getDirection();
    }
}

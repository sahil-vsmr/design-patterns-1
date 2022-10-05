package com.codeit.designpatterns.state;

public class DirectionService {
    private TravelMode travelMode;

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public TravelMode getTravelMode() {
        return this.travelMode;
    }
}

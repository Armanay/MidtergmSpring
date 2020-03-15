package com.example.springparking.statePattern;

import com.example.springparking.entity.Place;

public class PlaceTrue implements IPlaceStates{

    @Override
    public void ParkingPlaceTrue(Place place) {
        System.out.println("This place is alredy free");
    }

    @Override
    public void ParkingPlaceFalse(Place place) {
//        System.out.println("This place was free and now this place is not free");
        place.setCurrentState(new PlaceFalse());
    }
}

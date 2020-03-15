package com.example.springparking.statePattern;

import com.example.springparking.entity.Place;

public class PlaceFalse implements IPlaceStates{
    @Override
    public void ParkingPlaceTrue(Place place) {
//        System.out.println("You leaving this place and this place is free now");
        place.setCurrentState(new PlaceTrue());
    }

    @Override
    public void ParkingPlaceFalse(Place place) {
        System.out.println("This place is alredy not free");
    }

}

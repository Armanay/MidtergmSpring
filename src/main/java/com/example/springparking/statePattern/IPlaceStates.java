package com.example.springparking.statePattern;

import com.example.springparking.entity.Place;

public interface IPlaceStates {
    void ParkingPlaceTrue(Place place);//свободный
    void ParkingPlaceFalse(Place place);//занятый
}

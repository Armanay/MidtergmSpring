package com.example.springparking.entity;

import com.example.springparking.statePattern.IPlaceStates;

public class Place {
    private IPlaceStates currentState;
    private int Palce_id;

    public IPlaceStates getCurrentState() {
        return currentState;
    }

    public int getPalce_id() {
        return Palce_id;
    }

    public void setPalce_id(int palce_id) {
        Palce_id = palce_id;
    }

    public void setCurrentState(IPlaceStates currentState) {
        this.currentState = currentState;
    }

    public void ParkingPlaceTrue(){
        currentState.ParkingPlaceTrue(this);
    }
    public void ParkingPlaceFalse(){
        currentState.ParkingPlaceFalse(this);
    }

//    @Override
//    public String toString() {
//        return "Place{" + "currentState=" + getCurrentState() + ", Palce_id=" + Palce_id + '}';
//    } @Override
    public String toString() {
        return "Place{" + " Palce_id=" + Palce_id + '}';
    }
}

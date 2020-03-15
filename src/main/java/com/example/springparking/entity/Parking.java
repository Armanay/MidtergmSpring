package com.example.springparking.entity;

import com.example.springparking.statePattern.PlaceTrue;

import java.util.ArrayList;

public class Parking {
    private String parkingName;
    private int id;
    private ArrayList<Place> places=new ArrayList<>();

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName)
    {
        this.parkingName = parkingName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addPlace(Place place){
        if(places.contains(place)){
            System.out.println("This place is already exists!");
        }else{
            places.add(place);
        }
    }
    public void listFreePlaces(){
        for (Place p: places){
            if(p.getCurrentState() instanceof PlaceTrue){
                System.out.println("Place with id: " + p.getPalce_id() + " is free now");
            }
        }
    }
}

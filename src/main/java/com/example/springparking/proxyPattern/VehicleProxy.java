package com.example.springparking.proxyPattern;

import com.example.springparking.entity.Place;
import com.example.springparking.entity.Vehicle;
import com.example.springparking.statePattern.PlaceFalse;
import com.example.springparking.statePattern.PlaceTrue;

public class VehicleProxy implements IServiceVehicle{
    private static Vehicle vehicle=new Vehicle();

    @Override
    public void TakePlace(Place place, Vehicle veh) {
        if(place.getCurrentState() instanceof PlaceTrue){
            if(!veh.isHasPlace()){
                vehicle.TakePlace(place,veh);
                place.ParkingPlaceFalse();
                veh.setHasPlace(true);
            }
            else{
                System.out.println("This vehicle is already take the place");
            }
        }
        else{
            System.out.println("Choosen place is not free, id = "+place.getPalce_id());
        }
    }

    @Override
    public void LeavePlace(Place place,Vehicle veh) {
        if(place.getCurrentState() instanceof PlaceFalse){
            if(veh.isHasPlace()){
                if(veh.vehPlace.contains(place)){
                    vehicle.LeavePlace(place,veh);
                    place.ParkingPlaceTrue();
                    veh.setHasPlace(false);
                }
                else{
                    System.out.println("Sorry, this vehicle is not on this place!");
                }
            }
            else{
                System.out.println("Vehicle does not have place");
            }
        }
        else{
            System.out.println("This place is not choosen initially");
        }
    }

    @Override
    public void DisplayVehPlaces() {
        vehicle.DisplayVehPlaces();
    }

    @Override
    public void setId(int id) {
        vehicle.setId(id);
    }

    @Override
    public void setName(String name) {
        vehicle.setName(name);
    }

    @Override
    public void setColor(String color) {
        vehicle.setColor(color);
    }

    @Override
    public void setBodyType(String type) {
        vehicle.setBodyType(type);
    }
}

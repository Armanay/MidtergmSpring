package com.example.springparking.event;

import com.example.springparking.entity.Place;
import com.example.springparking.entity.Vehicle;
import org.springframework.context.ApplicationEvent;

public class TakePlaceEvent extends ApplicationEvent {
    private Place place;
    private Vehicle vehicle;

    public TakePlaceEvent(Object source, Place place, Vehicle vehicle) {
        super(source);
        this.place = place;
        this.vehicle = vehicle;
    }

    public Place getPlace(){
        return this.place;
    }
    public Vehicle getVehicle(){
        return this.vehicle;
    }
}

package com.example.springparking.event;

import com.example.springparking.entity.Place;
import org.springframework.context.ApplicationEvent;

public class AvailablePlaceEvent extends ApplicationEvent {
    private Place place;

    public AvailablePlaceEvent(Object source, Place place) {
        super(source);
        this.place = place;
    }

    public Place getPlace(){
        return this.place;
    }
}

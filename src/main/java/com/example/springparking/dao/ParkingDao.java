package com.example.springparking.dao;

import com.example.springparking.entity.Parking;
import com.example.springparking.entity.Place;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class ParkingDao implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher eventPublisher;
    private ArrayList<Parking> parkings = new ArrayList<>();

    public void addParking(Parking parking){
        parkings.add(parking);

    }
    public void getFreePlaces(Parking parking){
        parking.listFreePlaces();
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher=applicationEventPublisher;
    }
}

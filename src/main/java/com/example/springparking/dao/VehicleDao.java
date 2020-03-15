package com.example.springparking.dao;

import com.example.springparking.entity.Place;
import com.example.springparking.entity.Vehicle;
import com.example.springparking.event.AvailablePlaceEvent;
import com.example.springparking.event.LeavePlaceEvent;
import com.example.springparking.event.TakePlaceEvent;
import com.example.springparking.proxyPattern.IServiceVehicle;
import com.example.springparking.proxyPattern.VehicleProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.rowset.JdbcRowSet;
import java.util.ArrayList;

@Component
public class VehicleDao implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher eventPublisher;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    public IServiceVehicle serviceVehicle = new VehicleProxy();

    public void TakePlace(Vehicle vehicle, Place place){
        serviceVehicle.TakePlace(place,vehicle);
        this.eventPublisher.publishEvent(new TakePlaceEvent(this, place, vehicle));
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void LeavePlace(Vehicle vehicle, Place place){
        serviceVehicle.LeavePlace(place,vehicle);
        this.eventPublisher.publishEvent(new LeavePlaceEvent(this, place, vehicle));
        this.eventPublisher.publishEvent(new AvailablePlaceEvent(this, place));
    }

    public void DisplayVehPlaces(){
        serviceVehicle.DisplayVehPlaces();
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}

package com.example.springparking.proxyPattern;

import com.example.springparking.entity.Place;
import com.example.springparking.entity.Vehicle;
import org.springframework.stereotype.Component;

public interface IServiceVehicle {
    void TakePlace(Place place, Vehicle veh);
    void LeavePlace(Place place, Vehicle veh);
    void DisplayVehPlaces();
    void setId(int id);
    void setName(String name);
    void setColor(String color);
    void setBodyType(String type);
}

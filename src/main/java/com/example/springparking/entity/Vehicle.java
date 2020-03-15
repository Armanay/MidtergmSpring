package com.example.springparking.entity;

import com.example.springparking.proxyPattern.IServiceVehicle;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class Vehicle implements IServiceVehicle {
    private int id;
    private String name;
    private String color;
    private String BodyType;// Тип Кузова
    private boolean hasPlace=false;
    public ArrayList<Place> vehPlace=new ArrayList<>();



    public void TakePlace(Place place, Vehicle veh){
        veh.vehPlace.add(place);
    }

    @Override
    public void LeavePlace(Place place,Vehicle veh) {
        veh.vehPlace.remove(place);

    }

    public void DisplayVehPlaces() {
        for(Place p:vehPlace){
            System.out.println(toString() + " got " + p.toString());
        }
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setBodyType(String type) {
        this.BodyType = type;
    }

    public boolean isHasPlace() {
        return hasPlace;
    }

    public void setHasPlace(boolean hasPlace) {
        this.hasPlace = hasPlace;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", BodyType='" + BodyType + '\'' +
                ", hasPlace=" + hasPlace +
                ", vehPlace=" + vehPlace +
                '}';
    }
}

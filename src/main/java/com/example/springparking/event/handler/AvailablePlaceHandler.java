package com.example.springparking.event.handler;

import com.example.springparking.event.AvailablePlaceEvent;
import com.example.springparking.event.LeavePlaceEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AvailablePlaceHandler implements ApplicationListener<AvailablePlaceEvent> {

    @Override
    public void onApplicationEvent(AvailablePlaceEvent availablePlaceEvent) {
        System.out.println(availablePlaceEvent.getPlace() + " is free now");
    }
}

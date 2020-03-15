package com.example.springparking.event.handler;

import com.example.springparking.event.LeavePlaceEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LeavePlaceHandler implements ApplicationListener<LeavePlaceEvent> {
    @Override
    public void onApplicationEvent(LeavePlaceEvent leavePlaceEvent) {
        System.out.println(leavePlaceEvent.getVehicle() + " leaves " + leavePlaceEvent.getPlace());
    }
}

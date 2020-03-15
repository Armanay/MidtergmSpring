package com.example.springparking.event.handler;

import com.example.springparking.event.LeavePlaceEvent;
import com.example.springparking.event.TakePlaceEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TakePlaceHandler implements ApplicationListener<TakePlaceEvent> {

    @Override
    public void onApplicationEvent(TakePlaceEvent takePlaceEvent) {
        System.out.println(takePlaceEvent.getVehicle() + " gets " + takePlaceEvent.getPlace());
    }
}

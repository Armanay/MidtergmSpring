package com.example.springparking.dao;

import com.example.springparking.entity.Place;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class PlaceDao implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher eventPublisher;

    public Place place;



    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}

package com.sample.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceUsingFactory implements SampleService {

    private final RestaurantFactory restaurantFactory;

    public SampleServiceUsingFactory(RestaurantFactory restaurantFactory) {
        this.restaurantFactory = restaurantFactory;
    }

    public String getMessage(Country country) {
        Restaurant restaurant = this.restaurantFactory.getService(country.name());
        return restaurant.eat();
    }
}

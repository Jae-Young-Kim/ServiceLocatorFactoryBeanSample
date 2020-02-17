package com.sample.service.restaurants;

import com.sample.service.Restaurant;
import org.springframework.stereotype.Service;

@Service("JAPAN")
public class JapaneseRestaurant implements Restaurant {
    @Override
    public String eat() {
        return "Sushi";
    }
}

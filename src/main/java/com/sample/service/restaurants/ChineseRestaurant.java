package com.sample.service.restaurants;

import com.sample.service.Restaurant;
import org.springframework.stereotype.Service;

@Service("CHINA")
public class ChineseRestaurant implements Restaurant {
    @Override
    public String eat() {
        return "dumpling";
    }
}

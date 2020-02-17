package com.sample.service.restaurants;

import com.sample.service.Restaurant;
import org.springframework.stereotype.Service;

@Service("KOREA")
public class KoreanRestaurant implements Restaurant {
    @Override
    public String eat() {
        return "Kimchi";
    }
}

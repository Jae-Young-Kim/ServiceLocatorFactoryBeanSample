package com.sample.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SampleOnlyAutowired implements SampleService {

    private final Restaurant korRestaurant;
    private final Restaurant japRestaurant;
    private final Restaurant chnRestaurant;

    public SampleOnlyAutowired(@Qualifier("KOREA") Restaurant korRestaurant,
                               @Qualifier("JAPAN") Restaurant japRestaurant,
                               @Qualifier("CHINA") Restaurant chnRestaurant) {

        this.korRestaurant = korRestaurant;
        this.japRestaurant = japRestaurant;
        this.chnRestaurant = chnRestaurant;
    }

    @Override
    public String getMessage(Country country) {
        String message;
        switch (country) {
            case KOREA:
                message = korRestaurant.eat();
                break;
            case CHINA:
                message = chnRestaurant.eat();
                break;
            case JAPAN:
                message = japRestaurant.eat();
                break;
            default:
                throw new IllegalArgumentException();
        }

        return message;
    }
}

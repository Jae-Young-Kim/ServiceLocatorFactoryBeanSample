package com.sample.service;

import com.sample.config.RestaurantFactoryConfig;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SampleServiceUsingFactory.class, RestaurantFactoryConfig.class})
public class SampleServiceTest {

    @Autowired
    @Qualifier("sampleServiceUsingFactory")
    private SampleService sampleServiceUsingFactory;

    @Autowired
    @Qualifier("sampleOnlyAutowired")
    private SampleService sampleOnlyAutowired;

    @Test
    public void test() {
        Country country = Country.KOREA;
        String message1 = sampleServiceUsingFactory.getMessage(country);
        String message2 = sampleOnlyAutowired.getMessage(country);

        Assertions.assertEquals(message1, message2);
    }
}

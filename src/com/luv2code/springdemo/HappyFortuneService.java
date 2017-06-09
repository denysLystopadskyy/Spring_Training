package com.luv2code.springdemo;

import java.util.Random;

/**
 * Created by denys.lystopadskyy on 12/17/2016.
 */
public class HappyFortuneService implements FortuneService {

    Random random = new Random();

    @Override
    public String getFortune() {
        String[] strings = {
                "Today is your Lucky Day!",
                "Today you will win a price!",
                "Today you will go on vacation!"
        };

        return strings[random.nextInt(3)];
    }
}

package com.luv2code.springdemo;

/**
 * Created by denys.lystopadskyy on 12/14/2016.
 */
public class BjjCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 24 hours drilling berimbolo.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

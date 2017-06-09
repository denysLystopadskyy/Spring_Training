package com.luv2code.springdemo;

/**
 * Created by denys.lystopadskyy on 12/14/2016.
 */
public class BaseballCoach implements Coach {


    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use ny fortune service
        return fortuneService.getFortune();
    }

}

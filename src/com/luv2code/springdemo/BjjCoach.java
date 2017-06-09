package com.luv2code.springdemo;

/**
 * Created by denys.lystopadskyy on 12/14/2016.
 */
public class BjjCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;

    private String team;

    public BjjCoach(FortuneService fortuneService) {
        System.out.println("BjjCoach: inside arg constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 24 hours drilling berimbolo.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}

package com.luv2code.springdemo;

/**
 * Created by denys.lystopadskyy on 12/17/2016.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    //New fields for email and team
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside non-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside Fortune Service Setter.");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: Setting Email Address");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: Setting Team");
        this.team = team;
    }
}

package com.luv2code.springdemo;

/**
 * Created by denys.lystopadskyy on 12/14/2016.
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it: " + fortuneService.getFortune();
    }

    //init method
    public void initTrackCoachMethod(){
        System.out.println("Init" + this.getClass().getSimpleName());
    }

    //destroy method
    public void destroyTrackCoachMethod(){
        System.out.println("Destroy" + this.getClass().getSimpleName());
    }
}

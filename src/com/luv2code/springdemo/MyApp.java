package com.luv2code.springdemo;

/**
 * Created by denys.lystopadskyy on 12/14/2016.
 */
public class MyApp {
    public static void main(String[] args) {
        // create the object
        Coach theCoach = new TrackCoach();
        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by denys.lystopadskyy on 12/17/2016.
 */
public class SetterDemoApp {

    public static void main(String[] args) {
        //load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        //Calls to literal values
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        //close the context
        context.close();
    }
}

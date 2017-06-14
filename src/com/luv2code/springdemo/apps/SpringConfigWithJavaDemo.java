package com.luv2code.springdemo.apps;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.BjjCoach;
import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.configuration.ConfigClass;

public class SpringConfigWithJavaDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

        //retrieve bean from spring container
        Coach coach = context.getBean("trackCoach", Coach.class);
        callMethodsOnBean(coach);

        Coach swimCoach = context.getBean("swimCoach", Coach.class);
        callMethodsOnBean(swimCoach);

        BjjCoach bjjCoach = context.getBean("bjjCoach", BjjCoach.class);
        callMethodsOnBean(bjjCoach);
        System.out.println(bjjCoach.getEmailAddress());
        System.out.println(bjjCoach.getTeam());


        // close the context
        context.close();
    }

    private static void callMethodsOnBean(Coach coach) {
        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println("----------------------");
    }
}

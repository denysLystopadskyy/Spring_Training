package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

/**
 * Created by denys.lystopadskyy on 12/14/2016.
 */
public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach bjjCoach = context.getBean("bjjCoach", Coach.class);
        callMethodsOnBean(coach);
        callMethodsOnBean(bjjCoach);


        // close the context
        context.close();
    }

    private static void callMethodsOnBean(Coach coach) {
        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }
}

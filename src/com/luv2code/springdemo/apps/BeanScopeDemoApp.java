package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.TrackCoach;

/**
 * Created by denys.lystopadskyy on 6/9/2017.
 */
public class BeanScopeDemoApp {

    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        //retrieve bean from spring container
        Coach alphaCoach = context.getBean(TrackCoach.class);
        Coach betaCoach = context.getBean(TrackCoach.class);

        System.out.println("Pointing to the same memory address:" + alphaCoach.equals(betaCoach));

        System.out.println("AlphaCoach: " + alphaCoach);
        System.out.println("BetaCoach: " + betaCoach);

        context.close();
    }
}

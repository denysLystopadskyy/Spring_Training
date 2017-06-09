package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.TrackCoach;

/**
 * Created by denys.lystopadskyy on 6/10/2017.
 */
public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {
        //Create Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeSycle-applicationContext.xml");

        //Get bean
        Coach coach = context.getBean(TrackCoach.class);

        context.close();

    }
}

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.BjjCoach;

/**
 * Created by denys.lystopadskyy on 6/11/2017.
 */
public class ComponentScanDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("componentScan-applicationContext.xml");

        BjjCoach bjjCoach = context.getBean("bjjCoach", BjjCoach.class);

        System.out.println(bjjCoach.getDailyWorkout());
        System.out.println(bjjCoach.getDailyFortune());
        System.out.println(bjjCoach.getEmailAddress());
        System.out.println(bjjCoach.getTeam());

        context.close();
    }

}

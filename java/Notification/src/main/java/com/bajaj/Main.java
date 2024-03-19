package com.bajaj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


//        System.out.println("Hello world!");
//        BasicNotificationChecker basicNotificationChecker = new BasicNotificationChecker();
//        AdvancedNotificationChecker advancedNotificationChecker = new AdvancedNotificationChecker();
//        NotificationClient notificationClient = new NotificationClient(basicNotificationChecker);
//        notificationClient.send();

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        NotificationClient notificationClient = context.getBean("notificationClient", NotificationClient.class);
        notificationClient.send();

//        AdvancedNotificationChecker advancedNotificationChecker =
//                context.getBean("advancedNotificationChecker", AdvancedNotificationChecker.class);
//        advancedNotificationChecker.check("Hi");
//        System.out.println(advancedNotificationChecker);

//        AdvancedNotificationChecker advancedNotificationChecker1 =
//                context.getBean("advancedNotificationChecker", AdvancedNotificationChecker.class);
//        advancedNotificationChecker.check("Hi");
//        System.out.println(advancedNotificationChecker1);

    }
}
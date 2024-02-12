package com.bajaj;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public BasicNotificationChecker basicNotificationChecker(){
        return new BasicNotificationChecker();
    }

    @Bean
    public  AdvancedNotificationChecker advancedNotificationChecker(){
        return new AdvancedNotificationChecker();
    }

//    @Bean
//    public NotificationClient notificationClient(){
//        return new NotificationClient(advancedNotificationChecker());
//    }


    //setter injection
//    @Bean
//    public NotificationClient notificationClient(){
//        NotificationClient notificationClient = new NotificationClient();
//        notificationClient.setNotificationChecker(basicNotificationChecker());
//        return notificationClient;
//    }
}

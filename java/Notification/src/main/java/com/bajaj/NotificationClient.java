package com.bajaj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationClient {

    @Autowired
//    @Qualifier("basicNotificationChecker")
    NotificationChecker notificationChecker ;


    //autowired for whom need injection of object

    public NotificationClient (  @Qualifier("basicNotificationChecker") NotificationChecker notificationChecker ){
        this.notificationChecker = notificationChecker;
    }

//    public NotificationChecker getNotificationChecker() {
//        return notificationChecker;
//    }
//

    // @Autowired
//    public void setNotificationChecker(NotificationChecker notificationChecker) {
//        this.notificationChecker = notificationChecker;
//    }

    public void send(){

        String msg = "Hello World";
        if(notificationChecker.check(msg)){
            System.out.println("Notification check");
        }else {
            System.out.println("Notifiaction Valid");
        }
    }

}

package com.bajaj;


import org.springframework.stereotype.Component;

@Component
public class BasicNotificationChecker implements  NotificationChecker{


    @Override
    public boolean check(String msg) {

        System.out.println("Basic checking done");
        if(msg != null){
            return true;
        }
        return false;
    }
}

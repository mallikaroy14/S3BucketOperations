package com.bajaj;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class AdvancedNotificationChecker implements NotificationChecker{
    @Override
    public boolean check(String msg) {
        System.out.println("Advanced checking done");
        if(msg != null){
            return true;
        }
        return false;
    }
}

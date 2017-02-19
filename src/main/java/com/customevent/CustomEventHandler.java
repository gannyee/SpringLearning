package com.customevent;

import org.springframework.context.ApplicationListener;

/**
 * Created by gannyee on 2017/2/19.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}

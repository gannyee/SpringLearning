package com.customevent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by gannyee on 2017/2/19.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My Custom Event";
    }
}

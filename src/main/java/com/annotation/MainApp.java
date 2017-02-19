package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gannyee on 2017/2/19.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorld.class);

        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        helloWorld.setMessage("HelloWorld");
        helloWorld.getMessage();
    }
}

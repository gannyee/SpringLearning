package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gannyee on 2017/2/18.
 */
public class MainApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
     /*   HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();*/

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }

}

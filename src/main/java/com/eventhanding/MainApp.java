package com.eventhanding;

import com.annotation.HelloWorld;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gannyee on 2017/2/19.
 */
public class MainApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeansForEventHanding.xml");

        context.start();
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
        context.stop();
    }

}

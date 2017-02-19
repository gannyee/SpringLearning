package com.injectingcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gannyee on 2017/2/19.
 */
public class MainAppForInjectingCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansForInjectingCollection.xml");

        JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");
        javaCollection.getAddressList();
        javaCollection.getAddressSet();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();
    }
}

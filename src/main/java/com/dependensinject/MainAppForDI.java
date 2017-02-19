package com.dependensinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gannyee on 2017/2/18.
 */
public class MainAppForDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansForDI.xml");

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }

}

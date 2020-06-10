package com.melhamra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        Computer computer = applicationContext.getBean("computer", Computer.class);

        System.out.println(computer.getHardDisk().returnData());
    }
}

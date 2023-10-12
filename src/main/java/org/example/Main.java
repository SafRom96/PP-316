package org.example;

import org.example.config.MyConfig;
import org.example.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        System.out.println(communication.save(new User(3L, "James", "Brown", (byte) 26)) +
                communication.update(new User(3L, "Thomas", "Shelby", (byte) 26)) + communication.delete(3L));
    }
}
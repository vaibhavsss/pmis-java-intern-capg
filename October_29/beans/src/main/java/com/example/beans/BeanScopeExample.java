package com.example.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeExample {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ScopeConfiguration.class)) {
            SingletonBean firstSingletonBean = context.getBean(SingletonBean.class);
            SingletonBean secondSingletonBean = context.getBean(SingletonBean.class);

            PrototypeBean firstPrototypeBean = context.getBean(PrototypeBean.class);
            PrototypeBean secondPrototypeBean = context.getBean(PrototypeBean.class);

            System.out.println("Singleton objects are the same: " +
                    (firstSingletonBean == secondSingletonBean));
            System.out.println("Prototype objects are the same: " +
                    (firstPrototypeBean == secondPrototypeBean));
        }
    }
}

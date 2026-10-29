package com.example.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentBeanExample {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            /*
             * register() tells Spring which class should be managed.
             * GreetingService.class means "the Class object describing
             * GreetingService", not an object created with new.
             */
            context.register(GreetingService.class);

            /*
             * refresh() starts/prepares the context. During this step,
             * Spring creates the registered GreetingService bean.
             */
            context.refresh();

            /*
             * getBean() retrieves the object managed by Spring.
             * The returned object is assigned to the service variable,
             * so we can call its normal Java method.
             */
            GreetingService service = context.getBean(GreetingService.class);
            System.out.println(service.greet("Spring learner"));
        }
    }
}

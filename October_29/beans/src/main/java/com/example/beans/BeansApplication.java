package com.example.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeansApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(BeansApplication.class, args);

		BasicBean bean = context.getBean(BasicBean.class);

		System.out.println(bean.greet());
	}
}
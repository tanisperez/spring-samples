package com.tanis.spring.samples.profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(final String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		System.out.println("Starting...");
	}

}

package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GreetService {

	//@Autowired
	//@Qualifier("goodMorning")
	
	
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	private Greet greet = (Greet) context.getBean("greet");
	
	public void greet()
	{
		System.out.println(greet.greetMessage());
	}
	
}
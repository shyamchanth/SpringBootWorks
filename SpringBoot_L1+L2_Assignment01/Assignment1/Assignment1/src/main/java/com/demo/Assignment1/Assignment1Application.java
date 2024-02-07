package com.demo.Assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;





@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Assignment1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Assignment1Application.class, args);

		String[] beanNames= context.getBeanDefinitionNames();

		Arrays.sort(beanNames);
		for(String beanName : beanNames)
		{
			System.out.println(beanName);
		}
	}

}

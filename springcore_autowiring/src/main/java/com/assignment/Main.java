package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("Config1.xml");
			placestovisit ptv = context.getBean("ptv",placestovisit.class);
			System.out.println(ptv);
		}
}


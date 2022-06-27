package com.assignment.usingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("Config2.xml");
			placestovisit ptv1 = context.getBean("ptv1",placestovisit.class);
			System.out.println(ptv1);
			
		}
}


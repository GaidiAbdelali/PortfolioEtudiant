package com.iwim.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		
		
		System.out.println("sssssssssssssssssssss");
		ClassPathXmlApplicationContext context2=new ClassPathXmlApplicationContext(new String[] {"jpaContext.xml","config-security.xml"});

		System.out.println("aaaaaaaaaaaaaaaaaaaaa");
	}

}

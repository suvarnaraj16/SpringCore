package com.suneratech.raj.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suneratech.raj.bean.DbConn;
import com.suneratech.raj.config.AppConfig;

public class test {
	public static void main(String[] args) {
		//Creating Spring container Reference
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		//scan spring beans (classes) - using one package name
		context.scan("com.suneratech.raj.bean");
		
		//refresh or create object, provide data and link object etc...
		context.refresh();
		
		//read object(bean) and print
		Object obj = context.getBean("con",DbConn.class);
		
		
		//DbConn con = (DbConn)obj;
		System.out.println(obj);
		
		
		// close() the container
		context.close();
	}
}

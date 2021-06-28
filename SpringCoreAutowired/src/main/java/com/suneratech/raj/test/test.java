package com.suneratech.raj.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suneratech.raj.Config.AppConfig;
import com.suneratech.raj.bean.Address;
import com.suneratech.raj.bean.Employee;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = ac.getBean("eob",Employee.class);
		System.out.println(emp);
		ac.close();
	}

}

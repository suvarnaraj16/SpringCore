package com.suneratech.raj.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suneratech.raj.bean.EmpService;
import com.suneratech.raj.config.AppConfig;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService es = ac.getBean("emps",EmpService.class);
		System.out.println(es);
	}
}

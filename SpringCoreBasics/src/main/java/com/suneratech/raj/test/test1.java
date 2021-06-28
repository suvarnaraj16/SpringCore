package com.suneratech.raj.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suneratech.raj.bean.DbConn;
import com.suneratech.raj.config.AppConfig;

public class test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		DbConn obj = ac.getBean("con",DbConn.class);
		System.out.println(obj);
	}

}

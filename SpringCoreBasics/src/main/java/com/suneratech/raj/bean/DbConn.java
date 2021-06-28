package com.suneratech.raj.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DbConn {
//	public DbConn() {
//		System.out.println("Constructor called from DbConn Class");
//	}
//
//	@Override
//	public String toString() {
//		return "DbConn []";
//	}
	
	
	
	
	//@Value("OracleDriver")   //static values
	
	@Value("${dbdriver}")
	private String driver;
	 
	//@Value("jdbc:oracle")	//static values
	@Value("${dburl}")
	private String url;
	@Override
	public String toString() {
		return "DbConn [driver=" + driver + ", url=" + url + "]";
	}
	
	

}

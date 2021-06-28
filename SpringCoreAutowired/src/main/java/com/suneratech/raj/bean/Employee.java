package com.suneratech.raj.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eob")
public class Employee {
	@Value("101")
	private int empID;
	@Autowired(required = false)
	Address addr;
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", addr=" + addr + "]";
	}

}

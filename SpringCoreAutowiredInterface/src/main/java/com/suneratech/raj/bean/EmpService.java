package com.suneratech.raj.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emps")
public class EmpService {
	@Value("Providing Service")
	private String serv;
	
	@Autowired
	@Qualifier("empJdbcRepo")
	private IEmpRepo obj;

	@Override
	public String toString() {
		return "EmpService [serv=" + serv + ", obj=" + obj + "]";
	}

}

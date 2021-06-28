package com.suneratech.raj.bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class EmpJdbcRepo implements IEmpRepo {
	@Value("Oracle Driver")
	private String driver;
	@Value("1234")
	private String id;
	
	@Override
	public String toString() {
		return "EmpJdbcRepo [driver=" + driver + ", id=" + id + "]";
	}
	

}

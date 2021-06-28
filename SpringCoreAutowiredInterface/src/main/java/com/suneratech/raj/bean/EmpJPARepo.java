package com.suneratech.raj.bean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmpJPARepo implements IEmpRepo {
	@Value("Oracle Driver")
	private String driver;
	@Value("1234")
	private String id;
	
	@Override
	public String toString() {
		return "EmpJPARepo [driver=" + driver + ", id=" + id + "]";
	}
	

}

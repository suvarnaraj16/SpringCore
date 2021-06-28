package com.suneratech.raj.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aob")
public class Address {
	@Value("19-718")
	private String hno;
	@Value("Piduguralla")
	private String loc;
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", loc=" + loc + "]";
	}
	
}

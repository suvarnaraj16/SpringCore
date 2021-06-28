package com.suneratech.raj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "package com.suneratech.raj.bean")
//Loading Properties file into Spring Container
@PropertySource("classpath:app.properties")
public class AppConfig {
	
}

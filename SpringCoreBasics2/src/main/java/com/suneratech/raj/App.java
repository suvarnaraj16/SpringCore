package com.suneratech.raj;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.suneratech.raj.config.AppConfig;

public class App {
	public static void main(String[] args) {
//		Car car = new Car();
//		car.drive();
//		Bike obj = new Bike();
//		obj.drive();
//		
		//ApplicationContext ac = new ClassPathXmlApplicationContext(null, AppConfig.class);
	//	Vehicle vehicle = ac.getBean("vehicle",Bike.class);
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle vehicle = ac.getBean("car",Car.class);
		vehicle.drive();
	}

}

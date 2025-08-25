package com.example.exam;

import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		//개발자가 직접 제어
		
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring/appServlet");
		//제어의 역전을 통해 spring이 관리하는 bean 객체를 꺼내오기
		
		Car car = context.getBean(Car.class);
		System.out.println(c);
		System.out.println(car);
	}

}

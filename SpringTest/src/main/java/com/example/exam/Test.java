package com.example.exam;

import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		//�����ڰ� ���� ����
		
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring/appServlet");
		//������ ������ ���� spring�� �����ϴ� bean ��ü�� ��������
		
		Car car = context.getBean(Car.class);
		System.out.println(c);
		System.out.println(car);
	}

}

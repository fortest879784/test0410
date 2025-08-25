package com.example.exam;
//controllef 어노테이션은 내부적으로 @component라는 어노테이션을 상속받는다 
//servlet -context.xml에 선언되어있는 component-scan으로 찾아지고 bean으로 등록된다
//tomcat에 실행되고 ,디스패쳐서블릿의 생성자가 호출될 때 xml설정을 읽으면서 bean 으로 등록


@RequestMapping(value = "/", method = RequestMethod.GET)
//get 요청으로 "/" 로 요청이 았을 때 동작하는 컨트롤러 .
//home 메서드는 locate 와 model 에 의존하고 있다. 
//locale 과 model 또한 스프링이 관리하는 bean이기 때문에 
//"/"로 요청하여 home 메서드가 실행될 때 스프링이 의존성을 주입한다.
public class Car {
	private String name;
	private int plate;
	
	public Car(String a, double b) {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlate() {
		return plate;
	}
	public void setPlate(int plate) {
		this.plate = plate;
	}
	
	
	
}

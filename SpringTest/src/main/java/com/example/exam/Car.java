package com.example.exam;
//controllef ������̼��� ���������� @component��� ������̼��� ��ӹ޴´� 
//servlet -context.xml�� ����Ǿ��ִ� component-scan���� ã������ bean���� ��ϵȴ�
//tomcat�� ����ǰ� ,�����ļ����� �����ڰ� ȣ��� �� xml������ �����鼭 bean ���� ���


@RequestMapping(value = "/", method = RequestMethod.GET)
//get ��û���� "/" �� ��û�� ���� �� �����ϴ� ��Ʈ�ѷ� .
//home �޼���� locate �� model �� �����ϰ� �ִ�. 
//locale �� model ���� �������� �����ϴ� bean�̱� ������ 
//"/"�� ��û�Ͽ� home �޼��尡 ����� �� �������� �������� �����Ѵ�.
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

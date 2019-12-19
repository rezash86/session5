package taskautowire.model;

import org.springframework.stereotype.Component;


public class Car {
	
	private String name;

	public Car(String carName) {
		this.name = carName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void checkHealth() {
		System.out.println("I am alive");
	}
	
	
}

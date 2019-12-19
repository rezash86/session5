package taskautowire.model;

public class Owner {
	Car car;
	
	public Owner(Car car) {
		this.car = car;
	}
	
	public void showCarName() {
		System.out.println(car.getName());
	}
}

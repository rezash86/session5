package taskautowire.service;

import org.springframework.beans.factory.annotation.Autowired;

import taskautowire.model.Owner;


public class CarwashService {
	
	@Autowired
	Owner owner;
	
	public CarwashService() {
	}
	
	@Autowired
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Autowired
	public CarwashService(Owner o) {
		owner = o;
	}
	
	public void printInfo() {
		System.out.println(owner.showInfo());
	}
}

package taskautowire.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import taskautowire.model.Car;
import taskautowire.model.Owner;
import taskautowire.service.CarwashService;

//the same as beans.xml
@Configuration
public class AppConfiguration {
	
	//adding into xml
	@Bean
	public Car car() {
		return new Car("Toyota corola");
	}
	
	@Bean
	public Owner owner() {
		return new Owner(car());
	}
	
	@Bean
	public CarwashService carwashService() {
		return new CarwashService();
	}
}

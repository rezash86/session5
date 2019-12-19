package taskautowire.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import taskautowire.config.AppConfiguration;
import taskautowire.service.CarwashService;


public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = 
		new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		CarwashService bean = context.getBean(CarwashService.class);
		bean.printInfo();
		
	}
}

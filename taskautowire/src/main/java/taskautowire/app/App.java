package taskautowire.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import taskautowire.model.Owner;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("mybeans.xml");

		Owner owner = (Owner) context.getBean("ownerBean");
		owner.showCarName();
		((ClassPathXmlApplicationContext) (context)).close();
	}
}

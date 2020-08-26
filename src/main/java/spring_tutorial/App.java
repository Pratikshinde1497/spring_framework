package spring_tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		// 	ApplicationContext is the superset of BeanFactory
		
		Vehicle v = (Vehicle) con.getBean("vehicle");
		
		v.drive();
	}
}

package spring_tutorial;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle  {
	
	public void drive() {
		System.out.println("Bhhag Raha Hai...");
	}
}

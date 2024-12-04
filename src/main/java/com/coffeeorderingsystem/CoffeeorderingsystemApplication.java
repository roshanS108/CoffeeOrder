package com.coffeeorderingsystem;

import com.coffeeorderingsystem.BaseComponent.Coffee;
import com.coffeeorderingsystem.ConcreteComponent.BasicCoffee;
import com.coffeeorderingsystem.ConcreteDecorator.MilkDecorator;
import com.coffeeorderingsystem.ConcreteDecorator.SizeDecorator;
import com.coffeeorderingsystem.ConcreteDecorator.SoyMilkDecorator;
import com.coffeeorderingsystem.ConcreteDecorator.SugarDecorator;

//@SpringBootApplication
//public class CoffeeorderingsystemApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(CoffeeorderingsystemApplication.class, args);
//	}
//
//}
public class CoffeeorderingsystemApplication {
	public static void main(String[] args) {
		// Create a basic coffee
		Coffee coffee = new BasicCoffee();

		// Add milk
		coffee = new MilkDecorator(coffee);

		// Add sugar
		coffee = new SugarDecorator(coffee);

		// Add whipped cream
		coffee = new SoyMilkDecorator(coffee);

		// Print the final order
		System.out.println("Order: " + coffee.getDescription());
		System.out.println("Total Cost: $" + coffee.getCost());


		// Choose a size by directly applying the SizeDecorator
		coffee = new SizeDecorator(coffee, "Medium");

		// Add more decorations (like Milk, Sugar) if needed
		System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost() + " | Calories: " + coffee.getCalories());

		// Change size to "Large"
		coffee = new SizeDecorator(coffee, "Large");
		System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost() + " | Calories: " + coffee.getCalories());

	}
}

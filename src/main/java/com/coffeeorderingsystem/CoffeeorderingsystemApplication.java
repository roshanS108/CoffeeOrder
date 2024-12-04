package com.coffeeorderingsystem;

import com.coffeeorderingsystem.Component.Coffee;
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
		System.out.println("Welcome to the Coffee Ordering System!\n");

		// Step 1: Create a basic coffee
		Coffee coffee = new BasicCoffee();
		System.out.println("Base Order: " + coffee.getDescription());
		System.out.println("Base Cost: $" + coffee.getCost());
		System.out.println("Base Calories: " + coffee.getCalories());
		System.out.println();

		// Step 2: Add milk
		coffee = new MilkDecorator(coffee);
		System.out.println("After Adding Milk:");
		System.out.println("Order: " + coffee.getDescription());
		System.out.println("Cost: $" + coffee.getCost());
		System.out.println("Calories: " + coffee.getCalories());
		System.out.println();

		// Step 3: Add sugar
		coffee = new SugarDecorator(coffee);
		System.out.println("After Adding Sugar:");
		System.out.println("Order: " + coffee.getDescription());
		System.out.println("Cost: $" + coffee.getCost());
		System.out.println("Calories: " + coffee.getCalories());
		System.out.println();

		// Step 4: Add soy milk
		coffee = new SoyMilkDecorator(coffee);
		System.out.println("After Adding Soy Milk:");
		System.out.println("Order: " + coffee.getDescription());
		System.out.println("Cost: $" + coffee.getCost());
		System.out.println("Calories: " + coffee.getCalories());
		System.out.println();

		// Step 5: Apply a Medium size
		coffee = new SizeDecorator(coffee, "Medium");
		System.out.println("After Choosing Medium Size:");
		System.out.println("Order: " + coffee.getDescription());
		System.out.println("Cost: $" + coffee.getCost());
		System.out.println("Calories: " + coffee.getCalories());
		System.out.println();

		// Step 6: Change size to Large
		coffee = new SizeDecorator(coffee, "Large");
		System.out.println("After Upgrading to Large Size:");
		System.out.println("Order: " + coffee.getDescription());
		System.out.println("Cost: $" + coffee.getCost());
		System.out.println("Calories: " + coffee.getCalories());
		System.out.println();

		System.out.println("Thank you for using the Coffee Ordering System!");
	}
}

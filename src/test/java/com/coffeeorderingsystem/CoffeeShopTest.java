package com.coffeeorderingsystem;

import com.coffeeorderingsystem.Component.Coffee;
import com.coffeeorderingsystem.ConcreteComponent.BasicCoffee;
import com.coffeeorderingsystem.ConcreteDecorator.MilkDecorator;
import com.coffeeorderingsystem.ConcreteDecorator.SizeDecorator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeShopTest {

    @Test
    public void testCompleteOrder() {
        Coffee coffee = new BasicCoffee();
        coffee = new SizeDecorator(coffee, "Medium"); // Medium size
        coffee = new SizeDecorator(coffee, "Large");  // Then add Large size
        coffee = new MilkDecorator(coffee); // Add milk

        assertEquals("Plain coffee, Medium Size, Large Size, Milk", coffee.getDescription(), "Description should include all added components");
        assertEquals(4.00, coffee.getCost(), "Total cost should be $4.00");
        assertEquals(55, coffee.getCalories(), "Total calories should be 55");

        // Assert the updated description, cost, and calories
        assertTrue(coffee.getDescription().equals("Plain coffee, Medium Size, Large Size, Milk"));
        assertTrue(coffee.getCost() == 4.00);
        assertTrue(coffee.getCalories() == 55);
    }
}

package com.coffeeorderingsystem;

import com.coffeeorderingsystem.Component.Coffee;
import com.coffeeorderingsystem.ConcreteComponent.BasicCoffee;
import com.coffeeorderingsystem.ConcreteDecorator.SizeDecorator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SizeDecoratorTest {
    @Test
    public void testMediumSize() {
        Coffee coffee = new BasicCoffee();
        coffee = new SizeDecorator(coffee, "Medium");
        assertEquals("Plain coffee, Medium Size", coffee.getDescription(), "Description should include 'Medium Size'");
        assertEquals(2.50, coffee.getCost(), "Cost of medium size should be $2.50");
        assertEquals(15, coffee.getCalories(), "Medium size should have 15 calories");
        // Assert the updated description, cost, and calories
        assertTrue(coffee.getDescription().equals("Plain coffee, Medium Size"));
        assertTrue(coffee.getCost() == 2.50);
        assertTrue(coffee.getCalories() == 15);
    }
    @Test
    public void testLargeSize() {
        Coffee coffee = new BasicCoffee();
        coffee = new SizeDecorator(coffee, "Large");
        assertEquals("Plain coffee, Large Size", coffee.getDescription(), "Description should include 'Large Size'");
        assertEquals(3.00, coffee.getCost(), "Cost of large size should be $3.00");
        assertEquals(25, coffee.getCalories(), "Large size should have 25 calories");

        // Assert the updated description, cost, and calories
        assertTrue(coffee.getDescription().equals("Plain coffee, Large Size"));
        assertTrue(coffee.getCost() == 3.00);
        assertTrue(coffee.getCalories() == 25);
    }
    @Test
    public void testMultipleSizeDecorators() {
        Coffee coffee = new BasicCoffee();
        coffee = new SizeDecorator(coffee, "Medium");
        coffee = new SizeDecorator(coffee, "Large");  // Apply large size after medium

        assertEquals("Plain coffee, Medium Size, Large Size", coffee.getDescription(), "Description should include both sizes");
        assertEquals(3.50, coffee.getCost(), "Cost should be $3.50");
        assertEquals(35, coffee.getCalories(), "Calories should be 35 after applying both size decorators");

        assertTrue(coffee.getDescription().equals("Plain coffee, Medium Size, Large Size"));
        assertTrue(coffee.getCost() == 3.50);
        assertTrue(coffee.getCalories() == 35);
    }
}

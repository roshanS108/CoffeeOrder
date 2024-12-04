package com.coffeeorderingsystem;
import com.coffeeorderingsystem.Component.Coffee;
import com.coffeeorderingsystem.ConcreteComponent.BasicCoffee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BasicCoffeeTest {
    @Test
    public void testBasicCoffeeDescription() {
        Coffee coffee = new BasicCoffee();
        assertEquals("Plain coffee", coffee.getDescription(), "Description should be 'Plain coffee'");

        // validating if the description is correct or not.
        assertTrue(coffee.getDescription().equals("Plain coffee"));
    }
    @Test
    public void testBasicCoffeeCost() {
        Coffee coffee = new BasicCoffee();
        assertEquals(2.00, coffee.getCost(), "Cost of basic coffee should be $2.00");
        assertTrue(coffee.getCost() == 2.00);
    }
    @Test
    public void testBasicCoffeeCalories() {
        Coffee coffee = new BasicCoffee();
        assertEquals(5, coffee.getCalories(), "Basic coffee should have 5 calories");
        // Assert that the calories are correct for basic coffee
        assertTrue(coffee.getCalories() == 5);
    }
}

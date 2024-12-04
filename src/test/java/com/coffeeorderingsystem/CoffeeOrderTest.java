package com.coffeeorderingsystem;

import com.coffeeorderingsystem.Component.Coffee;
import com.coffeeorderingsystem.ConcreteComponent.BasicCoffee;
import com.coffeeorderingsystem.ConcreteDecorator.MilkDecorator;
import com.coffeeorderingsystem.ConcreteDecorator.SoyMilkDecorator;
import com.coffeeorderingsystem.ConcreteDecorator.SugarDecorator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CoffeeOrderTest {

    // Test for Basic Coffee
    @Test
    void testBasicCoffeeDescription() {
        Coffee coffee = new BasicCoffee();
        assertEquals("Plain coffee", coffee.getDescription());
    }
    @Test
    void testBasicCoffeeCost() {
        Coffee coffee = new BasicCoffee();
        assertTrue(coffee.getCost() == 2.00);
    }
    // Test for Milk Decorator
    @Test
    void testMilkDecoratorDescription() {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        assertEquals("Plain coffee, Milk", coffee.getDescription());
    }

    @Test
    void testMilkDecoratorCost() {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        assertTrue(coffee.getCost() == 2.50);
    }
    // Test for Sugar Decorator
    @Test
    void testSugarDecoratorDescription() {
        Coffee coffee = new BasicCoffee();
        coffee = new SugarDecorator(coffee);
        assertEquals("Plain coffee, Sugar", coffee.getDescription());
    }
    @Test
    void testSugarDecoratorCost() {
        Coffee coffee = new BasicCoffee();
        coffee = new SugarDecorator(coffee);
        assertTrue(coffee.getCost() == 2.20);
    }
    // Test for Combined Decorators
    @Test
    void testCombinedDecoratorsDescription() {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        assertEquals("Plain coffee, Milk, Sugar", coffee.getDescription());
    }
    @Test
    void testCombinedDecoratorsCost() {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        assertTrue(coffee.getCost() == 2.70);
    }

    @Test
    void testSoyMilkDecorator() {
        Coffee coffee = new BasicCoffee();
        coffee = new SoyMilkDecorator(coffee);
        assertEquals("Plain coffee, Soy Milk", coffee.getDescription());
        assertTrue(coffee.getCost()==2.60);
    }

}

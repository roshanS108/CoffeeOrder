package com.coffeeorderingsystem.ConcreteDecorator;

import com.coffeeorderingsystem.AbstractDecorator.CoffeeDecorator;
import com.coffeeorderingsystem.BaseComponent.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50; // Additional cost for milk
    }

    @Override
    public int getCalories() {
        return + 55; // Calories for milk

    }
}


package com.coffeeorderingsystem.ConcreteDecorator;

import com.coffeeorderingsystem.DecoratorInterface.CoffeeDecorator;
import com.coffeeorderingsystem.Component.Coffee;

public class SizeDecorator extends CoffeeDecorator {
    private String size;

    public SizeDecorator(Coffee coffee, String size) {
        super(coffee);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + size + " Size";
    }

    @Override
    public double getCost() {
        switch (size.toLowerCase()) {
            case "medium":
                return super.getCost() + 0.50; // Extra cost for medium size
            case "large":
                return super.getCost() + 1.00; // Extra cost for large size
            default: // Small size by default
                return super.getCost();
        }
    }

    @Override
    public int getCalories() {
        switch (size.toLowerCase()) {
            case "medium":
                return super.getCalories() + 10; // Additional calories for medium
            case "large":
                return super.getCalories() + 20; // Additional calories for large
            default: // Small size by default
                return super.getCalories();
        }
    }
}


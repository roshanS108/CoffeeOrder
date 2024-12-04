package com.coffeeorderingsystem.ConcreteDecorator;

import com.coffeeorderingsystem.DecoratorInterface.CoffeeDecorator;
import com.coffeeorderingsystem.Component.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.20; // Additional cost for sugar
    }

    @Override
    public int getCalories() {
        return 55;
    }
}

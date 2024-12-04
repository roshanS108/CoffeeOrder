package com.coffeeorderingsystem.ConcreteDecorator;

import com.coffeeorderingsystem.DecoratorInterface.CoffeeDecorator;
import com.coffeeorderingsystem.Component.Coffee;

public class SoyMilkDecorator extends CoffeeDecorator {
    public SoyMilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Soy Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.60;
    }

    @Override
    public int getCalories() {
        return 55;
    }
}


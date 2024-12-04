package com.coffeeorderingsystem.AbstractDecorator;
import com.coffeeorderingsystem.BaseComponent.Coffee;


public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public int getCalories() {
        return coffee.getCalories(); // Delegate to the wrapped coffee
    }
}

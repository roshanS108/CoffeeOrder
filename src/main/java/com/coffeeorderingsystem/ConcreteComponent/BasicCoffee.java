package com.coffeeorderingsystem.ConcreteComponent;

import com.coffeeorderingsystem.Component.Coffee;


public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Plain coffee";
    }

    @Override
    public double getCost() {
        return 2.00; // Base price
    }

    @Override
    public int getCalories() {
        return 5; // Basic coffee has minimal calories
    }


}



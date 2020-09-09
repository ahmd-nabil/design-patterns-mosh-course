package com.nobel;

public class PepperoniPizza extends PizzaOrder{

    // take order
    // make pizza
    // cook pizza
    // deliver pizza
    // take money

    @Override
    protected void takeOrder() {
        System.out.println("Take Pepperoni Pizza Order");
    }

    @Override
    protected void makePizza() {
        System.out.println("Make Pepperoni Pizza ");
    }

}

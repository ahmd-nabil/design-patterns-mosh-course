package com.nobel;

public class MargheritaPizza extends PizzaOrder {
    @Override
    protected void takeOrder() {
        System.out.println("Take Margherita Pizza Order");

    }

    @Override
    protected void makePizza() {
        System.out.println("Make Margherita Pizza");
    }
}

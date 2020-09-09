package com.nobel;

public abstract class PizzaOrder {
    // take order
    // make pizza
    // cook pizza
    // deliver pizza
    // take money
    public void execute() {
        takeOrder();
        makePizza();
        cookPizza();
        deliverPizza();
        takeMoney();
        System.out.println("=================================================");
    }

    protected abstract void takeOrder();
    protected abstract void makePizza();

    private void cookPizza() {
        System.out.println("Cook Pizza");
    }

    private void deliverPizza() {
        System.out.println("Deliver Pizza");
    }

    private void takeMoney() {
        System.out.println("Take Money");
    }

}

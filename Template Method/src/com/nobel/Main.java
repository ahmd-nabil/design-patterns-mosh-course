package com.nobel;

public class Main {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.makeOrder(new PepperoniPizza());
        store.makeOrder(new MargheritaPizza());
    }
}

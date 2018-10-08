package com.java.examples.objectoriented.coffee;

public class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(menuItem);
    }
}

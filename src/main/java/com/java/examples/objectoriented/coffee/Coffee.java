package com.java.examples.objectoriented.coffee;

/**
 * http://woowabros.github.io/study/2016/07/07/think_object_oriented.html
 */
public class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }
}
